package com.smc.service;

import com.smc.entity.StockPriceEntity;
import com.smc.repository.CompanyRepository;
import com.smc.repository.StockPriceRepository;
import com.smc.utils.CommonResult;
import com.smc.utils.ResponseCode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepository;
	@Autowired
	private CompanyRepository companyRepository;

	/**
	 * insert excel data
	 */
	public CommonResult insert(List<StockPriceEntity> validDatas) {
		stockPriceRepository.saveAll(validDatas);
		String companyName = companyRepository
				.getCompanyNameByCode(validDatas.get(0).getCompanyCode());
		Map<String, String> map = new HashMap();
		map.put("record", String.valueOf(validDatas.size()));
		map.put("companyName", companyName);
		map.put("stockExchange", validDatas.get(0).getStockExchange());
		map.put("fromDate", validDatas.get(0).getDateTime());
		map.put("toDate",
				validDatas.get(validDatas.size() - 1).getDateTime());
		return CommonResult.build(ResponseCode.SUCCESS, "upload success!", map);
	}

}

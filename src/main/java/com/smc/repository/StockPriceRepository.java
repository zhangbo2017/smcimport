package com.smc.repository;

import com.smc.entity.StockPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author BoZhang
 * E-mail:dlzbo@cn.ibm.com
 * @version date：May 12, 2020 7:51:04 PM
*/
public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Integer> {

}


package com.smc.repository;

import com.smc.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 * @author BoZhang
 * E-mail:dlzbo@cn.ibm.com
 * @version date：May 12, 2020 7:50:57 PM
*/
public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {

	@Query(name = "getCompanyNameByCode", nativeQuery = true, value = "SELECT companyname from company where companycode = :companyCode")
	String getCompanyNameByCode(String companyCode);
}


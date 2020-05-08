package com.smc.repository;

import com.smc.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {

	@Query(name = "getCompanyNameByCode", nativeQuery = true, value = "SELECT companyname from company where companycode = :companyCode")
	String getCompanyNameByCode(String companyCode);
}


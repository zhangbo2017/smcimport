package com.smc.repository;

import com.smc.entity.StockPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Integer> {

}


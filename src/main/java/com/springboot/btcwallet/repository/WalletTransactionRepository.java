package com.springboot.btcwallet.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.btcwallet.entity.WalletTransaction;

@Repository
public interface WalletTransactionRepository extends JpaRepository<WalletTransaction, Long>{
	
	List<WalletTransaction> findBydatetimeBetween(Date startDate, Date endDate);

}

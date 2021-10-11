package com.springboot.btcwallet.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.btcwallet.entity.WalletTransaction;
import com.springboot.btcwallet.model.WalletTransactionDTO;
import com.springboot.btcwallet.repository.WalletTransactionRepository;
import com.springboot.btcwallet.utils.Utilities;

@RestController
@RequestMapping("/wallet")
public class WalletReadController {
	
	private static final Logger logger = LoggerFactory.getLogger(WalletReadController.class);

	@Autowired
	private WalletTransactionRepository walletTransactionRepository;

	@PostMapping("/getWalletTransactionHistory")
	public ResponseEntity<List<WalletTransaction>> persistWalletTransactionHistory(
			@RequestBody WalletTransactionDTO walletTransactionDTO) {
		logger.info("@@@ getWalletTransactionHistory :: Started");
		return ResponseEntity.ok(
				walletTransactionRepository.findBydatetimeBetween(Utilities.dateFormat(walletTransactionDTO.getStartDatetime()),
						Utilities.dateFormat(walletTransactionDTO.getEndDatetime())));
	}



}

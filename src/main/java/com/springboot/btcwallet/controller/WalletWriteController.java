package com.springboot.btcwallet.controller;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.btcwallet.entity.WalletTransaction;
import com.springboot.btcwallet.repository.WalletTransactionRepository;

@RestController
@RequestMapping("/wallet")
@Transactional
public class WalletWriteController {
	
	private static final Logger logger = LoggerFactory.getLogger(WalletWriteController.class);
	
	@Autowired
	private WalletTransactionRepository walletTransactionRepository;
	
	@PostMapping("/postTransaction")
	public ResponseEntity<Optional<WalletTransaction>> persistWalletTransaction(@Valid @RequestBody WalletTransaction walletTransaction) {
		logger.info("@@@ postTransaction :: Started");
		WalletTransaction walletTransactionEntity = walletTransactionRepository.saveAndFlush(walletTransaction);	
		return ResponseEntity.ok(walletTransactionRepository.findById(walletTransactionEntity.getId()));
	}

}

package com.springboot.btcwallet;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.btcwallet.entity.WalletTransaction;
import com.springboot.btcwallet.repository.WalletTransactionRepository;
import com.springboot.btcwallet.utils.Utilities;

@SpringBootApplication
public class SpringbootBtcWalletApplication implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(SpringbootBtcWalletApplication.class);

	@Autowired
	private WalletTransactionRepository walletTransactionRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBtcWalletApplication.class, args);
		logger.info("Info : Started Application..!! ");
		logger.error("Error : Started Application..!!");
		logger.debug("Debug : Started Application..!!!");	
	}

	@Override
	public void run(String... args) throws Exception {
		walletTransactionRepository.saveAndFlush(new WalletTransaction(Utilities.dateFormat("2019-10-05T13:00:00+00:00"),new BigDecimal("1000")));
		walletTransactionRepository.saveAndFlush(new WalletTransaction(Utilities.dateFormat("2019-10-05T14:00:00+00:00"),new BigDecimal("1001.1")));		
	}

}

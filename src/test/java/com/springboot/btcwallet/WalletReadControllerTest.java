package com.springboot.btcwallet;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.springboot.btcwallet.entity.WalletTransaction;
import com.springboot.btcwallet.repository.WalletTransactionRepository;
import com.springboot.btcwallet.utils.Utilities;

@SpringBootTest(classes = SpringbootBtcWalletApplication.class)
public class WalletReadControllerTest {

	@Autowired
	private WalletTransactionRepository walletTransactionRepository;

	@Test
	@DirtiesContext
	public void persistWalletTransactionHistory() {
		walletTransactionRepository.saveAndFlush(
				new WalletTransaction(Utilities.dateFormat("2019-10-05T13:00:00+00:00"), new BigDecimal("1000")));
	}

}

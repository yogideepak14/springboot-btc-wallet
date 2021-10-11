package com.springboot.btcwallet.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springboot.btcwallet.controller.WalletReadController;

public class Utilities {
	
	private static final Logger logger = LoggerFactory.getLogger(WalletReadController.class);

	public static Date dateFormat(String dateInput){
		DateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = null;
		try {
			date = dateParser.parse(dateInput);
		} catch (ParseException e) {
			logger.error("Parsing exception : {} ", e);
		}
		return date;
	}
}

package com.springboot.btcwallet.model;

public class WalletTransactionDTO {
	
	private String startDatetime;
	private String endDatetime;
	
	public WalletTransactionDTO() {
	}
	
	public WalletTransactionDTO(String startDatetime, String endDatetime) {
		super();
		this.startDatetime = startDatetime;
		this.endDatetime = endDatetime;
	}
	public String getStartDatetime() {
		return startDatetime;
	}
	public void setStartDatetime(String startDatetime) {
		this.startDatetime = startDatetime;
	}
	public String getEndDatetime() {
		return endDatetime;
	}
	public void setEndDatetime(String endDatetime) {
		this.endDatetime = endDatetime;
	}
	

}

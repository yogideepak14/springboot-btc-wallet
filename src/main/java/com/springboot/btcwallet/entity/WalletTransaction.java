package com.springboot.btcwallet.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class WalletTransaction {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "datetime")
	private Date datetime;
	
	@Column(name = "amount")
	@DecimalMin( value = "0.01", message ="too small")
	@DecimalMax( value = "99999999999", message ="too big")
	@Digits( integer=12, fraction=2, message = "bad format")
	private BigDecimal amount;	
	

	public WalletTransaction() {
	}

	public WalletTransaction(Date datetime, BigDecimal amount) {
		super();
		this.datetime = datetime;
		this.amount = amount;
	}


	@JsonIgnore
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}

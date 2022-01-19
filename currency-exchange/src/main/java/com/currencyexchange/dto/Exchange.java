package com.currencyexchange.dto;

import org.springframework.stereotype.Component;

@Component
public class Exchange {
	private String from;
	private String to;
	private int amount;
	private int calculatedExchange;
	
	public Exchange() {
		
	}
	public Exchange(String from, String to, int amount, int calculatedExchange) {
		super();
		this.from = from;
		this.to = to;
		this.amount = amount;
		this.calculatedExchange = calculatedExchange;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCalculatedExchange() {
		return calculatedExchange;
	}
	public void setCalculatedExchange(int calculatedExchange) {
		this.calculatedExchange = calculatedExchange;
	}
}

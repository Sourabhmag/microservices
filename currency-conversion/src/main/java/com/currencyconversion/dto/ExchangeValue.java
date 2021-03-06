package com.currencyconversion.dto;

public class ExchangeValue {
	private int id;
	private String from;
	private String to;
	private int conversionMultiple;
	private int port;
	
	public ExchangeValue() {
		
	}
	

	public ExchangeValue(int id, String from, String to, int conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public int getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public int getConversionMultiple() {
		return conversionMultiple;
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}

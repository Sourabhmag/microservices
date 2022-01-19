package com.currencyconversion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currencyconversion.dto.ExchangeValue;

@RestController
public class ConversionController {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue
		(@PathVariable String from, @PathVariable String to){
		
		ExchangeValue exchangeValue = new ExchangeValue(1234, from, to, 75);
		
		exchangeValue.setPort(10000);
		
		return exchangeValue;
	}
}

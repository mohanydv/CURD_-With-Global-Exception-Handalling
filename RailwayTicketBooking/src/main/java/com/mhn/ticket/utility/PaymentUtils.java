package com.mhn.ticket.utility;

import java.util.HashMap;
import java.util.Map;

import com.mhn.ticket.exception.InsuficientAmmountException;

public class PaymentUtils {

	private static Map<String, Double> paymentMap = new HashMap<>();
	static {
		paymentMap.put("account1", 1000.0);
		paymentMap.put("account2", 5000.0);
		paymentMap.put("account3", 25000.0);
		paymentMap.put("account4", 90000.0);
		paymentMap.put("account5", 10005.0);

	}

	public static boolean validateCreditLimit(String accoNo, Double paidAmount) 
	{
		if(paidAmount>paymentMap.get(accoNo))
		{
			
			throw new InsuficientAmmountException("your account does not have sufficent balance to make this payment");
		}else {
			return true;
		}
		
		
		
		
	}


}

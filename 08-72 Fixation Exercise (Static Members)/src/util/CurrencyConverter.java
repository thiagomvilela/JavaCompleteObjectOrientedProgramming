package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double dollarToReal(double dollarPrice, double dollarBough){
		return dollarPrice * dollarBough * IOF;
	}
	
}

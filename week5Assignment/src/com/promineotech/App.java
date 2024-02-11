package com.promineotech; // package

public class App { //class

	public static void main(String[] args) { //main method
		Logger asterisk = new AsteriskLogger(); //instantiates a logger of the class AsteriskLogger
		asterisk.log("Hello"); //passes string hello into logger
		
		System.out.println(); //prints space between lines
		
		Logger error = new AsteriskLogger(); //instantiates a logger of the class AsteriskLogger
		asterisk.error("WARNING"); //passes string WARNING into logger
		
		System.out.println(); //prints space between lines

		Logger asteriskSpaced = new SpacedLogger(); //instantiates a logger of the class SpacedLogger
		asteriskSpaced.log("Hello"); //passes string hello into logger
		
		System.out.println(); //prints space between lines
		
		Logger errorSpaced = new SpacedLogger(); //instantiates a logger of the class SpacedLogger
		asteriskSpaced.error("WARNING"); //passes string WARNING into logger
		
		System.out.println(); //prints space between lines
	}

}



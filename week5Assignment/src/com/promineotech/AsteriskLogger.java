package com.promineotech;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		String asterisk = "*";
		int asteriskLineLength = 0;
		StringBuilder asteriskLine = new StringBuilder(asteriskLineLength);
		for (int i = 0; i < (log.length() + 6); i++ ) {
			asteriskLine.append(asterisk);
		}
		
		System.out.println(asteriskLine);
		System.out.println("***" + log + "***");
		System.out.println(asteriskLine);
	}

	@Override
	public void error(String error) {
		String asterisk = "*";
		int asteriskLineLength = 0;
		StringBuilder asteriskLine = new StringBuilder(asteriskLineLength);
		for (int i = 0; i < (error.length() + 6); i++ ) {
			asteriskLine.append(asterisk);
		}
		
		System.out.println(asteriskLine);
		System.out.println("***" + error + "***");
		System.out.println(asteriskLine);
		
	}


}




/*
Implement the AsteriskLogger methods:  

Note:  The AsteriskLogger will use the asterisk or "*".


a.  The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).

b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:

****************

***Error: Hello***

****************
*/

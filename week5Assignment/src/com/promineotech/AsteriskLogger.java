package com.promineotech;
public class AsteriskLogger implements Logger{ // implements logger.
	@Override // auto generated getters / setters.
	public void log(String log) { // instantiates log method from logger.
		String asterisk = "*"; // creates string = *
		int asteriskLineLength = 0; //creates int to hold the length the asterisk lines will need to be.
		StringBuilder asteriskLine = new StringBuilder(asteriskLineLength); // instatiates a string builder to build asterisk line.
		for (int i = 0; i < (log.length() + 6); i++ ) { //loop to run through each character in passed in string.
			asteriskLine.append(asterisk); // appends string build asterisk line with asterisk each iteration of the loop.
		}
		
		System.out.println(asteriskLine); // print asterisk line to console.
		System.out.println("***" + log + "***"); // print  log encapulated by 3 asterisks on each side to console
		System.out.println(asteriskLine); // print asterisk line to console.
	}
	@Override // auto generated getters / setters.
	public void error(String error) { // instantiates error method from logger.
		String asterisk = "*"; // creates string = *
		int asteriskLineLength = 0;//creates int to hold the length the asterisk lines will need to be.
		StringBuilder asteriskLine = new StringBuilder(asteriskLineLength); // instatiates a string builder to build asterisk line.
		for (int i = 0; i < (error.length() + 6); i++ ) { //loop to run through each character in passed in string.
			asteriskLine.append(asterisk); // appends string build asterisk line with asterisk each iteration of the loop.
		}
		
		System.out.println(asteriskLine); // print asterisk line to console.
		System.out.println("***" + error + "***"); // print  error encapulated by 3 asterisks on each side to console
		System.out.println(asteriskLine); // print asterisk line to console.
		
	}
}

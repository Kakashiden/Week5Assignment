package com.promineotech;
public class SpacedLogger implements Logger{
@Override // auto generated getters / setters.
public void log(String log) { // instantiates log method from logger.
	
	StringBuilder logSpaced = new StringBuilder(); // instatiates a string builder to build passed in string with spaces.
	for (int i = 0; i < log.length() - 1; i++) { //For loop to run through passed in string
		logSpaced.append(log.charAt(i)); //adds character at index value
		logSpaced.append(" "); //adds space to string after each char
	}
	
		logSpaced.append(log.charAt(log.length() -1)); //adds last character of passed string to new string outside loop so no space is added at the end
	
	String asterisk = "*"; // creates string = *
	int asteriskLineLength = 0; //creates int to hold the length the asterisk lines will need to be.
	StringBuilder asteriskLine = new StringBuilder(asteriskLineLength); // instatiates a string builder to build asterisk line.
	for (int i = 0; i < (logSpaced.length() + 6); i++ ) { //loop to run through each character in passed in string.
		asteriskLine.append(asterisk); // appends string build asterisk line with asterisk each iteration of the loop.
	}
	
	System.out.println(asteriskLine); // print asterisk line to console.
	System.out.println("***" + logSpaced + "***"); // print  log encapulated by 3 asterisks on each side to console
	System.out.println(asteriskLine); // print asterisk line to console.
}
@Override // auto generated getters / setters.
public void error(String error) { // instantiates error method from logger.
	
	StringBuilder errorSpaced = new StringBuilder(); // instatiates a string builder to build passed in string with spaces.
	for (int i = 0; i < error.length() -1 ; i++) { //For loop to run through passed in string
		errorSpaced.append(error.charAt(i)); //adds character at index value
		errorSpaced.append(" "); //adds space to string after each char
	}
		errorSpaced.append(error.charAt(error.length() - 1)); //adds last character of passed string to new string outside loop so no space is added at the end
	
	String asterisk = "*"; // creates string = *
	int asteriskLineLength = 0; //creates int to hold the length the asterisk lines will need to be.
	StringBuilder asteriskLine = new StringBuilder(asteriskLineLength); // instatiates a string builder to build asterisk line.
	for (int i = 0; i < (errorSpaced.length() + 6); i++ ) { //loop to run through each character in passed in string.
		asteriskLine.append(asterisk);// appends string build asterisk line with asterisk each iteration of the loop.
	}
	
	System.out.println(asteriskLine); // print asterisk line to console.
	System.out.println("***" + errorSpaced + "***"); // print  error encapulated by 3 asterisks on each side to console
	System.out.println(asteriskLine); // print asterisk line to console.
}
}

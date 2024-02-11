package com.promineotech;

public class SpacedLogger implements Logger{

@Override
public void log(String log) {
	
	StringBuilder logSpaced = new StringBuilder();
	for (int i = 0; i < log.length() - 1; i++) {
		logSpaced.append(log.charAt(i));
		logSpaced.append(" ");
	}
	
		logSpaced.append(log.charAt(log.length() -1));
	
	String asterisk = "*";
	int asteriskLineLength = 0;
	StringBuilder asteriskLine = new StringBuilder(asteriskLineLength);
	for (int i = 0; i < (log.length() + 6 + log.length() - 1); i++ ) {
		asteriskLine.append(asterisk);
	}
	
	System.out.println(asteriskLine);
	System.out.println("***" + logSpaced + "***");
	System.out.println(asteriskLine);
}

@Override
public void error(String error) {
	
	StringBuilder errorSpaced = new StringBuilder();
	for (int i = 0; i < error.length() -1 ; i++) {
		errorSpaced.append(error.charAt(i));
		errorSpaced.append(" ");
	}
		errorSpaced.append(error.charAt(error.length() - 1));
	
	String asterisk = "*";
	int asteriskLineLength = 0;
	StringBuilder asteriskLine = new StringBuilder(asteriskLineLength);
	for (int i = 0; i < (errorSpaced.length() + 6); i++ ) {
		asteriskLine.append(asterisk);
	}
	
	System.out.println(asteriskLine);
	System.out.println("***" + errorSpaced + "***");
	System.out.println(asteriskLine);
}

}
/*
Implement the SpacedLogger methods:

Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.


a. If the log method received “Hello” as an argument, it should print H e l l o

b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)

*/

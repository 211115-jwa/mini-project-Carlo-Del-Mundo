package com.revature.util;

public class Util {

	/// This function generates the html page for the List of cars parked in the parking lot.
	public static String generateHTML(String body) {
		StringBuilder result = new StringBuilder();						//builds the html page on a String.
		String NEW_LINE = System.getProperty("line.separator");			//creates a new line that is compatible with any OS
		
		result.append("<!DOCTYPE html>").append(NEW_LINE);
		result.append("<html>").append(NEW_LINE);
		result.append("<head>").append(NEW_LINE);
		result.append("</head>").append(NEW_LINE);
		result.append("<body>").append(NEW_LINE);
		result.append("<div class='Box'>").append(NEW_LINE);
		result.append(body).append(NEW_LINE);;
		result.append("</div>").append(NEW_LINE);
		result.append("</body>").append(NEW_LINE);
		result.append("</html>").append(NEW_LINE);
		
		return result.toString();
	}
	
}

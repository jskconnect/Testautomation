package org.jpmc.newsvalidation.common;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Utilities {
	
	public static boolean isTextvalid(String strnewsmatch) throws Exception {
		
		return strnewsmatch.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$");
	}

	
	public static boolean isTextMatches(String strnewsmatch) throws Exception {
	
		String regex = "^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$";
		Pattern p = Pattern.compile(regex);
		if(strnewsmatch==null){		
		return false;
		}
		Matcher m = p.matcher(strnewsmatch);
		System.out.println("News Match output from External Source : " + m.matches());
		return m.matches();
	}

	public static void openNewTab() throws Exception {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	

	
}

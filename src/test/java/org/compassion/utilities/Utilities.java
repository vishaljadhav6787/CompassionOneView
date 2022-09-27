package org.compassion.utilities;

import java.io.IOException;

public class Utilities {
	public static void hardWait(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (InterruptedException e) {
			
		}
	}
	
	public static void terminateDriverInstances() {
		try {
			
			Runtime.getRuntime().exec("taskkill /IM /F chromedriver.exe");
		} catch (IOException e) {
			
		}
	}
}

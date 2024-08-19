package com.juaracoding.tafuadywebhadir.tugasakhir.connectivity.driver;

import com.juaracoding.tafuadywebhadir.tugasakhir.connectivity.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {

	@Override
	public WebDriver setStrategy() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		options.addArguments("use-fake-ui-for-media-stream");
		
		return new ChromeDriver(options);
	}
	
}

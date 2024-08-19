package com.juaracoding.tafuadywebhadir.tugasakhir.connectivity.driver;

import com.juaracoding.tafuadywebhadir.tugasakhir.connectivity.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer implements DriverStrategy {

	@Override
	public WebDriver setStrategy() {
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		
		return driver;
	}

}

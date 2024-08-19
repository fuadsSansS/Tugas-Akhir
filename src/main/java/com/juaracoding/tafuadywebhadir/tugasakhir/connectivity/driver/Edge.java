package com.juaracoding.tafuadywebhadir.tugasakhir.connectivity.driver;

import com.juaracoding.tafuadywebhadir.tugasakhir.connectivity.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

	public class Edge implements DriverStrategy {
		@Override
		public WebDriver setStrategy() {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("use-fake-ui-for-media-stream");

			return new EdgeDriver(options);

		}
	}
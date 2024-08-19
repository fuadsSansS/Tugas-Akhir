package com.juaracoding.tafuadywebhadir.tugasakhir.connectivity.driver;

import com.juaracoding.tafuadywebhadir.tugasakhir.connectivity.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox implements DriverStrategy {

	@Override
	public WebDriver setStrategy() {
		WebDriverManager.firefoxdriver().setup();

		// Konfigurasi Firefox agar mengizinkan akses kamera
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("media.navigator.permission.disabled", true);
		options.addPreference("media.navigator.streams.fake", true);

		return new FirefoxDriver(options);
	}
	
}

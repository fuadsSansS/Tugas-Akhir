package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

//
import com.juaracoding.tafuadywebhadir.tugasakhir.connectivity.DriverSingleton;
import com.juaracoding.tafuadywebhadir.tugasakhir.scenariomapping.LoginTesting;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Test1Hooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports(GlobalFunction.rootProject+"/"+GlobalFunction.extendReportName +"-main/extentreport/login.html");
	private static LoginTesting[] tests = LoginTesting.values();
	private static final int[] DATA_OUTLINE = {

//			1,//TLPA001 Valid Login
//			1,//TLNA002 Login Dengan Email Dan Password Kosong
//			1,//TLNA003 Login Dengan Email Tidak Valid
//			1,//TLNA004 Login Dengan Password Tidak Valid
//			1,//TLNA005 Login Dengan Format Email Yang Salah Tidak Valid
//			1,//TLPU011 Valid login user
//			1,//TLNU012 Login dengan email dan password kosong
//			1,//TLNU013 Login Dengan Email Tidak Valid
//			1,//TLNU014 Login Dengan Password Tidak Valid
//			1,//TLNU015 Login Dengan Format Email Yang Salah
			1,
			1,
			1,
			1,
			1,

	};
	private String testReport = "";
	
	@Before
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[GlobalFunction.testCount].getTestName();
		extentTest = reports.startTest(testReport);
		if(GlobalFunction.countOutline==DATA_OUTLINE[GlobalFunction.testCount])
		{
			GlobalFunction.countOutline=0;
			GlobalFunction.testCount++;
		}
		GlobalFunction.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = GlobalFunction.getScreenshot(driver, GlobalFunction.extendReportName +scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	@AfterAll
	public static void closeBrowser() {
		GlobalFunction.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		DriverSingleton.closeObjectInstance();
	}
}
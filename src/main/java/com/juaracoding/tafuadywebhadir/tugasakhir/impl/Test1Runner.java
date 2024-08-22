package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/features/001LoginPositifAdmin.feature",
		"src/main/resources/features/002LoginNegatifAdmin.feature",
		"src/main/resources/features/011LoginPositifUser.feature",
		"src/main/resources/features/012LoginNegatifUser.feature",
		"src/main/resources/features/021RegistrasiPositifUserMandiri.feature",
		"src/main/resources/features/023RegistrasiNegatif.feature",
		"src/main/resources/features/031TambahKalender.feature",
		"src/main/resources/features/035EditKalender.feature",
		"src/main/resources/features/033TambahKalenderNegatif.feature",
		"src/main/resources/features/050TambahClientUpliner.feature",


		},
glue = "com.juaracoding.tafuadywebhadir.tugasakhir.impl",
monochrome=true,
plugin = {"pretty","html:ujian6-report/extentreport/ujian6.json",
		"json:ujian6-report/extentreport/ujian6.json",
		"junit:ujian6-report/extentreport/ujian6.xml"})
public class Test1Runner extends AbstractTestNGCucumberTests{}
package com.bot.frontend.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;


@CucumberOptions(
		features={"src//main//resources//features"},
		glue={"com.bot.frontend.helpers",
				"com.bot.frontend.steps"},
		plugin = {"pretty", "html:target/cucumber"},
		tags = {"@LoginFb"},
		monochrome = true
	)

@Test
public class RunTest extends AbstractTestNGCucumberTests{

}

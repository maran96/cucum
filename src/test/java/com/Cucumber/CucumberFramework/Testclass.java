package com.Cucumber.CucumberFramework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Requirements/homepage.feature", glue = "stepsdefinition", dryRun = false)

public class Testclass {

}

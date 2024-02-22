package com.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features="./OrangeHRM_Cucumber",glue="./src/test/java/com/StepDefinition",monochrome=true)
                  





public class TestRunner {

}

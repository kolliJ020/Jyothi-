package com.StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./OrangeHRM/OrangeHRM.feature",
glue="com.StepDefinition",
monochrome=true
,publish=true
		  
 )
public class TestRunner {

}

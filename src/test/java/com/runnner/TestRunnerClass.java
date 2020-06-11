package com.runnner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\feature"},glue= {"com.stepdefinition"},monochrome=true)
public class TestRunnerClass {

}

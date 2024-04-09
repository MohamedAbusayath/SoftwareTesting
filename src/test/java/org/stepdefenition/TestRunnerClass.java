package org.stepdefenition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.stepdefenition",monochrome = false)
public class TestRunnerClass {

}

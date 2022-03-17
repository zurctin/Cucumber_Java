package StepDefinitions;

import org.junit.runner.RunWith;  //for RunWith
import io.cucumber.junit.Cucumber;    ////for RunWith class then click enter
import io.cucumber.junit.CucumberOptions; // for CucumberOptions

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags",
glue={"StepDefinitions"},
tags={"@regression and @smoke"})     //OR, AND can be used

public class TestRunner_RunWithSingleTag {

}

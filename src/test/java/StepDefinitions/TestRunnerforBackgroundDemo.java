package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Background Demo", glue={"StepDefinitions"},
monochrome= true,      //for console format, default value is false
plugin={"pretty", "json:target/JsonReport/report.json", //json needs to manually create folder
"html:target/HTMLReport",								//html automatically creates folder
"junit:target/JunitReport/report.xml"})					//junit needs to manually create folder) 

public class TestRunnerforBackgroundDemo {

 
	
}

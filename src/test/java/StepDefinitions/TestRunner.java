package StepDefinitions;

import org.junit.runner.RunWith;  //for RunWith
import io.cucumber.junit.Cucumber;    ////for RunWith class then click enter
import io.cucumber.junit.CucumberOptions; // for CucumberOptions



@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
monochrome= true,      //for console format, default value is false
plugin={"pretty", "json:target/JsonReport/report.json", //json needs to manually create folder
"html:target/HTMLReport",								//html automatically creates folder
"junit:target/JunitReport/report.xml"}					//junit needs to manually create folder

//tags = "@smokefeature"     //optional for filter purposes

)  

public class TestRunner {

}

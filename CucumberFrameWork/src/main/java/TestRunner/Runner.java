package TestRunner;


import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Murali Folder\\Selenium Tool\\WorkSpace\\CucumberFrameWork\\src\\main\\java\\features",
glue={"StepDefinition"},
format = {"pretty","html:test-output"}
)

public class Runner 				
{		

}
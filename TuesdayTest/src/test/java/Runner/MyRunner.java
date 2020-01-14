package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\training_d2.03.07\\eclipse_workspace\\maneef123\\TuesdayTest\\src\\test\\java\\stepDefination\\credentials.java", glue = "stepDefination" )
public class MyRunner {

}

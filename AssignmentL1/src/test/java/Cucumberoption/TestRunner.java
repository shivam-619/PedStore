package Cucumberoption;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features",glue="stepDefination",plugin= {"html:target/report.html"})

public class TestRunner extends AbstractTestNGCucumberTests{
	

}

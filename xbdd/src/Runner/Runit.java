package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:\\Users\\vicky\\git\\NewOne\\xbdd\\features\\FacebookLogin.feature",glue= {"C:\\Users\\vicky\\git\\NewOne\\xbdd\\src\\StepDefinition\\stepit.java"})
public class Runit {

}

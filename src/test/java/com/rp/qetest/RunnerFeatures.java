package com.rp.qetest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/realPageTest.feature", tags="@runAll")
//@CucumberOptions(features ="src/test/resources/features/ColorLib/")
//@CucumberOptions(features ="src/test/resources/features/historiaPrueba.feature", tags= "@us2")
public class RunnerFeatures {

}

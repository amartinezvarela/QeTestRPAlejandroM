package com.rp.qetest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
//@CucumberOptions (features = "src/test/resources/features/Nombre.feature", tags = "@Critico")
@CucumberOptions (features = "src/test/resources/features/colorlib/Forms/stoy1/historiaPrueba.feature")
class RunnerTags {

}
package com.bdd.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"html:target/build/cucumber-html-report", "pretty:target/build/cucumber-pretty.txt",
            "json:target/build/cucumber.json"},
            junit = {"--step-notifications"},
            features = {"src/test/resources/web"},
            glue = {"com.bdd"},

        /*INSTRUCCIONES PARA EJECUTAR LOS ESCENARIOS*/

        /*PARA EJECUTAR EL PRIMER ESCENARIO COMENTAR EL ESCENARIO2 DE LOS SIGUIENTES TAG
        PARA EJECUTAR EL SEGUNDO ESCENARIO COMENTAR EL ESCENARIO1 DE LOS SIGUIENTES TAG*/


            tags = {"@ESCENARIO_SISTEMAFIXED_01_PARAMETRIZADOS"}     //ESCENARIO1
            //tags = {"@ESCENARIO_SISTEMAFIXED_02_PARAMETRIZADOS"}      //ESCENARIO2
)

public class RunnerTest {
}

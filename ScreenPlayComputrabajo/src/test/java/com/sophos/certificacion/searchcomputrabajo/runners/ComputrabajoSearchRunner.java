package com.sophos.certificacion.searchcomputrabajo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)//Ejecuta el test y genera el informe
@CucumberOptions(//cucumberOptions-> Que es lo que vamos a ejecutar
		features="src/test/resources/features/computrabajo_search.feature", 
		glue="com.sophos.certificacion.searchcomputrabajo.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)
public class ComputrabajoSearchRunner {

}

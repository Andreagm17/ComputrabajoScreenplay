package com.sophos.certificacion.searchcomputrabajo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.sophos.certificacion.searchcomputrabajo.model.SearchModel;
import com.sophos.certificacion.searchcomputrabajo.questions.ComputrabajoResult;
import com.sophos.certificacion.searchcomputrabajo.tasks.ConsultInThe;
import com.sophos.certificacion.searchcomputrabajo.tasks.OpenTheBrowser;
import com.sophos.certificacion.searchcomputrabajo.userinterfaces.ComputrabajoSearchPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ComputrabajoSearchStepDefinition {
	
	//Hará uso del driver que se encuentra en la raiz del proyecto
	@Managed(driver= "chrome") 
	private WebDriver herBrowser;
	
	private Actor andrea = Actor.named("Andrea");
	
	private ComputrabajoSearchPage ComputrabajoSearchPage;
	
	//Cada vez que el actor acceda a la web utiliza este navegador
	@Before
	public void setUp(){
		andrea.can(BrowseTheWeb.with(herBrowser));
	}
	
	//Precondiciones
	@Given("^that Andrea wants to enter computrabajo to search for offers\\.$")
	public void thatAndreaWantsToEnterComputrabajoToSearchForOffers() {
		andrea.wasAbleTo(OpenTheBrowser.on(ComputrabajoSearchPage));
	}

	//Condiciones	
	@When("^you enter the information$")
	public void youEnterTheInformation(List<SearchModel> Profession) {
		andrea.attemptsTo(ConsultInThe.fields(Profession.get(0)));
	}
	
	//Poscondiciones
	@Then("^you should see all related offers\\.$")
	public void youShouldSeeAllRelatedOffers() {
	    andrea.should(seeThat(ComputrabajoResult.page()));
	}
}

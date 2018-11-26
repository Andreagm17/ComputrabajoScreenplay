package com.sophos.certificacion.searchcomputrabajo.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophos.certificacion.searchcomputrabajo.userinterfaces.QueryFieldsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PageVisible implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		 return the(QueryFieldsPage.BUTTON_SEARCH).answeredBy(actor).isCurrentlyVisible();
	}
	
	//Constructor
	public static PageVisible page() {
		return new PageVisible();
	}

	public static Question<Boolean> isVisible() {
		return new PageVisible();
	}

}

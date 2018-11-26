package com.sophos.certificacion.searchcomputrabajo.tasks;

import com.sophos.certificacion.searchcomputrabajo.model.SearchModel;
import com.sophos.certificacion.searchcomputrabajo.userinterfaces.QueryFieldsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class ConsultInThe implements Task {

	private SearchModel searchModel;
	
	//Método contructor
	public ConsultInThe(SearchModel searchModel) {
		this.searchModel = searchModel;
	}

	@Override
	// {0} representa la varialble actor
	@Step("{0} enter information to consult options")
	//En este método van todas las interacciones o acciones
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(searchModel.getArea()).into(QueryFieldsPage.AREA_TEXTBOX));
		actor.attemptsTo(SelectFromOptions.byVisibleText(searchModel.getPlace()).from(QueryFieldsPage.PLACE_TEXTBOX));
		actor.attemptsTo(Click.on(QueryFieldsPage.BUTTON_SEARCH));
		}

	public static ConsultInThe fields(SearchModel searchModel) {
		return Tasks.instrumented(ConsultInThe.class, searchModel);
	}

}

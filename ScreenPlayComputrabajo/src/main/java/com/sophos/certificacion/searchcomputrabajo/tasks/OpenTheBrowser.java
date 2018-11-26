package com.sophos.certificacion.searchcomputrabajo.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.certificacion.searchcomputrabajo.exceptions.ConnectionFailed;
import com.sophos.certificacion.searchcomputrabajo.questions.PageVisible;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;


public class OpenTheBrowser implements Task{
	
	private PageObject page;
	
	//Método constructor
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} open the browser en computrabajoSearchPage")
	//En este método van todas las interacciones o acciones
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		actor.should(seeThat(PageVisible.isVisible()).orComplainWith(ConnectionFailed.class,
				getConnectionFailed()));
	}
	
	//Método que inicializa la instancia
	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}
	
	//Retorna un mensaje de error al no haber conexión
	public String getConnectionFailed() {
		return String.format(ConnectionFailed.getConnectionFailed());
	}

}

package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.userinterface.EnterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static bancolombiaPageAutomation.userinterface.EnterPage.*;

public class SelectingOptions implements Task {

    private EnterPage enterPage;

    public static SelectingOptions toContinue() {
        return Tasks.instrumented(SelectingOptions.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_PRODUCTS_AND_SERVICES),
                Click.on(SELECT_OPTION_LEASING),
                Click.on(SELECT_HOUSING_LEASING_OPTION),
                Click.on(SELECT_SIMULATED_OPTION),
                Click.on(BUTTON_HOME_VALUE)
        );
        
    }
}

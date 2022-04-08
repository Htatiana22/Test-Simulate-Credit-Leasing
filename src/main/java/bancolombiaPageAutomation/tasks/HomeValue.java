package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.userinterface.EnterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class HomeValue implements Task {
    private EnterPage enterPage;

    public static HomeValue clickOption() {
        return Tasks.instrumented(HomeValue.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EnterPage.BUTTON_HOME_VALUE)
        );

    }
}

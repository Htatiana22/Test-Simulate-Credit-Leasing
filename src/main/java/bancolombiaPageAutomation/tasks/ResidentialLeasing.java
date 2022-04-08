package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.userinterface.EnterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ResidentialLeasing implements Task {
    private EnterPage enterPage;

    public static ResidentialLeasing onClick() {
        return Tasks.instrumented(ResidentialLeasing.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EnterPage.SELECT_HOUSING_LEASING_OPTION)
        );

    }
}

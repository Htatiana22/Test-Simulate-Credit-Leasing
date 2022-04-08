package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.userinterface.EnterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Leasing implements Task {
    private EnterPage enterPage;

    public static Leasing selectOption() {
        return Tasks.instrumented(Leasing.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EnterPage.SELECT_OPTION_LEASING)
        );

    }
}

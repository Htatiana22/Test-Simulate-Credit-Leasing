package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.userinterface.EnterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Simulate implements Task {
    private EnterPage enterPage;

    public static Simulate theOption() {
        return Tasks.instrumented(Simulate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EnterPage.SELECT_SIMULATED_OPTION)
        );
        
    }
}

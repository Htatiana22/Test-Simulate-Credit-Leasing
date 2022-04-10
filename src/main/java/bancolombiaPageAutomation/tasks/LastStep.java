package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.userinterface.SimulationResult;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static bancolombiaPageAutomation.userinterface.SimulationResult.*;

public class LastStep implements Task {
    private SimulationResult simulationResult;

    public static LastStep toEnd() {
        return Tasks.instrumented(LastStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_RESIDENTIAL_LEASING),
                Click.on(SELECT_RATES_AND_FEES)
        );
    }
}

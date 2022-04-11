package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.Utils.Wait;
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

        Wait.Time(2000);
        System.out.println(FIXED_FEE_TITLE.resolveFor(actor).getText() + " " + FIXED_RATE_FIXED_FEE.resolveFor(actor).getText() + "\n");
        System.out.printf(ANNUAL_EFFECTIVE_RATE.resolveFor(actor).getText() + " " + "%s%n", ANNUAL_EFFECTIVE_RATE_VALUE.resolveFor(actor).getTextValue() + "\n");
        System.out.printf(OVERDUE_MONTH_RATE.resolveFor(actor).getText() + " " + "%s%n", OVERDUE_MONTH_RATE_VALUE.resolveFor(actor).getTextValue() + "\n");
        System.out.println(LIFE_INSURANCE.resolveFor(actor).getText() + " " + LIFE_INSURANCE_VALUE.resolveFor(actor).getTextValue() + "\n");
        System.out.println(FIRE_AND_EARTHQUAKE_INSURANCE.resolveFor(actor).getText() + " " + FIRE_AND_EARTHQUAKE_INSURANCE_VALUE.resolveFor(actor).getTextValue());
    }
}

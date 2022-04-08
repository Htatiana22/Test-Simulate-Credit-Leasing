package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.model.SimulateCreditData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static bancolombiaPageAutomation.userinterface.MapCompleteForm.*;

public class CompleteForm implements Task {

    private List<SimulateCreditData> simulateCreditData;

    public CompleteForm (List<SimulateCreditData> simulateCreditData) {
      this.simulateCreditData = simulateCreditData;
    }

    public static CompleteForm simulateCredit(List<SimulateCreditData> simulateCreditData) {
        return Tasks.instrumented(CompleteForm.class, simulateCreditData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(simulateCreditData.get(0).getStrHomeMarketValue()).into(INPUT_HOME_MARKET_VALUE),
                Click.on(INPUT_CHOOSE_PERCENTAGE),
                Click.on(SELECT_CHOOSE_PERCENTAGE),
                Enter.theValue(simulateCreditData.get(0).getStrHowManyYears()).into(INPUT_HOW_MANY_YEARS),
                Click.on(INPUT_BIRTHDAY),
                Click.on(INPUT_BIRTHDAY_YEAR),
                Click.on(INPUT_BIRTHDAY_MONTH),
                Click.on(INPUT_BIRTHDAY_DAY),
                Click.on(BUTTON_SIMULATE)
        );

    }
}

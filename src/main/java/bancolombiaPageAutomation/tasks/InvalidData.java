package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.model.SimulateCreditData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static bancolombiaPageAutomation.userinterface.MapCompleteForm.*;

public class InvalidData implements Task {

    private List<SimulateCreditData> simulateCreditData;

    public InvalidData (List<SimulateCreditData> simulateCreditData) {
        this.simulateCreditData = simulateCreditData;
    }

    public static InvalidData simulateCredit(List<SimulateCreditData> simulateCreditData) {
        return Tasks.instrumented(InvalidData.class, simulateCreditData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(simulateCreditData.get(0).getHomeMarketValue()).into(INPUT_HOME_MARKET_VALUE),
                Click.on(INPUT_CHOOSE_PERCENTAGE),
                Click.on(SELECT_CHOOSE_PERCENTAGE),
                Enter.theValue(simulateCreditData.get(0).getHowManyYears()).into(INPUT_HOW_MANY_YEARS),
                Click.on(INPUT_BIRTHDAY),
                Click.on(INPUT_BIRTHDAY_YEAR),
                Click.on(INPUT_BIRTHDAY_MONTH),
                Click.on(INPUT_BIRTHDAY_DAY));
    }
}

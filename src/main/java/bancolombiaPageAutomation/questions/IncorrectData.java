package bancolombiaPageAutomation.questions;

import bancolombiaPageAutomation.model.SimulateCreditData;
import bancolombiaPageAutomation.userinterface.SimulationResult;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class IncorrectData implements Question <Boolean>  {

    private List<SimulateCreditData> simulateCreditData;

    public IncorrectData (List<SimulateCreditData> simulateCreditData) {
        this.simulateCreditData = simulateCreditData;}

    public static IncorrectData toEnd(List<SimulateCreditData> simulateCreditData) {
        return new IncorrectData(simulateCreditData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean Result;

        String simulateCredit = Text.of(SimulationResult.ERROR_MESSAGE).viewedBy(actor).asString();

        if (simulateCreditData.get(0).getErrorMessage().equals(simulateCredit)){
            Result = true;
        }else {
            Result = false;
        }

        return Result;
    }
}

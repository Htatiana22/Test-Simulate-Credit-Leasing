package bancolombiaPageAutomation.questions;

import bancolombiaPageAutomation.model.SimulateCreditData;
import bancolombiaPageAutomation.userinterface.SimulationResult;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    private List<SimulateCreditData> simulateCreditData;

    public Answer(List<SimulateCreditData> simulateCreditData) {
        this.simulateCreditData = simulateCreditData;}

    public static Answer verify(List<SimulateCreditData> simulateCreditData) {
        return new Answer(simulateCreditData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean Result;

        String simulateCredit = Text.of(SimulationResult.FIXED_FEE).viewedBy(actor).asString();

        if (simulateCreditData.get(0).getStrCheckSimulation().equals(simulateCredit)){
            Result = true;
        }else {
            Result = false;
        }

        return Result;


    }
}

    //public static Question<String> fixedFee() {
      //  return actor -> TextContent.of(SimulationResult.FIXED_FEE).viewedBy(actor).asString();}


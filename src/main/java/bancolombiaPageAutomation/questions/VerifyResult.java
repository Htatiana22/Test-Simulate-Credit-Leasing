package bancolombiaPageAutomation.questions;

import bancolombiaPageAutomation.model.SimulateCreditData;
import bancolombiaPageAutomation.userinterface.SimulationResult;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class VerifyResult implements Question {
    SimulationResult FeeValueResult = new SimulationResult();

    private List<SimulateCreditData> simulateCreditData;

    public VerifyResult(List<SimulateCreditData> simulateCreditData) {
        this.simulateCreditData = simulateCreditData;
    }

    public static VerifyResult creditSimulation(List<SimulateCreditData> simulateCreditData) {
        return new VerifyResult(simulateCreditData);
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(SimulationResult.FIXED_FEE_TITLE).viewedBy(actor).asString();
    }
}

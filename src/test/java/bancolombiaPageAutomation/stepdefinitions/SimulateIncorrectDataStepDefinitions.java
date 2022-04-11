package bancolombiaPageAutomation.stepdefinitions;

import bancolombiaPageAutomation.model.SimulateCreditData;
import bancolombiaPageAutomation.questions.IncorrectData;
import bancolombiaPageAutomation.tasks.InvalidData;
import bancolombiaPageAutomation.tasks.SelectingOptions;
import bancolombiaPageAutomation.tasks.Start;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SimulateIncorrectDataStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user enters the Bancolombia page$")
    public void user_enters_the_Bancolombia_page() {
        OnStage.theActorCalled("Herika").wasAbleTo(Start.thePage());
    }

    @Given("^user selects multiple options 'Productos y Servicios - Leasing - Simula - Segun valor vivienda'$")
    public void user_selects_multiple_options_Productos_y_Servicios_Leasing_Simula_Segun_valor_vivienda() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectingOptions.toContinue());
    }

    @When("^user enters wrong data to continue$")
    public void user_enters_wrong_data_to_continue(List<SimulateCreditData> simulateCreditData) {
        theActorInTheSpotlight().attemptsTo(InvalidData.simulateCredit(simulateCreditData));
    }

    @Then("^user verifies if with the erroneous data he can do the credit simulation$")
    public void user_verifies_if_with_the_erroneous_data_he_can_do_the_credit_simulation(List<SimulateCreditData> simulateCreditData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IncorrectData.toEnd(simulateCreditData)));

    }
}

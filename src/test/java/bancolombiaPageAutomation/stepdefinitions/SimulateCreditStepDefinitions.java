package bancolombiaPageAutomation.stepdefinitions;

import bancolombiaPageAutomation.model.SimulateCreditData;
import bancolombiaPageAutomation.questions.VerifyResult;
import bancolombiaPageAutomation.tasks.CompleteForm;
import bancolombiaPageAutomation.tasks.LastStep;
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

public class SimulateCreditStepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user enters the bancolombia's page$")
    public void userEntersTheBancolombiaSPage() {
        OnStage.theActorCalled("Herika").wasAbleTo(Start.thePage());

    }

    @Given("^user selects options 'Productos y Servicios - Leasing - Simula - Segun valor vivienda'$")
    public void user_selects_options_Productos_y_Servicios_Leasing_Simula_Segun_valor_vivienda() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectingOptions.toContinue());
    }

    @When("^user enters the requested data to continue$")
    public void user_enters_the_requested_data_to_continue(List<SimulateCreditData> simulateCreditData) {
        theActorInTheSpotlight().attemptsTo(CompleteForm.simulateCredit(simulateCreditData));
    }

    @When("^user selects the option 'leasing Habicacional'$")
    public void user_selects_the_option_leasing_Habicacional()  {
        theActorInTheSpotlight().attemptsTo(LastStep.toEnd());
    }

    @Then("^user verifies the result of the simulation was successful$")
    public void userVerifiesTheResultOfTheSimulationWasSuccessful(List<SimulateCreditData> simulateCreditData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyResult.creditSimulation(simulateCreditData)));
    //Matchers.equalTo("Cuota fija en pesos")));
    }
}

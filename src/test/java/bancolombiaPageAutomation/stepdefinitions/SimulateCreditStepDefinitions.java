package bancolombiaPageAutomation.stepdefinitions;

import bancolombiaPageAutomation.model.SimulateCreditData;
import bancolombiaPageAutomation.questions.Answer;
import bancolombiaPageAutomation.tasks.*;
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


    @When("^user clicks on the 'productos y servicios' option$")
    public void userClicksOnTheProductosYServiciosOption() {
        theActorInTheSpotlight().attemptsTo(RequestProducts.toSelect());
    }

    @When("^user clicks on the 'leasing' option$")
    public void userClicksOnTheLeasingOption() {
        theActorInTheSpotlight().attemptsTo(Leasing.selectOption());
    }

    @When("^user selects the 'leasing habitacional' option$")
    public void userSelectsTheLeasingHabitacionalOption() {
        theActorInTheSpotlight().attemptsTo(ResidentialLeasing.onClick());
    }

    @When("^user clicks on the 'simula' option$")
    public void userClicksOnTheSimulaOption() {
        theActorInTheSpotlight().attemptsTo(Simulate.theOption());
    }

    @When("^user selects the option 'segun el valor de la vivienda'$")
    public void userSelectsTheOptionSegunElValorDeLaVivienda() {
        theActorInTheSpotlight().attemptsTo(HomeValue.clickOption());
    }

    @When("^user fills the form$")
    public void userFillsTheForm(List<SimulateCreditData> simulateCreditData) {
        theActorInTheSpotlight().attemptsTo(CompleteForm.simulateCredit(simulateCreditData));
    }

    @When("^user clicks the button 'Leasing Habitacional'$")
    public void userClicksTheButtonLeasingHabitacional() {
        theActorInTheSpotlight().attemptsTo(LastStep.toEnd());
    }

    @Then("^verify the credit simulation is successful$")
    public void verifyTheCreditSimulationIsSuccessful(List<SimulateCreditData> simulateCreditData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.verify(simulateCreditData)));
        //System.out.println("Tasa efectiva anual " + Answer.fixedFee().answeredBy(theActorInTheSpotlight()));
    }

}

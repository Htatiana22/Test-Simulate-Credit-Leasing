package bancolombiaPageAutomation.tasks;

import bancolombiaPageAutomation.userinterface.EnterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Start implements Task {
    private EnterPage enterPage;

    public static Start thePage() {
        return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(enterPage),
                Click.on(EnterPage.BUTTON_GO_TO_HOME_PAGE)
        );
        
    }
}

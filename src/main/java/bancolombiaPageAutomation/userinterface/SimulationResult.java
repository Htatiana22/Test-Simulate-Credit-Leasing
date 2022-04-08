package bancolombiaPageAutomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimulationResult extends PageObject {

    public static final Target BUTTON_RESIDENTIAL_LEASING = Target.the("Click on the simulate button")
            .located(By.id("credit-on-UVR-button"));

    public static final Target SELECT_RATES_AND_FEES = Target.the("Click on rates and fees")
            .located(By.id("acordeon-tasas-tarifas-tasa-fija"));

    public static final Target FIXED_FEE = Target.the("Verify credit simulation result")
            .located(By.cssSelector("div.swiper-slide:nth-child(2) .title-card"));

}
    //public static final Target CONFIRM_REGISTRATION = Target.the("Successfully registered user")
      //      .located(By.className("sub-title"));

package bancolombiaPageAutomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimulationResult extends PageObject {

    public static final Target BUTTON_RESIDENTIAL_LEASING = Target.the("Click on the simulate button")
            .located(By.id("credit-on-UVR-button"));

    public static final Target SELECT_RATES_AND_FEES = Target.the("Click on rates and fees")
          .located(By.id("acordeon-tasas-tarifas-tasa-fija"));

    public static final Target FIXED_FEE_TITLE = Target.the("Verify credit simulation result")
            .located(By.cssSelector("div.swiper-slide:nth-child(2) .title-card"));

    public String getTextCreditResult() {
        String feeValue = getDriver().findElement(By.id("resultado-FIXEDRATEFIXEDFEE")).getText();
        return feeValue;
    }

    //*** Validar datos incorrectos del segundo escenario ****//
    public static final Target ERROR_MESSAGE  = Target.the("Read error message the field does not match the minimum value")
         .located(By.cssSelector("form > mat-form-field:nth-child(4) .mat-form-field-subscript-wrapper mat-error"));
}

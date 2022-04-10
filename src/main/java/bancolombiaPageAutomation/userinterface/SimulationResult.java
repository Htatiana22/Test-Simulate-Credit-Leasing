package bancolombiaPageAutomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimulationResult extends PageObject {

    public static final Target BUTTON_RESIDENTIAL_LEASING = Target.the("Click on the simulate button")
            .located(By.id("credit-on-UVR-button"));

    public static final Target SELECT_RATES_AND_FEES = Target.the("Click on rates and fees")
        .located(By.id("mat-expansion-panel-header-3"));

    //public static final Target SELECT_RATES_AND_FEES = Target.the("Click on rates and fees")
      //      .located(By.id("acordeon-tasas-tarifas-tasa-fija"));

    public static final Target FIXED_FEE = Target.the("Verify credit simulation result")
            .located(By.cssSelector("div.swiper-slide:nth-child(2) .title-card"));

    public String getTextCreditResult() {
        String feeValue = getDriver().findElement(By.id("resultado-FIXEDRATEFIXEDFEE")).getText();
        //String feeValue1 = getDriver().findElement(By.id("resultado-FIXEDRATEFIXEDFEE")).getText();
        return feeValue;
        //return feeValue1;
    }
}

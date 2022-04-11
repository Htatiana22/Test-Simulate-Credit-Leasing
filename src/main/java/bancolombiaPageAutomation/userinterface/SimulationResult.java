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

    public static final Target FIXED_RATE_FIXED_FEE = Target.the("Fixed rate fee value")
            .located(By.id("resultado-FIXEDRATEFIXEDFEE"));

    public static final Target ANNUAL_EFFECTIVE_RATE = Target.the("Annual effective rate")
            .located(By.xpath("//div[@class='mat-expansion-panel-body']//div[1]//small[1]"));

    public static final Target ANNUAL_EFFECTIVE_RATE_VALUE = Target.the("Annual effective rate value")
            .located(By.xpath("//div[@class='mat-expansion-panel-body']//div[1]//small[2]"));

    public static final Target OVERDUE_MONTH_RATE = Target.the("Overdue month rate")
            .located(By.xpath("//div[@class='mat-expansion-panel-body']//div[2]//small[1]"));

    public static final Target OVERDUE_MONTH_RATE_VALUE = Target.the("Overdue month rate value")
            .located(By.xpath("//div[@class='mat-expansion-panel-body']//div[2]//small[2]"));

    public static final Target LIFE_INSURANCE = Target.the("Life insurance")
            .located(By.xpath("//div[@class='mat-expansion-panel-body']//div[3]//small[1]"));

    public static final Target LIFE_INSURANCE_VALUE = Target.the("Life insurance value")
            .located(By.xpath("//div[@class='mat-expansion-panel-body']//div[3]//small[2]"));

    public static final Target FIRE_AND_EARTHQUAKE_INSURANCE = Target.the("Fire and earthquake insurance")
            .located(By.xpath("//div[@class='mat-expansion-panel-body']//div[4]//small[1]"));

    public static final Target FIRE_AND_EARTHQUAKE_INSURANCE_VALUE = Target.the("Fire and earthquake insurance value")
            .located(By.xpath("//div[@class='mat-expansion-panel-body']//div[4]//small[2]"));

    //*** Validar datos incorrectos del segundo escenario ****//
    public static final Target ERROR_MESSAGE  = Target.the("Read error message the field does not match the minimum value")
         .located(By.cssSelector("form > mat-form-field:nth-child(4) .mat-form-field-subscript-wrapper mat-error"));
}

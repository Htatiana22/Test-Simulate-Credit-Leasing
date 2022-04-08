package bancolombiaPageAutomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MapCompleteForm extends Object{

    public static final Target INPUT_HOME_MARKET_VALUE = Target.the("Enter home market value")
            .located(By.id("valor-simulacion"));

    public static final Target INPUT_CHOOSE_PERCENTAGE = Target.the("Choose percentage")
            .located(By.id("elegir-porcentaje"));

    public static final Target SELECT_CHOOSE_PERCENTAGE = Target.the("Select percentage value")
            .located(By.id("mat-option-0"));

    public static final Target INPUT_HOW_MANY_YEARS = Target.the("Write how many years")
            .located(By.id("valor-year"));

    public static final Target INPUT_BIRTHDAY = Target.the("Click on the date of birth field")
            .located(By.id("campo-fecha"));

    public static final Target INPUT_BIRTHDAY_YEAR = Target.the("Select year")
            .located(By.xpath("//td[@aria-label='1990']"));

    public static final Target INPUT_BIRTHDAY_MONTH = Target.the("Select month")
            .located(By.xpath("//td[@aria-label='febrero de 1990']"));

    public static final Target INPUT_BIRTHDAY_DAY = Target.the("Select day")
            .located(By.xpath("//td[@aria-label='2 de febrero de 1990']"));

    public static final Target BUTTON_SIMULATE = Target.the("Click on the simulate button")
            .located(By.id("boton-simular"));

    public static final Target BUTTON_SIMULATE2 = Target.the("Click on the simulate button")
            .locatedBy(("#mat-expansion-panel-header-3"));


}

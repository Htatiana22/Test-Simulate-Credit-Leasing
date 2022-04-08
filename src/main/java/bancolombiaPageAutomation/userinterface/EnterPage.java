package bancolombiaPageAutomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bancolombia.com/personas")
public class EnterPage extends PageObject {

    public static final Target BUTTON_GO_TO_HOME_PAGE = Target.the("Click on the button to go to the main page")
            .located(By.className("modal-prehome-fenix-header-info-button-home"));

    public static final Target SELECT_PRODUCTS_AND_SERVICES = Target.the("Click on the products and services option")
            .located(By.id("menu-productos"));

    public static final Target SELECT_OPTION_LEASING = Target.the("Click on the leasing option")
            .located(By.id("header-productos-leasing"));

    public static final Target SELECT_HOUSING_LEASING_OPTION = Target.the("Select the residential leasing option")
            .located(By.linkText("Leasing Habitacional"));

    public static final Target SELECT_SIMULATED_OPTION = Target.the("Select the simulate option")
            .located(By.linkText("Simula"));

    public static final Target BUTTON_HOME_VALUE = Target.the("Click on the option according to the value of the house")
            .located(By.id("calcular-cuotas"));


}

package bancolombiaPageAutomation.model;

public class SimulateCreditData {

    private String homeMarketValue;
    private String howManyYears;
    private String strCheckSimulation;
    private String errorMessage;

    public String getStrCheckSimulation() {
        return strCheckSimulation;
    }

    public void setStrCheckSimulation(String strCheckSimulation) {
        this.strCheckSimulation = strCheckSimulation;
    }

    public String getHomeMarketValue() {
        return homeMarketValue;
    }

    public void setHomeMarketValue(String homeMarketValue) {
        this.homeMarketValue = homeMarketValue;
    }

    public String getHowManyYears() {
        return howManyYears;
    }

    public void setHowManyYears(String howManyYears) {
        this.howManyYears = howManyYears;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

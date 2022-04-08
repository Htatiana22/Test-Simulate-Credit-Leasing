@Stories
  Feature: simulate housing credit leasing on the Bancolombia page
    As a user
    I want to enter the page of Bancolombia
    To simulate a home loan

@scenario1
  Scenario: Verify successful simulation
    Given user enters the bancolombia's page
    When user clicks on the 'productos y servicios' option
    And user clicks on the 'leasing' option
    And user selects the 'leasing habitacional' option
    And user clicks on the 'simula' option
    And user selects the option 'segun el valor de la vivienda'
    And user fills the form
    |strHomeMarketValue|strHowManyYears|
    |170000000         |  11           |
    And user clicks the button 'Leasing Habitacional'
    Then verify the credit simulation is successful
    |strCheckSimulation|
    |Cuota fija en pesos|
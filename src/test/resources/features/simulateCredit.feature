@UserStory
  Feature: simulate housing credit leasing on the Bancolombia page
    As a user
    I want to enter the page of Bancolombia
    To simulate a home loan

@scenario1
  Scenario: Verify the result of the simulation of a home loan
  Given user enters the bancolombia's page
  And user selects options 'Productos y Servicios - Leasing - Simula - Segun valor vivienda'
  When user enters the requested data to continue
    |homeMarketValue |howManyYears |
    |170000000       | 11          |
  And user selects the option 'leasing Habicacional'
  Then user verifies the result of the simulation was successful
    |strCheckSimulation|
    |Cuota fija en pesos|


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

  @scenario2
    Scenario: Verify the result of the simulation of a housing loan with erroneous data
      Given user enters the Bancolombia page
      And user selects multiple options 'Productos y Servicios - Leasing - Simula - Segun valor vivienda'
      When user enters wrong data to continue
        |homeMarketValue |howManyYears |
        |122000000       | 2           |
      Then user verifies if with the erroneous data he can do the credit simulation
        |errorMessage|
        |El campo no cumple con el valor mínimo: 5 años|


Feature: Pruebas en pagina web The-internet

    La primera parte del portafolio se basara en realizar distintas pruebas en la pagina web https://the-internet.herokuapp.com/


    Background: Base scenarios
        Given Ingreso a la url de The-internet

    @enterPage
    Scenario: ingreso a la pagina web
        Then Valido el ingreso correcto

    @ABTesting
    Scenario: Ingreso a AB Testing y valido la pagina redirigida
        Given Ingreso a AB Testing
        Then Valido que se redirige correctamente

Feature: Pruebas en pagina web The-internet

    La primera parte del portafolio se basara en realizar distintas pruebas en la pagina web https://the-internet.herokuapp.com/

    Background: Base de los Scenarios
        Given Ingreso a la url de The-internet

    @A/BTesting
    Scenario: Ingreso a A/B Testing y valido la pagina redirigida
        Given Ingreso a A/B Testing
        Then Valido que se redirige correctamente

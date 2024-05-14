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

    @AddRemove
    Scenario: Ingreso AddRemove Element y valido funcionalidad
        Given Ingreso a AddRemove Element
        When Selecciono boton Add Element
        And Valido que se agregue el boton Delete
        When Selecciono el boton Delete
        And Valido que se elimine el boton Delete
        Then Valido que ambos botones funcionen correctamamente

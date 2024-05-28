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

    @BasicAuth
    Scenario: Ingreso a Basic Auth e ingreso credenciales
        Given Ingreso a Basic Auth e ingreso credenciales
        Then Valido el correcto login

    @BrokenImages
    Scenario: Ingreo a Broken Images y valido las imagenes
        Given Ingreso a Broken Images
        Then Valido la imagenes

    @Checkboxes
    Scenario: Ingreso a Checkboxes y valido los elementos checkbox
        Given Ingreso a Checkboxes
        Then Valido las acciones de los checkbox

    @ContextMenu
    Scenario: Ingreso a Context menu y valido el despliegue de menu
        Given Ingreso a Context menu
        When Interactuo con recuadro
        Then Valido el despliegue del menu

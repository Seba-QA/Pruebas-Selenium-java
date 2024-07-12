Feature: Pruebas en pagina web The-internet

    La primera parte del portafolio se basara en realizar distintas pruebas en la pagina web https://the-internet.herokuapp.com/


    Background: Base scenarios
        Given Ingreso a la url de The-internet

    @enterPage
    Scenario: ingreso a la pagina web
        Then Valido el ingreso correcto

    #CP-001/PAU-01
    @ABTesting
    Scenario: Ingreso a AB Testing y valido la pagina redirigida
        Given Ingreso a AB Testing
        Then Valido que se redirige correctamente

    #CP-002/PAU-02
    @AddRemove
    Scenario: Ingreso AddRemove Element y valido funcionalidad
        Given Ingreso a AddRemove Element
        When Selecciono boton Add Element
        And Valido que se agregue el boton Delete
        When Selecciono el boton Delete
        And Valido que se elimine el boton Delete
        Then Valido que ambos botones funcionen correctamamente
    
    #CP-003/PAU-03
    @BasicAuth
    Scenario: Ingreso a Basic Auth e ingreso credenciales
        Given Ingreso a Basic Auth e ingreso credenciales
        Then Valido el correcto login

    #CP-004/PAU-04
    @BrokenImages
    Scenario: Ingreo a Broken Images y valido las imagenes
        Given Ingreso a Broken Images
        Then Valido la imagenes

    #CP-005/PAU-05
    @Checkboxes
    Scenario: Ingreso a Checkboxes y valido los elementos checkbox
        Given Ingreso a Checkboxes
        Then Valido las acciones de los checkbox

    #CP-006/PAU-06
    @ContextMenu
    Scenario: Ingreso a Context menu y valido el despliegue de menu
        Given Ingreso a Context menu
        When Interactuo con recuadro
        Then Valido el despliegue del menu

    #CP-009/PAU-09
    @FileDorwnloader
    Scenario: Ingreso a File downloader y descargo los archivos
        Given Ingreso a File downloader
        When Descargo los archivos en la pagina
        Then valido la descarga de los archivos

    #CP-007/PAU-07
    @DragAndDrop
    Scenario: Inghreso a Drag and drop y muevo los recuadros
        Given Ingreso a Drag and drop
        When Muevo recuadro A al lugar del recuedro B y a su posicion original
        And Valido que ambos movimientos del recuadro A
        And Muevo recuadro B al lugar del recuedro A y a su posicion original
        And Valido que ambos movimientos del recuadro B
        Then Valido que todos los movimientos se hagan correctamente

    #CP-008/PAU-08
    @Dropdown
    Scenario: Ingreso a Dropdown y valido la lista
        Given Ingreso a Dropdown
        When Despliego la lista
        Then Seleciono la opcion 1, 2 y valido que se seleccionen

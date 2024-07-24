# Portafolio de Pruebas Automatizadas

## Objetivo

El propósito de este proyecto es demostrar mis conocimientos en pruebas automatizadas a través de la implementación de pruebas en una página web de prueba. Además, se incluye la creación de un plan de pruebas que abarca la estrategia, ejecución y gestión de las pruebas, proporcionando una visión completa del proceso de automatización.

## Tecnologías y Herramientas

Este proyecto utiliza las siguientes tecnologías y herramientas:

- **Java**: Lenguaje de programación principal.
- **Maven**: Herramienta de gestión de proyectos y construcción.
- **Selenium**: Entorno de pruebas automatizadas para navegadores web.
- **Cucumber**: Herramienta para pruebas basadas en comportamiento (BDD).
- **Gherkin**: Lenguaje específico para la escritura de pruebas en Cucumber.
- **Jira Software**: Herramienta para la gestión de proyectos y seguimiento de tareas.

## Página Web Probada

Las pruebas se han realizado en la página web de prueba: [the-internet.herokuapp.com](https://the-internet.herokuapp.com). Esta página proporciona una variedad de funcionalidades que permiten probar diferentes aspectos de la automatización.

## Proyecto en Jira

El proyecto en Jira Software para gestionar y seguir el progreso de las pruebas es: [Portafolios Automatización](https://portfolioautomation.atlassian.net/jira/software/projects/PAU/boards/2). Aquí se pueden consultar las tareas, incidencias y el estado general del proyecto.

## Documentación Adicional

- [Documentación de Selenium](https://www.selenium.dev/documentation/en/)
- [Documentación de Cucumber](https://cucumber.io/docs/guides/)

## Estructura del Proyecto

La estructura de este proyecto está organizada de la siguiente manera:

- **Plan de pruebas:** Contiene el archivo Excel con el plan de pruebas (actualmente en construcción).

- **Screenshots:** Carpeta para almacenar las capturas de pantalla tomadas durante la ejecución de los flujos de pruebas.

- **src:** Esta carpeta contiene el código fuente y está organizada en dos principales subcarpetas:
  - **main/java:** 
    - **utils:** Contiene funciones generales utilizadas en los flujos de pruebas.
    - **pages:** Contiene la lógica de los flujos de pruebas, con las clases que representan las páginas de la aplicación y sus interacciones.
  
  - **test/java:**
    - **steps:** Contiene las definiciones de pasos (steps) que sirven como puente entre los archivos feature y las páginas de prueba.
    - **runners:** Contiene el archivo runner para ejecutar las pruebas. Este runner puede ejecutar todas las pruebas existentes o pruebas específicas mediante el uso de tags.

- **resources:**
  - **features:** Contiene archivos de características en formato Gherkin y algunos archivos de configuración necesarios para las pruebas.

- **Archivo de configuración:**
  - `Pruebas-Selenium-java/pom.xml`: Archivo de configuración de Maven que define las dependencias y configuraciones del proyecto.




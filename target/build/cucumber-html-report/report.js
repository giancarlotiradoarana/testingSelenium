$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/web/SistemaFixed.feature");
formatter.feature({
  "name": "Validación del filtro de la página Juntoz",
  "description": "    Como usuario de sistemaFixed abro la pagina\n    Quiero hacer la busqueda de un proveedor\n    Quiero hacer el registro de un cliente\n    Para validar el funcionamimento del funcionamiento del sistemaFixed",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@SISTEMAFIXED_01"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validar el filtro de un cliente en el sistemaFixed",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@ESCENARIO_SISTEMAFIXED_02_PARAMETRIZADOS"
    }
  ]
});
formatter.step({
  "name": "Abrir el sistemaFixed en el navegador \"\u003cnavegador\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "hacer clicks en el icono en el lado izquierdo para desplegar en el menu",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en el menu Cliente",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en el submenu ver Cliente",
  "keyword": "Entonces "
});
formatter.step({
  "name": "hacer click en el boton agregar un cliente",
  "keyword": "Y "
});
formatter.step({
  "name": "mostrar el formulario de agregar cliente",
  "keyword": "Entonces "
});
formatter.step({
  "name": "seleccionamos Tipo Documento\"\u003cTipo Documento\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos Tipo Documento \"\u003cNumero Documento\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "seleccionamos el Pais\"\u003cPais\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos Razon Social\"\u003cRazon Social\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos el Nombre\"\u003cNombre\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos la direccion\"\u003cDireccion\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos la localidad\"\u003cLocalidad\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos el departamento\"\u003cDepartamento\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos domicilio de entrega\"\u003cDomicilio de entrega\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos el descuento\"\u003cDescuento\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos el email enviofactura\"\u003cEmailenvioFactura\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "seleccionamos EsProveedorEsCliente",
  "keyword": "Y "
});
formatter.step({
  "name": "validar los datos correctos",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "navegador",
        "Tipo Documento",
        "Numero Documento",
        "Pais",
        "Razon Social",
        "Nombre",
        "Direccion",
        "Localidad",
        "Departamento",
        "Domicilio de entrega",
        "Descuento",
        "EmailenvioFactura"
      ]
    },
    {
      "cells": [
        "chrome",
        "Otros",
        "70304898",
        "Perú",
        "Giancarlo TIRADO ARANA SA",
        "GIANCARLO",
        "CHEPEN",
        "CHEPEN",
        "LA LIBERTAD",
        "CHEPEN",
        "12",
        "gtirado@unitru.edu.pe"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar el filtro de un cliente en el sistemaFixed",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@SISTEMAFIXED_01"
    },
    {
      "name": "@ESCENARIO_SISTEMAFIXED_02_PARAMETRIZADOS"
    }
  ]
});
formatter.step({
  "name": "Abrir el sistemaFixed en el navegador \"chrome\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.abrirElSistemaFixedEnElNavegador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer clicks en el icono en el lado izquierdo para desplegar en el menu",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.hacerClicksEnElIconoEnElLadoIzquierdoParaDesplegarEnElMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en el menu Cliente",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.hacerClickEnElMenuCliente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en el submenu ver Cliente",
  "keyword": "Entonces "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.hacerClickEnElSubmenuVerCliente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en el boton agregar un cliente",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.hacerClickEnElBotonAgregarUnCliente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mostrar el formulario de agregar cliente",
  "keyword": "Entonces "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.mostrarElFormularioDeAgregarCliente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionamos Tipo Documento\"Otros\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.seleccionamosTipoDocumento(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos Tipo Documento \"70304898\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.escribimosTipoDocumento(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionamos el Pais\"Perú\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.seleccionamosElPais(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos Razon Social\"Giancarlo TIRADO ARANA SA\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.escribimosRazonSocial(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos el Nombre\"GIANCARLO\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.escribimosElNombre(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos la direccion\"CHEPEN\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.escribimosLaDireccion(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos la localidad\"CHEPEN\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.escribimosLaLocalidad(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos el departamento\"LA LIBERTAD\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.escribimosElDepartamento(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos domicilio de entrega\"CHEPEN\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.escribimosDomicilioDeEntrega(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos el descuento\"12\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.escribimosElDescuento(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos el email enviofactura\"gtirado@unitru.edu.pe\"",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.escribimosElEmailEnviofactura(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionamos EsProveedorEsCliente",
  "keyword": "Y "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.seleccionamosEsProveedorEsCliente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar los datos correctos",
  "keyword": "Entonces "
});
formatter.match({
  "location": "SistemaFixedStepDefinition.validarLosDatosCorrectos()"
});
formatter.result({
  "status": "passed"
});
});
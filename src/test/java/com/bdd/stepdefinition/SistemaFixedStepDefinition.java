package com.bdd.stepdefinition;

import com.bdd.page.SistemaFixedPage;
import com.bdd.step.SistemaFixedStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class SistemaFixedStepDefinition extends ScenarioSteps {

    @Steps

    SistemaFixedStep sistemaFixedStep;

    @Dado("^Abrir el sistemFixed en el navegador \"([^\"]*)\"$")
    public void Abrir_el_sistemFixed_en_el_navegador(String navegador) {

        sistemaFixedStep.Abrir_el_sistemFixed_en_el_navegador(navegador);

    }

    @Y("^hacer click en el icono en el lado izquierdo para desplegar en el menu$")
    public void hacerClickEnElIconoEnElLadoIzquierdoParaDesplegarEnElMenu() {
        sistemaFixedStep.hacerClickEnElIconoEnElLadoIzquierdoParaDesplegarEnElMenu();

    }

    @Y("^hacer click en el menu Proveedor$")
    public void hacerClickEnElMenuProveedor() {
        sistemaFixedStep.hacerClickEnElMenuProveedor();

    }

    @Entonces("^hacer click en el submenu ver proveedores$")
    public void hacerClickEnElSubmenuVerProveedores() {
        sistemaFixedStep.hacerClickEnElSubmenuVerProveedores();
    }

    @Y("^hacer click en el filtro \"([^\"]*)\"$")
    public void hacerClickEnElFiltro(String filtro) throws Throwable {
        sistemaFixedStep.hacerClickEnElFiltro(filtro);

    }


    @Y("^hacer click en el ver Detalle de proveedor$")
    public void hacerClickEnElVerDetalleDeProveedor() {

        sistemaFixedStep.hacerClickEnElVerDetalleDeProveedor();
    }

    @Y("^hacer click en ver Detalle$")
    public void hacerClickEnVerDetalle() {
        sistemaFixedStep.hacerClickEnVerDetalle();

    }


    @Entonces("^validar que muestre el Modal Correctamente$")
    public void validarQueMuestreElModalCorrectamente() {

        sistemaFixedStep.validarQueMuestreElModalCorrectamente();
    }

    //ESTE ES EL SEGUNDO ESCENARIO
    @Dado("^Abrir el sistemaFixed en el navegador \"([^\"]*)\"$")
    public void abrirElSistemaFixedEnElNavegador(String navegador2) throws Throwable {
        sistemaFixedStep.abrirElSistemaFixedEnElNavegador(navegador2);


    }


    @Y("^hacer clicks en el icono en el lado izquierdo para desplegar en el menu$")
    public void hacerClicksEnElIconoEnElLadoIzquierdoParaDesplegarEnElMenu() {
        sistemaFixedStep.hacerClickEn_elIconoEnElLadoIzquierdoParaDesplegarEnElMenu();
    }

    @Y("^hacer click en el menu Cliente$")
    public void hacerClickEnElMenuCliente() {
        sistemaFixedStep.hacerClickEnElMenuCliente();

    }

    @Entonces("^hacer click en el submenu ver Cliente$")
    public void hacerClickEnElSubmenuVerCliente() {
        sistemaFixedStep.hacerClickEnElSubmenuVerCliente();
    }

    @Y("^hacer click en el boton agregar un cliente$")
    public void hacerClickEnElBotonAgregarUnCliente() {
        sistemaFixedStep.hacerClickEnElBotonAgregarUnCliente();
    }

    @Entonces("^mostrar el formulario de agregar cliente$")
    public void mostrarElFormularioDeAgregarCliente() {

    }

    @Y("^seleccionamos Tipo Documento\"([^\"]*)\"$")
    public void seleccionamosTipoDocumento(String Tipodoc) throws Throwable {
        sistemaFixedStep.seleccionamosTipoDocumento(Tipodoc);


    }

    @Y("^escribimos Tipo Documento \"([^\"]*)\"$")
    public void escribimosTipoDocumento(String numDocumento) throws Throwable {
        sistemaFixedStep.escribimosTipoDocumento(numDocumento);

    }

    @Y("^seleccionamos el Pais\"([^\"]*)\"$")
    public void seleccionamosElPais(String pais) throws Throwable {

        sistemaFixedStep.seleccionamosElPais(pais);
    }

    @Y("^escribimos Razon Social\"([^\"]*)\"$")
    public void escribimosRazonSocial(String razon) throws Throwable {
        sistemaFixedStep.escribimosRazonSocial(razon);

    }


    @Y("^escribimos el Nombre\"([^\"]*)\"$")
    public void escribimosElNombre(String nombre) throws Throwable {
        sistemaFixedStep.escribimosElNombre(nombre);

    }

    @Y("^escribimos la direccion\"([^\"]*)\"$")
    public void escribimosLaDireccion(String direccion) throws Throwable {
        sistemaFixedStep.escribimosLaDireccion(direccion);

    }

    @Y("^escribimos la localidad\"([^\"]*)\"$")
    public void escribimosLaLocalidad(String localidad) throws Throwable {
        sistemaFixedStep.escribimosLaLocalidad(localidad);

    }

    @Y("^escribimos el departamento\"([^\"]*)\"$")
    public void escribimosElDepartamento(String departamento) throws Throwable {
        sistemaFixedStep.escribimosElDepartamento(departamento);

    }

    @Y("^escribimos domicilio de entrega\"([^\"]*)\"$")
    public void escribimosDomicilioDeEntrega(String domicilio) throws Throwable {
        sistemaFixedStep.escribimosDomicilioDeEntrega(domicilio);

    }

    @Y("^escribimos el descuento\"([^\"]*)\"$")
    public void escribimosElDescuento(String descuento) throws Throwable {
        sistemaFixedStep.escribimosElDescuento(descuento);
    }

    @Y("^escribimos el email enviofactura\"([^\"]*)\"$")
    public void escribimosElEmailEnviofactura(String emailenviofactura) throws Throwable {
        sistemaFixedStep.escribimosElEmailEnviofactura(emailenviofactura);

    }
    @Y("^seleccionamos EsProveedorEsCliente$")
    public void seleccionamosEsProveedorEsCliente() {
        sistemaFixedStep.seleccionamosEsProveedorEsCliente();

    }

    @Entonces("^validar los datos correctos$")
    public void validarLosDatosCorrectos() {
        sistemaFixedStep.validarLosDatosCorrectos();


    }



}

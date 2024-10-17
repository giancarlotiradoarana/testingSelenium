package com.bdd.step;

import com.bdd.page.SistemaFixedPage;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SistemaFixedStep extends ScenarioSteps {

    SistemaFixedPage sistemaFixedPage;


    @Step
    public void Abrir_el_sistemFixed_en_el_navegador(String navegador){
        sistemaFixedPage.Abrir_el_sistemFixed_en_el_navegador(navegador);

    }
    @Step
    public void hacerClickEnElIconoEnElLadoIzquierdoParaDesplegarEnElMenu() {
        sistemaFixedPage.hacerClickEnElIconoEnElLadoIzquierdoParaDesplegarEnElMenu();

    }

    @Step
    public void hacerClickEnElMenuProveedor() {
        sistemaFixedPage.hacerClickEnElMenuProveedor();

    }

    @Step

    public void hacerClickEnElSubmenuVerProveedores() {
        sistemaFixedPage.hacerClickEnElSubmenuVerProveedores();
    }
    @Step
    public void hacerClickEnElFiltro(String filtro) throws Throwable {
        sistemaFixedPage.hacerClickEnElFiltro(filtro);

    }
    @Step
    public void hacerClickEnElVerDetalleDeProveedor() {
        sistemaFixedPage.hacerClickEnElVerDetalleDeProveedor();

    }
    @Step

    public void hacerClickEnVerDetalle() {
        sistemaFixedPage.hacerClickEnVerDetalle();

    }
    @Step

    public void validarQueMuestreElModalCorrectamente() {
        sistemaFixedPage.validarQueMuestreElModalCorrectamente();
    }

    //ESTE ES EL SEGUNDO ESCENARIO
    @Step
    public void abrirElSistemaFixedEnElNavegador(String navegador2) throws Throwable {
        sistemaFixedPage.abrirElSistemaFixedEnElNavegador(navegador2);

    }
    @Step
    public void hacerClickEn_elIconoEnElLadoIzquierdoParaDesplegarEnElMenu() {
        sistemaFixedPage.hacerClickEn_elIconoEnElLadoIzquierdoParaDesplegarEnElMenu();

    }
    @Step
    public void hacerClickEnElMenuCliente() {
        sistemaFixedPage.hacerClickEnElMenuCliente();

    }
    @Step
    public void hacerClickEnElSubmenuVerCliente() {
        sistemaFixedPage.hacerClickEnElSubmenuVerCliente();
    }
    @Step
    public void hacerClickEnElBotonAgregarUnCliente() {
        sistemaFixedPage.hacerClickEnElBotonAgregarUnCliente();
    }
    @Step
    public void seleccionamosTipoDocumento(String Tipodoc)  {
        sistemaFixedPage.seleccionamosTipoDocumento(Tipodoc);


    }
    @Step
    public void escribimosTipoDocumento(String numDocumento)  {
        sistemaFixedPage.escribimosTipoDocumento(numDocumento);

    }
    @Step
    public void seleccionamosElPais(String pais)  {
        sistemaFixedPage.seleccionamosElPais(pais);

    }
    @Step
    public void escribimosRazonSocial(String razon)  {
        sistemaFixedPage.escribimosRazonSocial(razon);

    }
    @Step
    public void escribimosElNombre(String nombre)  {
        sistemaFixedPage.escribimosElNombre(nombre);


    }
    @Step
    public void escribimosLaDireccion(String direccion)  {
        sistemaFixedPage.escribimosLaDireccion(direccion);

    }
    @Step
    public void escribimosLaLocalidad(String localidad)  {
        sistemaFixedPage.escribimosLaLocalidad(localidad);

    }
    @Step
    public void escribimosElDepartamento(String departamento) {
        sistemaFixedPage.escribimosElDepartamento(departamento);

    }
    @Step
    public void escribimosDomicilioDeEntrega(String domicilio)  {
        sistemaFixedPage.escribimosDomicilioDeEntrega(domicilio);

    }
    @Step
    public void escribimosElDescuento(String descuento)  {
        sistemaFixedPage.escribimosElDescuento(descuento);

    }
    @Step
    public void escribimosElEmailEnviofactura(String emailenviofactura) {
        sistemaFixedPage.escribimosElEmailEnviofactura(emailenviofactura);

    }
    @Step
    public void seleccionamosEsProveedorEsCliente() {
        sistemaFixedPage.seleccionamosEsProveedorEsCliente();

    }
    @Step
    public void validarLosDatosCorrectos() {
        sistemaFixedPage.validarLosDatosCorrectos();


    }




}

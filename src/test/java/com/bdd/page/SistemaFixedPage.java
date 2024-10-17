package com.bdd.page;


import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://sistema.fixed.uy/demo-85")
public class SistemaFixedPage extends PageObject {


    //PARA ICONO DE LA IZQUIERDA
    @FindBy(xpath = "//div[@class='menubar-fixed-panel']")
     WebElement btn_boton_izquierdo;


    //PARA BTN PROVEEDORES
    @FindBy(xpath = "//li[@id='menuBtnProveedores']")
    WebElement btn_proveedores;

    //PARA BTN PROVEEDORES
    @FindBy(xpath = "//span[text()='Ver mis proveedores']")
    WebElement btn_sub_menu_proveedores;

    //PARA INPUT FILTRO
    @FindBy(xpath = "//input[@placeholder='Buscar...']")
    WebElement input_filtro;

    //PARA INPUT CLICK VER DETALLE del proveedor
    @FindBy(xpath = "//table//tr[not(@style)]//button")
    WebElement btn_clk_detalle_proveedor;

    //PARA INPUT CLICK VER DETALLE
    @FindBy(xpath = "//span[text()='Ver detalle']")
    WebElement btn_detalle_proveedor;

    //PARA INPUT CLICK VALIDAR
    @FindBy(xpath ="(//button[@class='btn btn-default cancelar'])[2]")
    WebElement btn_validar_cerrar;

    //PARA INPUT MENU CLIENTE
    @FindBy(xpath = "//li[@id='menuBtnClientes']")
    WebElement btn_menu_cliente;

    //PARA INPUT SUB MENU CLIENTE
    @FindBy(xpath = "//span[text()='Ver mis clientes']")
    WebElement btn_sub_menu_cliente;

    //PARA BOTON AGREGAR CLIENTE
    @FindBy(xpath ="(//button[@class='btn btn-primary'])[1]")
    WebElement btn_agregar_cliente;


    @FindBy(xpath ="(//button[@class='multiselect dropdown-toggle btn btn-default'])[1]")
    WebElement cb_tipo_documento;

    @FindBy(xpath ="(//label[@class='radio'])[3]")
    WebElement cb_otros;

    //PARA INPUT TIPODOCUMENTO
    @FindBy(xpath = "//input[@id='Número-de-documento']")
    WebElement input_numDocumento;

    @FindBy(xpath = "(//button[@class='multiselect dropdown-toggle btn btn-default'])[3]")
    WebElement cbm_seleccionar_pais;

    @FindBy(xpath ="//input[@value='PE']")
    WebElement cbm_pais;

    //RAZON SOCIAL

    @FindBy(xpath ="//input[@id='Razón-Social']")
    WebElement input_razon_social;

    //NOMBRE
    @FindBy(xpath ="//input[@id='Nombre']")
    WebElement input_nombre;

    //DIRECCION
    @FindBy(xpath ="//input[@id='Dirección']")
    WebElement input_Dirección;

    //LOCALIDAD
    @FindBy(xpath ="//input[@id='Localidad']")
    WebElement input_Localidad;

    //DEPARTAMENTO
    @FindBy(xpath ="//input[@id='Departamento']")
    WebElement input_departamento;

    //DEPARTAMENTO
    @FindBy(xpath ="//input[@id='Dirección-entrega']")
    WebElement input_entrega_domicilio;

    //DESCUENTO
    @FindBy(xpath ="//input[@id='Descuento']")
    WebElement input_descuento;

    //EMAIL ENVIO FACTURA
    @FindBy(xpath ="//input[@id='Mail-envio-factura']")
    WebElement input_email;


    //ES PROVEEDOR
    @FindBy(xpath ="//label[text()='Es proveedor']")
    WebElement cb_esProveedor;

    @FindBy(xpath ="//label[text()='Es cliente']")
    WebElement cb_Cliente;

    //VALIDAR FORMULARIO
    @FindBy(xpath ="//button[@name='agregarbtn']")
    WebElement btn_validar_formulario;



    public void Abrir_el_sistemFixed_en_el_navegador(String navegador){

         navegador = "chrome";
         Browser.Start(this, navegador);

    }
    public void hacerClickEnElIconoEnElLadoIzquierdoParaDesplegarEnElMenu() {

        btn_boton_izquierdo.click();
    }

    public void hacerClickEnElMenuProveedor() {
        btn_proveedores.click();

    }
    public void hacerClickEnElSubmenuVerProveedores() {

        btn_sub_menu_proveedores.click();

    }
    public void hacerClickEnElFiltro(String filtro) {
        input_filtro.click();
        input_filtro.sendKeys(filtro);



    }
    public void hacerClickEnElVerDetalleDeProveedor() {
        btn_clk_detalle_proveedor.click();


    }
    public void hacerClickEnVerDetalle() {

        btn_detalle_proveedor.click();

    }

    public void validarQueMuestreElModalCorrectamente() {
        try {
            Thread.sleep(4000);
            btn_validar_cerrar.click();

        } catch (Exception e){

        }

    }

    //ESTE ES EL SEGUNDO ESCENARIO
    public void abrirElSistemaFixedEnElNavegador(String navegador2) throws Throwable {

        navegador2 = "chrome";
        Browser.Start(this, navegador2);

    }
    public void hacerClickEn_elIconoEnElLadoIzquierdoParaDesplegarEnElMenu() {
        btn_boton_izquierdo.click();


    }
    public void hacerClickEnElMenuCliente() {
        btn_menu_cliente.click();


    }
    public void hacerClickEnElSubmenuVerCliente() {
        btn_sub_menu_cliente.click();

    }
    public void hacerClickEnElBotonAgregarUnCliente() {
        btn_agregar_cliente.click();
    }

    public void seleccionamosTipoDocumento(String Tipodoc)  {

        cb_tipo_documento.click();
        cb_tipo_documento.sendKeys(Tipodoc);
        cb_otros.click();

    }
    public void escribimosTipoDocumento(String numDocumento) {

        input_numDocumento.sendKeys(numDocumento);


    }

    public void seleccionamosElPais(String pais)  {
        cbm_seleccionar_pais.click();
        cbm_seleccionar_pais.sendKeys(pais);
        cbm_pais.click();


    }
    public void escribimosRazonSocial(String razon)  {
        input_razon_social.click();
        input_razon_social.sendKeys(razon);
        input_razon_social.sendKeys(Keys.ENTER);
        Browser.Scroll(this,200);
    }
    public void escribimosElNombre(String nombre)  {

        input_nombre.click();
        input_nombre.sendKeys(nombre);
        input_nombre.sendKeys(Keys.ENTER);

    }
    public void escribimosLaDireccion(String direccion)  {

        input_Dirección.click();
        input_Dirección.sendKeys(direccion);
        input_Dirección.sendKeys(Keys.ENTER);


    }
    public void escribimosLaLocalidad(String localidad)  {
        input_Localidad.click();
        input_Localidad.sendKeys(localidad);
        input_Localidad.sendKeys(Keys.ENTER);

    }
    public void escribimosElDepartamento(String departamento) {

        input_departamento.click();
        input_departamento.sendKeys(departamento);
        input_departamento.sendKeys(Keys.ENTER);

    }
    public void escribimosDomicilioDeEntrega(String domicilio)  {

        input_entrega_domicilio.click();
        input_entrega_domicilio.sendKeys(domicilio);
        input_entrega_domicilio.sendKeys(Keys.ENTER);


    }
    public void escribimosElDescuento(String descuento)  {

        input_descuento.click();
        input_descuento.sendKeys(descuento);
        input_descuento.sendKeys(Keys.ENTER);

    }
    public void escribimosElEmailEnviofactura(String emailenviofactura) {

        input_email.click();
        input_email.sendKeys(emailenviofactura);
        input_email.sendKeys(Keys.ENTER);

        }


    public void seleccionamosEsProveedorEsCliente() {

        cb_esProveedor.click();


    }
    public void validarLosDatosCorrectos() {
        btn_validar_formulario.click();


    }






}

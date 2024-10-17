package com.bdd.stepdefinition;

import com.bdd.step.DemoQAStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class DemoQAStepDefinition {
    @Steps
    DemoQAStep demoQAStep;

  
    @Dado("^abrimos la pagina web DemoQA en el navegador \"([^\"]*)\"$")
    public void abrimosLaPaginaWebDemoQAEnElNavegador(String navegador) throws Throwable {
        demoQAStep.abrimosLaPaginaWebDemoQAEnElNavegador(navegador);
      
    }
    @Y("hacer click en el botón Forms")
    public void hacer_click_en_el_botón_Forms(){
        demoQAStep.hacer_click_en_el_botón_Forms();

        
    }

    @Cuando("^realizamos click en el menu Practice Form$")
    public void realizamosClickEnElMenuPracticeForm() {
        demoQAStep.realizamosClickEnElMenuPracticeForm();

    }

    @Entonces("^abrirá el formulario de registro de estudiantes$")
    public void abriráElFormularioDeRegistroDeEstudiantes() {

        demoQAStep.abriráElFormularioDeRegistroDeEstudiantes();
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto First Name y \"([^\"]*)\" en el cuadro de texto Last Name$")
    public void escribimosEnElCuadroDeTextoFirstNameYEnElCuadroDeTextoLastName(String first_name, String last_name) throws Throwable {

        demoQAStep.escribimosEnElCuadroDeTextoFirstNameYEnElCuadroDeTextoLastName(first_name,last_name);

    }

    @Y("^escribimos \"([^\"]*)\" en Email$")
    public void escribimosEnEmail(String email) throws Throwable {
        demoQAStep.escribimosEnEmail(email);

    }
    @Y("^seleccionar \"([^\"]*)\" en Gender$")
    public void seleccionarEnGender(String gender) throws Throwable {
        demoQAStep.seleccionarEnGender(gender);

    }

    @Y("^escribimos \"([^\"]*)\" en Mobile Number$")
    public void escribimosEnMobileNumber(String mobile_numbers) throws Throwable {
        demoQAStep.escribimosEnMobileNumber(mobile_numbers);

    }

    @Y("^escribimos \"([^\"]*)\" en Date Birth$")
    public void escribimosEnDateBirth(String date_birth) throws Throwable {
        demoQAStep.escribimosEnDateBirth(date_birth);

    }

    @Y("^seleccionamos \"([^\"]*)\" en Subjects$")
    public void seleccionamosEnSubjects(String subjects) throws Throwable {
        demoQAStep.seleccionamosEnSubjects(subjects);

    }

    @Y("^seleccionamos \"([^\"]*)\" en Hobbies$")
    public void seleccionamosEnHobbies(String hobbies) throws Throwable {
       demoQAStep.seleccionamosEnHobbies(hobbies);

    }

    @Y("^seleccionamos la ruta \"([^\"]*)\" para el campo Picture$")
    public void seleccionamosLaRutaParaElCampoPicture(String picture) throws Throwable {
        demoQAStep.seleccionamosLaRutaParaElCampoPicture(picture);

    }

    @Y("^escribimos \"([^\"]*)\" en Current Addresss$")
    public void escribimosEnCurrentAddresss(String address) throws Throwable {
        demoQAStep.escribimosEnCurrentAddresss(address);

    }

    @Cuando("^pulsamos enter$")
    public void pulsamosEnter() {
        demoQAStep.pulsamosEnter();
    }

    @Entonces("^validar que se muestre el modal de registro correcto$")
    public void validarQueSeMuestreElModalDeRegistroCorrecto() {
        demoQAStep.validarQueSeMuestreElModalDeRegistroCorrecto();


    }


}

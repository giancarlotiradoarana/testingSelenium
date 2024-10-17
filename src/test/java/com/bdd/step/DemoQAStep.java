package com.bdd.step;

import com.bdd.page.DemoQAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoQAStep extends ScenarioSteps {

    DemoQAPage demoQAPage;

    @Step
    public void abrimosLaPaginaWebDemoQAEnElNavegador(String navegador) throws Throwable {
        demoQAPage.abrimosLaPaginaWebDemoQAEnElNavegador(navegador);

    }

    @Step
    public void hacer_click_en_el_botón_Forms() {
        demoQAPage.hacer_click_en_el_botón_Forms();

    }
    @Step

    public void realizamosClickEnElMenuPracticeForm() {
        demoQAPage.realizamosClickEnElMenuPracticeForm();

    }
    @Step
    public void abriráElFormularioDeRegistroDeEstudiantes() {
        demoQAPage.abriráElFormularioDeRegistroDeEstudiantes();

    }
    @Step
    public void escribimosEnElCuadroDeTextoFirstNameYEnElCuadroDeTextoLastName(String first_name, String last_name) throws Throwable {
        demoQAPage.escribimosEnElCuadroDeTextoFirstNameYEnElCuadroDeTextoLastName(first_name,last_name);
    }
    @Step
    public void escribimosEnEmail(String email) throws Throwable {
        demoQAPage.escribimosEnEmail(email);

    }
    @Step
    public void seleccionarEnGender(String gender) throws Throwable {
        demoQAPage.seleccionarEnGender(gender);

    }
    @Step
    public void escribimosEnMobileNumber(String mobile_numbers) throws Throwable {
        demoQAPage.escribimosEnMobileNumber(mobile_numbers);

    }
    @Step
    public void escribimosEnDateBirth(String date_birth) throws Throwable {
        demoQAPage.escribimosEnDateBirth(date_birth);

    }
    @Step
    public void seleccionamosEnSubjects(String subjects) throws Throwable {
        demoQAPage.seleccionamosEnSubjects(subjects);

    }
    @Step
    public void seleccionamosEnHobbies(String hobbies) throws Throwable {
        demoQAPage.seleccionamosEnHobbies(hobbies);

    }
    @Step
    public void seleccionamosLaRutaParaElCampoPicture(String picture) throws Throwable {
        demoQAPage.seleccionamosLaRutaParaElCampoPicture(picture);

    }
    @Step

    public void escribimosEnCurrentAddresss(String address) throws Throwable {
        demoQAPage.escribimosEnCurrentAddresss(address);

    }
    @Step
    public void pulsamosEnter() {

        demoQAPage.pulsamosEnter();
    }
    @Step
    public void validarQueSeMuestreElModalDeRegistroCorrecto() {
        demoQAPage.validarQueSeMuestreElModalDeRegistroCorrecto();


    }


}

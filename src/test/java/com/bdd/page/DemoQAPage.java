package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/")

public class DemoQAPage extends PageObject {

      @FindBy(xpath ="//h5[text()='Forms']")
      WebElement btn_Forms;

      @FindBy(xpath ="//span[text()='Practice Form']")
      WebElement btn_Practice_From;

      @FindBy(xpath ="//input[@id='firstName']")
      WebElement txt_first_name;

      @FindBy(xpath ="//input[@id='lastName']")
      WebElement txt_lastName;

      @FindBy(xpath ="//input[@placeholder='name@example.com']")
      WebElement txt_email;

      @FindBy(xpath ="//label[text()='Male']")
      WebElement rbtn_male;

      @FindBy(xpath ="//label[text()='Female']")
      WebElement rbtn_female;

      @FindBy(xpath ="//label[text()='Other']")
      WebElement rbtn_other;

      @FindBy(xpath ="//input[@id='userNumber']")
      WebElement txt_mobile_number;

      @FindBy(xpath ="//input[@id='dateOfBirthInput']")
      WebElement txt_date_birth;

      @FindBy(xpath ="//input[@id='subjectsInput']")
      WebElement txt_subjects;

      @FindBy(xpath ="//label[text()='Sports']")
      WebElement chk_sports;


      @FindBy(xpath ="//label[text()='Reading']")
      WebElement chk_reading;

      @FindBy(xpath ="//label[text()='Music']")
      WebElement chk_music;

      @FindBy(xpath ="//input[@id='uploadPicture']")
      WebElement btn_picture;


      @FindBy(xpath = "//textarea[@placeholder='Current Address']")
      WebElement txtarea;

      @FindBy(xpath = "//div[text()='Thanks for submitting the form']")
      WebElement lbl_Thanksforsubmittingtheform;


    public void abrimosLaPaginaWebDemoQAEnElNavegador(String navegador) throws Throwable {
      Browser.Start(this,navegador);

    }

    public void hacer_click_en_el_botón_Forms() {
        Browser.Scroll(this,200);
        btn_Forms.click();

    }
    public void realizamosClickEnElMenuPracticeForm() {
        btn_Practice_From.click();


    }
    public void abriráElFormularioDeRegistroDeEstudiantes() {
        txt_first_name.isDisplayed();

    }
    public void escribimosEnElCuadroDeTextoFirstNameYEnElCuadroDeTextoLastName(String first_name, String last_name) throws Throwable {
        txt_first_name.sendKeys(first_name);//para escribir la variable en el input
        txt_lastName.sendKeys(last_name);//para escribir la variable en el input

        try {
            Thread.sleep(4000);

        } catch (Exception e){

        }
    }

    public void escribimosEnEmail(String email) throws Throwable {
        txt_email.sendKeys(email);

    }
    public void seleccionarEnGender(String gender) throws Throwable {

        switch (gender){

            case "Male":
                rbtn_male.click();
                break;
            case "Female":
                rbtn_female.click();
                break;
            case "Other":
                rbtn_other.click();

            default:
                Assert.fail("Gender ERROR");

        }

    }
    public void escribimosEnMobileNumber(String mobile_numbers) throws Throwable {

        txt_mobile_number.sendKeys(mobile_numbers);
    }

    public void escribimosEnDateBirth(String date_birth) throws Throwable {

        Browser.Scroll(this,200);
        txt_date_birth.click();
        txt_date_birth.sendKeys(Keys.CONTROL + "a");
        txt_first_name.sendKeys(date_birth);
        txt_date_birth.sendKeys(Keys.ENTER);

    }
    public void seleccionamosEnSubjects(String subjects) throws Throwable {

        String[] arreglo_subjects =subjects.split(",");  //RECORRER LA LISTA DE SUBJECTS Y AGREGAR

            for (String item_arreglo_subject :arreglo_subjects){
                txt_subjects.sendKeys(item_arreglo_subject);
                txt_subjects.sendKeys(Keys.ENTER);

            }

    }
    public void seleccionamosEnHobbies(String hobbies) throws Throwable {


        String[] arreglo_hobbies = hobbies.split(",");

        //RECORRER
        for(String item_arr_hobbies : arreglo_hobbies){
            if(item_arr_hobbies.equals("Sports")){
                chk_sports.click();
            }else if(item_arr_hobbies.equals("Reading")){
                chk_reading.click();
            }else if(item_arr_hobbies.equals("Music")){
                chk_music.click();
            }else{
                Assert.fail("Error al seleccionar en hobbies");
            }
        }

    }
    public void seleccionamosLaRutaParaElCampoPicture(String picture) throws Throwable {
        btn_picture.sendKeys(picture);

    }
    public void escribimosEnCurrentAddresss(String address) throws Throwable {
        txtarea.sendKeys(address);
        try {
            Thread.sleep(4000);

        } catch (Exception e){

        }

    }
    public void pulsamosEnter() {

        txt_lastName.click();
        txt_lastName.sendKeys(Keys.ENTER);
    }
    public void validarQueSeMuestreElModalDeRegistroCorrecto() {
        try{
            getDriver().findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
            Assert.assertTrue(true);

        }catch (Exception e){
            Assert.fail("Eror en el mensaje de exito");

        }


    }

}

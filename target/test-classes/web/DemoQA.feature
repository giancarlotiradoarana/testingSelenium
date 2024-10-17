#language: es
@DEMOQA_01
Característica: Validar el funcionamiento del formulario de la web DemoQA
  Como tester del sistema
  Quiero validar el funcionamiento de los controles del formulario
  Para las pruebas de regresión


  @DEMOQA_ESCENARIO_01
  Esquema del escenario: Validar el formulario de registro de estudiantes en la web DemoQA
    Dado abrimos la pagina web DemoQA en el navegador "<Navegador>"
    Y hacer click en el botón Forms
    Cuando realizamos click en el menu Practice Form
    Entonces abrirá el formulario de registro de estudiantes
    Y escribimos "<Fisrt Name>" en el cuadro de texto First Name y "<Last Name>" en el cuadro de texto Last Name
    Y escribimos "<Email>" en Email
    Y seleccionar "<Gender>" en Gender
    Y escribimos "<Mobile Number>" en Mobile Number
    Y escribimos "<Date Birth>" en Date Birth
    Y seleccionamos "<Subjects>" en Subjects
    Y seleccionamos "<Hobbies>" en Hobbies
    Y seleccionamos la ruta "<Picture>" para el campo Picture
    Y escribimos "<Current Address>" en Current Addresss
    Cuando pulsamos enter
    Entonces validar que se muestre el modal de registro correcto

    Ejemplos:
      | Navegador | Fisrt Name | Last Name | Email                 | Gender | Mobile Number | Date Birth | Subjects                                | Hobbies        | Picture                | Current Address |
      | chrome    | Giancarlo  | Tirado    | gtirado@unitru.edu.pe | Male   | 9889989898    | 12/31/1999 | Maths,Social Studies,Commerce,Economics | Sports,Reading | C:\recursos\grado.jpg  | CHEPEN          |



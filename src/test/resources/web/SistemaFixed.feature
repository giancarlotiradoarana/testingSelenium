#language: es
@SISTEMAFIXED_01
Característica:Validación del filtro de la página Juntoz
    Como usuario de sistemaFixed abro la pagina
    Quiero hacer la busqueda de un proveedor
    Quiero hacer el registro de un cliente
    Para validar el funcionamimento del funcionamiento del sistemaFixed

    @ESCENARIO_SISTEMAFIXED_01
    Escenario:Filtrar los datos de un proveedor en el sistemaFixed
        Dado Abrir el sistemFixed en el navegador
        Y  hacer click en el icono en el lado izquierdo para desplegar en el menu
        Y hacer click en el menu Proveedor
        Entonces  hacer click en el submenu ver proveedores
        Y hacer click en el filtro
        Y hacer click en el ver Detalle de proveedor
        Y hacer click en ver Detalle
        Entonces validar que muestre el Modal Correctamente

    @ESCENARIO_SISTEMAFIXED_01_PARAMETRIZADOS
    Esquema del escenario:Validar el filtro de un proveedor en el sistemaFixed
        Dado Abrir el sistemFixed en el navegador "<navegador>"
        Y  hacer click en el icono en el lado izquierdo para desplegar en el menu
        Y hacer click en el menu Proveedor
        Entonces  hacer click en el submenu ver proveedores
        Y hacer click en el filtro "<filtro>"
        Y hacer click en el ver Detalle de proveedor
        Y hacer click en ver Detalle
        Entonces validar que muestre el Modal Correctamente

        Ejemplos:
            | navegador | filtro |
            | chrome    | UTE    |


    @ESCENARIO_SISTEMAFIXED_02
    Escenario:Agregar un cliente en el sistemaFixed
        Dado Abrir el sistemaFixed en el navegador
        Y  hacer clicks en el icono en el lado izquierdo para desplegar en el menu
        Y hacer click en el menu Cliente
        Entonces  hacer click en el submenu ver Cliente
        Y hacer click en el boton agregar un cliente
        Entonces validar los datos correctos

    @ESCENARIO_SISTEMAFIXED_02_PARAMETRIZADOS
    Esquema del escenario:Validar el filtro de un cliente en el sistemaFixed
        Dado Abrir el sistemaFixed en el navegador "<navegador>"
        Y  hacer clicks en el icono en el lado izquierdo para desplegar en el menu
        Y hacer click en el menu Cliente
        Entonces  hacer click en el submenu ver Cliente
        Y hacer click en el boton agregar un cliente
        Entonces mostrar el formulario de agregar cliente
        Y  seleccionamos Tipo Documento"<Tipo Documento>"
        Y  escribimos Tipo Documento "<Numero Documento>"
        Y  seleccionamos el Pais"<Pais>"
        Y  escribimos Razon Social"<Razon Social>"
        Y  escribimos el Nombre"<Nombre>"
        Y  escribimos la direccion"<Direccion>"
        Y  escribimos la localidad"<Localidad>"
        Y  escribimos el departamento"<Departamento>"
        Y  escribimos domicilio de entrega"<Domicilio de entrega>"
        Y  escribimos el descuento"<Descuento>"
        Y  escribimos el email enviofactura"<EmailenvioFactura>"
        Y  seleccionamos EsProveedorEsCliente


        Entonces validar los datos correctos

        Ejemplos:
            | navegador | Tipo Documento | Numero Documento | Pais | Razon Social              | Nombre    | Direccion | Localidad | Departamento | Domicilio de entrega | Descuento | EmailenvioFactura     |
            | chrome    | Otros          | 70304898         | Perú | Giancarlo TIRADO ARANA SA | GIANCARLO | CHEPEN    | CHEPEN    | LA LIBERTAD  | CHEPEN               | 12        | gtirado@unitru.edu.pe |

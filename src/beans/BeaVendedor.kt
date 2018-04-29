package beans

class BeaVendedor(
        id: Int,
        nombre: String,
        apellido: String,
        telefono: String,
        email: String,
        estado: Int,
        usuario: BeaUsuario,
        var cedula: String,
        var ubicacion: String,
        var distribuidor: BeaDistribuidor
) : BeaPersona(id, nombre, apellido, telefono, email, estado, usuario) {

}
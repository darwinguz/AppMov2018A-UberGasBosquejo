package beans

class BeaCliente(
        id: Int,
        nombre: String,
        apellido: String,
        telefono: String,
        email: String,
        estado: Int,
        usuario: BeaUsuario?,
        var tipo: String
) : BeaPersona(id, nombre, apellido, telefono, email, estado, usuario) {

}
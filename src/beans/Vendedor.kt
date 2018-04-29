package beans

class Vendedor(
        id: Int,
        nombre: String,
        apellido: String,
        telefono: String,
        email: String,
        estado: Int,
        usuario: Usuario,
        var cedula: String,
        var ubicacion: String,
        var distribuidor: Distribuidor
) : Persona(id, nombre, apellido, telefono, email, estado, usuario) {

}
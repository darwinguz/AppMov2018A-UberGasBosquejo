package beans

class Cliente(
        id: Int,
        nombre: String,
        apellido: String,
        telefono: String,
        email: String,
        estado: Int,
        usuario: Usuario,
        var tipo: String
) : Persona(id, nombre, apellido, telefono, email, estado, usuario) {

}
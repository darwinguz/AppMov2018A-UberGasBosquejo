package beans

open class Persona(
        var id: Int,
        var nombre: String,
        var apellido: String,
        var telefono: String,
        var email: String,
        var estado: Int,
        var usuario: Usuario
) {

}

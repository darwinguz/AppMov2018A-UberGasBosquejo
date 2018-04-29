package beans

class Distribuidor(
        var id: Int,
        var ruc: String,
        var nombre: String,
        var email: String,
        var telefonoMovil: String,
        var telefonoFijo: String,
        var direccion: String,
        var estado: Int,
        var usuario: Usuario
) {

}
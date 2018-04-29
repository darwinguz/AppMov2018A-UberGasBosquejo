package beans

class BeaDistribuidor(
        var id: Int,
        var ruc: String,
        var nombre: String,
        var email: String,
        var telefonoMovil: String,
        var telefonoFijo: String,
        var direccion: String,
        var estado: Int,
        var usuario: BeaUsuario
) {

}
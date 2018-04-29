package beans

import java.time.LocalDateTime

class BeaUsuario(
        var id: Int,
        var nick: String,
        var password: String,
        var estado: Int,
        var rol: String,
        var ultimoAcceso: LocalDateTime
) {

    init {
        println("logueado...")
    }
}

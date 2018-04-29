package beans

import java.time.LocalDateTime

class Usuario(
        var id: Int,
        var nick: String,
        var password: String,
        var estado: Int,
        var tipo: String,
        var ultimoAcceso: LocalDateTime
) {

    init {
        println("logueado...")
    }
}

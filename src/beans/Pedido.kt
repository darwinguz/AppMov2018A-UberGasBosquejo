package beans

import java.math.BigDecimal
import java.time.LocalDateTime

class Pedido(
        var id: Int,
        var cliente: Cliente,
        var vendedor: Vendedor,
        var fechaHora: LocalDateTime,
        var cantidad: Int,
        var tipoPago: String,
        var precioTotal: BigDecimal,
        var ubicacion: String,
        var estado: Int
) {

    fun pagar() {
        estado = 1;
    }

    fun cancelar() {
        estado = -1;
    }
}
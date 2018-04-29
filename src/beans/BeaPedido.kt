package beans

import java.math.BigDecimal
import java.time.LocalDateTime

class BeaPedido(
        var id: Int,
        var cliente: BeaCliente,
        var vendedor: BeaVendedor?,
        var fechaHora: LocalDateTime,
        var cantidad: Int,
        var precioTotal: BigDecimal,
        var formaPago: String,
        var ubicacion: String,
        var estado: Int
) {

}
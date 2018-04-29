package beans

import java.math.BigDecimal
import java.time.LocalDateTime

class Gas(
        var id: Int,
        var descripcion: String,
        var saldo: Int,
        var precioVenta: BigDecimal,
        var precioCompra: BigDecimal,
        var ultimaActualizacion: LocalDateTime,
        var estado: Int,
        var distribuidor: Distribuidor
) {

}
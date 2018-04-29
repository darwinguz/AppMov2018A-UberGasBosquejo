package servicios.implementaciones

import beans.BeaCliente
import beans.BeaPedido
import beans.BeaVendedor
import constantes.EnuGas
import constantes.EnuPedido
import database.TabPedido
import servicios.interfaces.IntPedido
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

class ImpPedido : IntPedido {

    override fun generarPedido(cliente: BeaCliente, ubicacion: String) {
        var pedido = BeaPedido(
                1,
                cliente,
                null,
                LocalDateTime.now(),
                //TODO permitir que el usuario indique el numero de tanques requeridos
                EnuPedido.CANTIDAD_MINIMA.valor,
                //TODO confirmar precio del gas segun distribuidor
                BigDecimal(EnuGas.PRECIO_FIJO.valorDouble),
                //TODO aumentar formas de pago
                EnuPedido.FORMA_PAGO_EFECTIVO.nombre,
                ubicacion,
                EnuPedido.ESTADO_NO_ATENDIDO.valor
        )
        TabPedido.insert(pedido)
    }

    override fun obtenerPedidos(estado: Int, fecha: LocalDate): Map<Int, BeaPedido> {
        return TabPedido.selectByStateAndDate(estado, fecha)
    }

    override fun atenderPedido(pedido: BeaPedido, vendedor: BeaVendedor) {
        pedido.estado = EnuPedido.ESTADO_EN_ATENCION.valor
        pedido.vendedor = vendedor
        TabPedido.update(pedido)
    }

    override fun facturarPedido(pedido: BeaPedido) {
        pedido.estado = EnuPedido.ESTADO_FACTURADO.valor
        TabPedido.update(pedido)
    }

}
package servicios.interfaces

import beans.BeaCliente
import beans.BeaPedido
import beans.BeaVendedor
import java.time.LocalDate

interface IntPedido {
    /**
     * Inserta un pedido en la base de datos.
     *@param cliente persona que desea el servicio
     *@param ubicacion lugar actual en el que se encuentra el cliente
     */
    fun generarPedido(cliente: BeaCliente, ubicacion: String)

    fun obtenerPedidos(estado: Int, fecha: LocalDate): Map<Int, BeaPedido>

    fun atenderPedido(pedido: BeaPedido, vendedor: BeaVendedor)

    fun facturarPedido(pedidoTomado: BeaPedido)

}
package servicios.interfaces

import beans.BeaVendedor

interface IntVendedor {
    fun cambiarEstado(vendedor: BeaVendedor, estado: Int)
}

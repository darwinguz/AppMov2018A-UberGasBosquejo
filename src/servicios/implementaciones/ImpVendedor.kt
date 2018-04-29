package servicios.implementaciones

import beans.BeaVendedor
import database.TabVendedor
import servicios.interfaces.IntVendedor

class ImpVendedor : IntVendedor {
    override fun cambiarEstado(vendedor: BeaVendedor, estado: Int) {
        vendedor.estado = estado
        TabVendedor.update(vendedor)
    }

}
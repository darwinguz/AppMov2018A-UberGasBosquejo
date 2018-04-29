package database

import beans.*
import java.time.LocalDate

//ejemplo de clase singleton
class Database {
    companion object {
        val datos: ArrayList<Int> = ArrayList()


        fun recuperarPorIndice(indice: Int): Int? {
            for (indiceArreglo in datos) {
                if (indiceArreglo == indice) {
                    return datos[indiceArreglo]
                }
            }
            return null
        }

    }
}

class TabCliente {
    companion object {
        val datos: HashMap<Int, BeaCliente> = HashMap()

        fun insert(objeto: BeaCliente): BeaCliente? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, BeaCliente> {
            return datos
        }

        fun selectById(id: Int): BeaCliente? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): BeaCliente? {
            var contador = 0
            var objeto: BeaCliente? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: BeaCliente): BeaCliente? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: BeaCliente): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}


class TabVendedor {
    companion object {
        val datos: HashMap<Int, BeaVendedor> = HashMap()

        fun insert(objeto: BeaVendedor): BeaVendedor? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, BeaVendedor> {
            return datos
        }

        fun selectById(id: Int): BeaVendedor? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): BeaVendedor? {
            var contador = 0
            var objeto: BeaVendedor? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: BeaVendedor): BeaVendedor? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: BeaVendedor): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}


class TabUsuario {
    companion object {
        val datos: HashMap<Int, BeaUsuario> = HashMap()

        fun insert(objeto: BeaUsuario): BeaUsuario? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, BeaUsuario> {
            return datos
        }

        fun selectById(id: Int): BeaUsuario? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): BeaUsuario? {
            var contador = 0
            var objeto: BeaUsuario? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: BeaUsuario): BeaUsuario? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: BeaUsuario): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}


class TabDistribuidor {
    companion object {
        val datos: HashMap<Int, BeaDistribuidor> = HashMap()

        fun insert(objeto: BeaDistribuidor): BeaDistribuidor? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, BeaDistribuidor> {
            return datos
        }

        fun selectById(id: Int): BeaDistribuidor? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): BeaDistribuidor? {
            var contador = 0
            var objeto: BeaDistribuidor? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: BeaDistribuidor): BeaDistribuidor? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: BeaDistribuidor): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}


class TabGas {
    companion object {
        val datos: HashMap<Int, BeaGas> = HashMap()

        fun insert(objeto: BeaGas): BeaGas? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, BeaGas> {
            return datos
        }

        fun selectById(id: Int): BeaGas? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): BeaGas? {
            var contador = 0
            var objeto: BeaGas? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: BeaGas): BeaGas? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: BeaGas): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}

class TabPedido {
    companion object {
        val datos: HashMap<Int, BeaPedido> = HashMap()

        fun insert(objeto: BeaPedido): BeaPedido? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, BeaPedido> {
            return datos
        }

        fun selectById(id: Int): BeaPedido? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): BeaPedido? {
            var contador = 0
            var objeto: BeaPedido? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun selectByStateAndDate(estado: Int, fecha: LocalDate): Map<Int, BeaPedido> {
            return datos.filterValues { pedido -> pedido.estado == estado && pedido.fechaHora.toLocalDate().equals(fecha) }
        }

        fun update(objeto: BeaPedido): BeaPedido? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: BeaPedido): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}

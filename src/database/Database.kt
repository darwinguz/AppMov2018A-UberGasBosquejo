package database

import beans.*

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
        val datos: HashMap<Int, Cliente> = HashMap()

        fun insert(objeto: Cliente): Cliente? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, Cliente> {
            return datos
        }

        fun selectById(id: Int): Cliente? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): Cliente? {
            var contador = 0
            var objeto: Cliente? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: Cliente): Cliente? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: Cliente): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}


class TabVendedor {
    companion object {
        val datos: HashMap<Int, Vendedor> = HashMap()

        fun insert(objeto: Vendedor): Vendedor? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, Vendedor> {
            return datos
        }

        fun selectById(id: Int): Vendedor? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): Vendedor? {
            var contador = 0
            var objeto: Vendedor? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: Vendedor): Vendedor? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: Vendedor): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}


class TabUsuario {
    companion object {
        val datos: HashMap<Int, Usuario> = HashMap()

        fun insert(objeto: Usuario): Usuario? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, Usuario> {
            return datos
        }

        fun selectById(id: Int): Usuario? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): Usuario? {
            var contador = 0
            var objeto: Usuario? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: Usuario): Usuario? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: Usuario): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}


class TabDistribuidor {
    companion object {
        val datos: HashMap<Int, Distribuidor> = HashMap()

        fun insert(objeto: Distribuidor): Distribuidor? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, Distribuidor> {
            return datos
        }

        fun selectById(id: Int): Distribuidor? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): Distribuidor? {
            var contador = 0
            var objeto: Distribuidor? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: Distribuidor): Distribuidor? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: Distribuidor): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}


class TabGas {
    companion object {
        val datos: HashMap<Int, Gas> = HashMap()

        fun insert(objeto: Gas): Gas? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, Gas> {
            return datos
        }

        fun selectById(id: Int): Gas? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): Gas? {
            var contador = 0
            var objeto: Gas? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: Gas): Gas? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: Gas): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}

class TabPedido {
    companion object {
        val datos: HashMap<Int, Pedido> = HashMap()

        fun insert(objeto: Pedido): Pedido? {
            return datos.put(objeto.id, objeto)
        }

        fun selectAll(): HashMap<Int, Pedido> {
            return datos
        }

        fun selectById(id: Int): Pedido? {
            return datos.getValue(id)
        }

        fun selectByIndex(indice: Int): Pedido? {
            var contador = 0
            var objeto: Pedido? = null
            datos.forEach { _, v ->
                if (contador++ == indice) {
                    objeto = v
                }
            }
            return objeto
        }

        fun update(objeto: Pedido): Pedido? {
            return datos.replace(objeto.id, objeto)
        }

        fun delete(objeto: Pedido): Boolean {
            return datos.remove(objeto.id, objeto)
        }
    }
}

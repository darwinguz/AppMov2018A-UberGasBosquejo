package aplicacion

import Constantes.EnuCliente
import Constantes.EnuUsuario
import beans.Cliente
import beans.Usuario
import database.Database
import database.TabCliente
import java.time.LocalDateTime

fun main(args: Array<String>) {
    Database.datos.add(43)
    Database.datos.add(4)
    Database.datos.add(3)
    Database.datos.add(20)
    Database.datos.add(34)
    Database.datos.add(14)
    Database.datos.add(9)

    println(Database.recuperarPorIndice(4))

    TabCliente.insert(Cliente(
            1,
            "Darwin",
            "Guzman",
            "0999769502",
            "dga_guz@hotmail.es",
            EnuCliente.ESTADO.valor,
            Usuario(1, "darwinguz", "root", EnuUsuario.ESTADO_ACTIVO.valor, "Cliente", LocalDateTime.now()),
            EnuCliente.TIPO_MAYORISTA.nombre
    ))

    TabCliente.insert(Cliente(
            2,
            "Freddy",
            "Guzman",
            "0987749767",
            "fga_guz@hotmail.es",
            EnuCliente.ESTADO.valor,
            Usuario(2, "freddyguz", "root", EnuUsuario.ESTADO_CONFIRMACION_EMAIL.valor, "Cliente", LocalDateTime.now()),
            EnuCliente.TIPO_MINORISTA.nombre
    ))

    println(TabCliente.selectById(2))
}
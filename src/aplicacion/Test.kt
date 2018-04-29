package aplicacion

import beans.*
import constantes.*
import database.*
import servicios.implementaciones.ImpPedido
import servicios.implementaciones.ImpVendedor
import java.math.BigDecimal
import java.time.LocalDate
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

    var usuario1 = BeaUsuario(
            1,
            "darwinguz",
            "root",
            EnuUsuario.ESTADO_ACTIVO.valor,
            EnuUsuario.ROL_CLIENTE.nombre,
            LocalDateTime.now()
    )
    TabUsuario.insert(usuario1)

    var cliente1 = BeaCliente(
            1,
            "Darwin",
            "Guzman",
            "0999769502",
            "dga_guz@hotmail.es",
            EnuCliente.ESTADO.valor,
            usuario1,
            EnuCliente.TIPO_MAYORISTA.nombre
    )
    TabCliente.insert(cliente1)

    var usuario2 = BeaUsuario(
            2,
            "freddyguz",
            "root",
            EnuUsuario.ESTADO_CONFIRMACION_EMAIL.valor,
            EnuUsuario.ROL_CLIENTE.nombre,
            LocalDateTime.now()
    )
    TabUsuario.insert(usuario2)
    var cliente2 = BeaCliente(
            2,
            "Freddy",
            "Guzman",
            "0987749767",
            "fga_guz@hotmail.es",
            EnuCliente.ESTADO.valor,
            usuario2,
            EnuCliente.TIPO_MINORISTA.nombre
    )
    TabCliente.insert(cliente2)

    var usuario3 = BeaUsuario(
            3,
            "srgas",
            "root",
            EnuUsuario.ESTADO_CONFIRMACION_EMAIL.valor,
            EnuUsuario.ROL_DISTRIBUIDOR.nombre,
            LocalDateTime.now()
    )
    TabUsuario.insert(usuario3)

    var distribuidor1 = BeaDistribuidor(
            1,
            "1745695843001",
            "Señor BeaGas",
            "srgas@gmail.com",
            "0995748674",
            "3056784",
            "San Bartolo",
            EnuDistribuidor.ESTADO_CON_GAS.valor,
            usuario3
    )
    TabDistribuidor.insert(distribuidor1)

    var gas1 = BeaGas(
            1,
            "BeaGas azul",
            100,
            BigDecimal(2.50),
            BigDecimal(1.80),
            LocalDateTime.now(),
            EnuGas.ESTADO_DISPONIBLE.valorInt,
            distribuidor1
    )
    TabGas.insert(gas1)

    var usuario4 = BeaUsuario(
            4,
            "andressal",
            "root",
            EnuUsuario.ESTADO_CONFIRMACION_EMAIL.valor,
            EnuUsuario.ROL_VENDEDOR.nombre,
            LocalDateTime.now()
    )
    TabUsuario.insert(usuario4)

    var vendedor1 = BeaVendedor(
            1,
            "Andres",
            "Salazar",
            "0957463548",
            "andres.salazar@gmail.com",
            EnuVendedor.ESTADO_DISPONIBLE.valor,
            usuario4,
            "1725594837",
            "174958",
            distribuidor1
    )
    TabVendedor.insert(vendedor1)

    //app core
    //cliente 1
    var srvPedidoC1 = ImpPedido()
    var ubicacionActualC1 = "Calle A y Av. Mariscal Sucre"
    srvPedidoC1.generarPedido(cliente1, ubicacionActualC1)

    //cliente 2
    var srvPedidoC2 = ImpPedido()
    var ubicacionActualC2 = "Rumipamba y Av. Pedro Vicente Maldonado"
    srvPedidoC2.generarPedido(cliente2, ubicacionActualC2)

    //vendedor
    var srvPedidoV = ImpPedido()
    var pedidosNoAtendidos = srvPedidoV.obtenerPedidos(EnuPedido.ESTADO_NO_ATENDIDO.valor, LocalDate.now())
    //tomo un pedido cualquiera
    var pedidoTomado = pedidosNoAtendidos.get(1)
    srvPedidoV.atenderPedido(pedidoTomado!!, vendedor1)
    //cambio el estado del vendedor
    var srvVendedor = ImpVendedor()
    srvVendedor.cambiarEstado(vendedor1, EnuVendedor.ESTADO_OCUPADO.valor)

    //una vez entregado el pedido
    srvPedidoV.facturarPedido(pedidoTomado)
    srvVendedor.cambiarEstado(vendedor1, EnuVendedor.ESTADO_DISPONIBLE.valor)

    //other
    println(TabCliente.selectById(2))
}
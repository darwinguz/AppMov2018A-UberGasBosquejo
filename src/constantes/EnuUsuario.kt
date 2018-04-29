package constantes

enum class EnuUsuario(val nombre: String, val valor: Int) {
    ROL_CLIENTE("BeaCliente", 1),
    ROL_VENDEDOR("BeaVendedor", 2),
    ROL_DISTRIBUIDOR("BeaDistribuidor", 3),

    ESTADO_CONFIRMACION_EMAIL("Confirmación Email", 1),
    ESTADO_ACTIVO("Activo", 2),
    ESTADO_INACTIVO("Inactivo", 3),
    ESTADO_BLOQUEADO("Bloqueado", 4),
}
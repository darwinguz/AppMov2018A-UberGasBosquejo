package Constantes

enum class EnuUsuario(val nombre: String, val valor: Int) {
    TIPO_CLIENTE("Cliente", 1),
    TIPO_VENDEDOR("Vendedor", 2),
    TIPO_DISTRIBUIDOR("Distribuidor", 3),

    ESTADO_CONFIRMACION_EMAIL("Confirmación Email", 1),
    ESTADO_ACTIVO("Activo", 2),
    ESTADO_INACTIVO("Inactivo", 3),
    ESTADO_BLOQUEADO("Bloqueado", 4),
}
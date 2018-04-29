package constantes

enum class EnuPedido(val nombre: String, val valor: Int) {
    FORMA_PAGO_EFECTIVO("Efectivo", 1),
    FORMA_PAGO_TARJETA("Tarjeta", 2),

    ESTADO_NO_ATENDIDO("No atendido",1),
    ESTADO_EN_ATENCION("En atención", 2),
    ESTADO_FACTURADO("Facturado", 3),

    CANTIDAD_MINIMA("Cantidad mínima", 1)

}
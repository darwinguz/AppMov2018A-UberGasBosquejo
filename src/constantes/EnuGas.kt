package constantes

enum class EnuGas(val nombre: String, val valorInt: Int, val valorDouble: Double) {
    ESTADO_DISPONIBLE("Disponible", 1, 0.0),
    ESTADO_NO_DISPONIBLE("No Diponible", 2, 0.0),

    PRECIO_FIJO("Precio fijo", 0, 2.50)


}
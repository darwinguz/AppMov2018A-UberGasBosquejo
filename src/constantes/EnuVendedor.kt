package constantes

enum class EnuVendedor(val nombre: String, val valor: Int) {
    ESTADO_DISPONIBLE("Disponible", 1),
    ESTADO_OCUPADO("Ocupado", 2),
    ESTADO_INACTIVO("Inactivo", 3),

}
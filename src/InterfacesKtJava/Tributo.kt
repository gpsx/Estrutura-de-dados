package InterfacesKtJava

class Tributo {
    val tributos = mutableListOf<Tributavel>()

    fun adicionaTributável(t : Tributavel) = tributos.add(t)

    fun caltTotalTributo() : Double {
        var total = 0.0
        tributos.forEach {
            total += it.getValorTributo()
        }
        return total
    }
}
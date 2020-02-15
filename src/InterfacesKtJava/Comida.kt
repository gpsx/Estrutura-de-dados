package InterfacesKtJava

class Comida(
        codigo : Int,
        nome : String,
        preco : Double,
        val quantVitamina : Int
) : Produto(codigo, nome, preco) {

    override fun getValorTributo(): Double {
        return preco * 0.1
    }

    override fun toString(): String {
        return "Comida(quantVitamina=$quantVitamina)"
    }
}
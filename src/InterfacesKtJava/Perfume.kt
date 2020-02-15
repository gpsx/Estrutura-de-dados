package InterfacesKtJava

class Perfume(
        codigo : Int,
        nome : String,
        preco : Double,
        val fragrancia : String
) : Produto(codigo, nome, preco) {

    override fun getValorTributo(): Double {
        return preco * 0.4
    }

    override fun toString(): String {
        return "Perfume(fragrancia='$fragrancia')"
    }

}
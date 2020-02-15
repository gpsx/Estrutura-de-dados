package InterfacesKtJava

abstract class Produto(
        val codigo: Int,
        val descricao : String,
        val preco : Double
) : Tributavel

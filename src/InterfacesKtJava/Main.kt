package InterfacesKtJava

fun main() {
    val tributaveis = listOf<Tributavel>(
            Comida(1, "Batata", 10.2, 10),
            Comida(2, "Pato", 153.2, 10),
            Comida(3, "Bodi", 364.2, 10),
            Comida(4, "Cavalo", 87346.2, 10),
            Perfume(5, "perfo", 108.9, "De cu"),
            Perfume(6, "perfo", 108.9, "De coco")
    )

    val tributo = Tributo()

    tributaveis.map {
        tributo.adicionaTributável(it)
    }

    println(tributo.caltTotalTributo())
}
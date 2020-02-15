package Ex2

abstract class Figura(var cor: String, var espressura: String) {
    abstract fun calcArea(): Double
    override fun toString(): String {
        return "Figura(cor='$cor', espressura='$espressura')"
    }

}
package Ex2

import Ex1.Circulo
import Ex1.Quadrado
import Ex1.Retangulo
import Ex1.Triangulo
import kotlin.math.roundToLong

fun main() {
    val q = Quadrado("Azul","20dp", 10.1)
    val r = Retangulo("Vermelho", "21dp", 10.0, 15.0)
    val t = Triangulo("Amarelo", "10dp", 10.0, 10.0)
    val c = Circulo("Verde", "21dp", 50.0)

    val formas = listOf(q,r,t,c)
    formas.map {
        println(it.toString())
        println(it.calcArea().roundToLong())
    }

}
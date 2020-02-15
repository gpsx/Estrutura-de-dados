package Ex1

import Ex2.Figura

class Quadrado(
        cor : String,
        espessura: String,
        val lado: Double) : Figura(cor, espessura)
{
    override fun calcArea(): Double {
        return Math.pow(lado, 2.0)
    }

    override fun toString(): String {
        return "Quadrado(" +
                "lado=$lado" +
                ")" + super.toString()
    }

}

class Retangulo(
        cor: String,
        espessura: String,
        val lado: Double,
        val altura: Double) : Figura(cor, espessura)
{
    override fun calcArea(): Double {
        return lado*altura
    }

    override fun toString(): String {
        return "Retangulo(lado=$lado, altura=$altura)" + super.toString()
    }


}

class Triangulo(
        cor: String,
        espessura: String,
        val largura: Double,
        val altura: Double) : Figura(cor, espessura)
{
    override fun calcArea(): Double {
        return largura*altura/2
    }

    override fun toString(): String {
        return "Triangulo(largura=$largura, altura=$altura)" + super.toString()
    }


}

class Circulo(
        cor: String,
        espessura: String,
        val raio: Double) : Figura(cor, espessura)
{
    override fun calcArea(): Double {
        return Math.PI * Math.pow(raio,2.0)
    }

    override fun toString(): String {
        return "Circulo(raio=$raio)" + super.toString()
    }


}

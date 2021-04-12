import java.util.*

fun main() {
    println("\n \n-----FUNCAO-RECURSIVA-----")
    recursiva()
}

fun recursiva() {

    fun randomDia(): String {
        val semana = arrayOf(
            "Segunda", "Terça-Feira", "Quarta-Feira", "Quinta-Feira",
            "Sexta-Feira", "Sábado", "Domingo"
        )
        return semana[Random().nextInt(semana.size)]
    }

    fun rotina(dia: String): String {
        return when (dia) {
            "Segunda" -> "Feriado"
            "Terça-Feira" -> "Home-Office"
            "Quarta-Feira" -> "Presencial"
            "Quinta-Feira" -> "Meio-período "
            "Sexta-Feira" -> "HH"
            else -> "Folga"
        }
    }

    fun rotinaDia() {
        val dia = randomDia()
        val rotina = rotina(dia)
        println("Hoje é $dia, e é dia de $rotina")
    }
    return rotinaDia()
}
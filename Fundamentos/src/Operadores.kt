fun main() {
    println("\n -----CONVERSAO-----")
    conversao("5")
    println("\n -----CONCATENAR-STRING-----")
    concatenaStirng("Fernando", "Gabriel")
    println("\n -----COMPARAR-CONDICAO-----")
    comparaCondicao(2, 5)
    println("\n -----NULL-----")
    nulidade(null)
    println("\n -----LISTA------")
    lista("Fernando", "12345678900", "12345678-x")
    println("\n -----MATRIZ------")
    matriz("rua dos bobos", "01234-567", "0")
    println("\n -----LOOP------")
    loop()
    println("\n \n-----DO-WHILE-----")
    doWhile()
    println("\n \n-----WHEN------")
    whenExoression(1)
}

fun conversao(i: String) {
    println("Número informado $i")

    val C1 = i.toDouble()
    println("Tipo: Double: $C1")

    val C2 = i.toInt()
    println("Tipo: Int: $C2")

    val C3 = i.toLong()
    println("Tipo: Long: $C3")

    val C4 = i.toCharArray()
    print("Tipo: CharArray: ")
    println(C4)
}

fun concatenaStirng(i: String, j: String) {
    println("Primeira String: $i, " + "Segunda String: $j")
    println("Concatenando as Strings ${i + j}")
}

fun comparaCondicao(primeiroNumero: Int, segundoNumero: Int) {
    if (primeiroNumero > segundoNumero) {
        println("O primeiro númeor é o maior")
    } else if (primeiroNumero < segundoNumero) {
        println("O segundo numero é o maior")
    } else {
        println("Os números são iguais")
    }
}

fun nulidade(i: Int?) {
    var i = i ?: "Variavel Null, por padrão é 0"
    println(i)
}

fun lista(nome: String, cpf: String, rg: String) {
    val informacao = listOf(nome, cpf, rg)
    println(informacao)
}

fun matriz(rua: String, CEP: String, numeroCasa: String) {
    val endereco = arrayOf(rua, CEP, numeroCasa)
    println(java.util.Arrays.toString(endereco))
}

fun loop() {
    print("1..5 -> ")
    for (i in 1..5) print(i)
    print("\n5 downTo 1 -> ")
    for (i in 5 downTo 1) print(i)
    print("\n0..10 step 2 -> ")
    for (i in 0..10 step 2) print(i)
    print("\n'a'..'f' -> ")
    for (i in 'a'..'f') print(i)
}

fun whenExoression(x: Int) {
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> print("numero não correspondente ao esperado, digite '1' ou '2' ")
    }
}

fun doWhile() {
    var numero = 0

    println("Todos os valores numéricos divisíveis por 4 e menores que 50.")

    do {
        if ((numero % 4 == 0)) {
            print("$numero  | ")
            numero += 1
        }
        numero++
    } while (numero <= 50)
}
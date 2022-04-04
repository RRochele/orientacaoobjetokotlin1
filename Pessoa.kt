package kotlindigitalinnovation

fun main() {
    println("Bem vindo ao Bank")
    val contaRochele = Conta()
    contaRochele.titular = "Rochele"
    contaRochele.numero = 1000
    contaRochele.saldo = 200.0


    val contaJoaquim = Conta()
    contaJoaquim.titular = "Joaquim"
    contaJoaquim.numero = 1001
    contaJoaquim.saldo = 300.0

    println(contaRochele.titular)
    println(contaRochele.numero)
    println(contaRochele.saldo)
    println()

    println(contaJoaquim.titular)
    println(contaJoaquim.numero)
    println(contaJoaquim.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Rochele $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++

    }
}

//    for (i in 5 downTo 1) {
//        while ()
//        }
//        val titular: String = "Rochele $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//
//        println("titular $titular")
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//        testaCondicoes(saldo)


//fun testaCondicoes(saldo: Double) {
//    if (saldo > 0.0) {
//        println("conta é positiva")
//    } else if (saldo == 0.0) {
//        println("conta é neutra")
//    } else {
//        println("conta é negativa")
//    } }


//    // outra maneira usando when
//    when {
//        saldo > 0.0 -> println("conta é positiva")
//        saldo == 0.0 -> println("conta é neutra")
//        // condição contraria:verificar se é falso e em seguida verificar se é o zero
//        else -> println("conta é negativa")
//    }





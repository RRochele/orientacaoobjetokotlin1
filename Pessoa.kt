package kotlindigitalinnovation

fun main() {
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


fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    // outra maneira usando when
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        // condição contraria:verificar se é falso e em seguida verificar se é o zero
        else -> println("conta é negativa")
    }
}




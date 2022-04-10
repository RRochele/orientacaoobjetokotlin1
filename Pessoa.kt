package kotlindigitalinnovation

fun main() {
    println("Bem vindo ao Bank")
    val contaRochele = Conta()
    contaRochele.titular = "Rochele"
    contaRochele.numero = 1000
    contaRochele.setSaldo(200.0)


    val contaJoaquim = Conta()
    contaJoaquim.titular = "Joaquim"
    contaJoaquim.numero = 1001
    contaJoaquim.setSaldo(300.0)

    println(contaRochele.titular)
    println(contaRochele.numero)
    println(contaRochele.getSaldo())
    println()

    println(contaJoaquim.titular)
    println(contaJoaquim.numero)
    println(contaJoaquim.getSaldo())
}

//    println("depositando na conta da Rochele")
//    contaRochele.deposita(50.0)
//    println(contaRochele.saldo)
//
//    println("depositando na conta da Joaquim")
//    contaJoaquim.deposita(70.0)
//    println(contaJoaquim.saldo)
//
//    println("sacando na conta da Rochele")
//    contaRochele.saca(250.0)
//    println(contaRochele.saldo)
//
//    println("sacando na conta de Joaquim")
//    contaJoaquim.saca(100.0)
//    println(contaJoaquim.saldo)
//
//    println("saque em excesso na conta da Rochele")
//    contaRochele.saca(100.0)
//    println(contaRochele.saldo)
//
//    println("saque em excesso na conta do Joaquim")
//    contaJoaquim.saca(500.0)
//    println(contaJoaquim.saldo)
//
//    println("Transferência da conta do Joaquim para Rochele")
//
//    if (contaJoaquim.transfere(100.0, contaRochele)) {
//        println("TRansferência sucedida")
//    } else {
//        println("Falha na transferência")
//    }
//    println(contaRochele.saldo)
//    println(contaJoaquim.saldo)
//}
//

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        //this: vc esta mexendo em alguma coisa do próprio objeto
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true

        }
        return false

    }
    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        saldo= valor

    }
}



//fun testaCopiasEReferencias() {
//    // variaveis do tipo inteiro
//
//    val numeroX = 10
//    var numeroY = numeroX
//    numeroY++
//    println("numeroX $numeroX")
//    println("numeroY $numeroY")
//
//    // joao aponta para a conta e maria tambem.
//    // lidar com objeto é lidar com referência
//    val contaJoao = Conta()
//    contaJoao.titular = "João"
//    var contaMaria = Conta()
//    contaMaria.titular = "Maria"
//    println("titular conta joão : ${contaJoao.titular}")
//    println("titular conta maria : ${contaMaria.titular}")
//
//    println(contaJoao)
//    println(contaMaria)
//
//}

//fun testaLacos() {
//    var i = 0
//    while (i < 5) {
//        val titular: String = "Rochele $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//        i++
//
//    }
//}

//for (i in 5 downTo 1) {
//    while ()
//}
//
//val titular: String = "Rochele $i"
//val numeroConta: Int = 1000 + i
//var saldo = i + 10.0
//
//
//println("titular $titular")
//println("numero da conta $numeroConta")
//println("saldo da conta $saldo")
//println()
//testaCondicoes(saldo)
//
//
//fun testaCondicoes(saldo: Double) = if (saldo > 0.0) {
//    println("conta é positiva")
//} else if (saldo == 0.0) {
//    println("conta é neutra")
//} else {
//    println("conta é negativa")
//}
//}


// outra maneira usando when
//when {
//    saldo > 0.0 -> println("conta é positiva")
//    saldo == 0.0 -> println("conta é neutra")
//    // condição contraria:verificar se é falso e em seguida verificar se é o zero
//    else -> println("conta é negativa")
//}





package kotlindigitalinnovation

fun main() {
    println("Bem vindo ao Bank")

    val contaRochele = Conta( titular= "Rochele", numero = 1000)
    contaRochele.deposita(200.0)
    //contaRochele.setSaldo(200.0)


    val contaJoaquim = Conta(titular = "Joaquim", numero = 1001)
    contaJoaquim.deposita(300.0)
    //contaJoaquim.setSaldo(300.0)

    println(contaRochele.titular)
    println(contaRochele.numero)
    //println(contaRochele.getSaldo())
    println()

    println(contaJoaquim.titular)
    println(contaJoaquim.numero)
    //println(contaJoaquim.getSaldo())

    println("depositando na conta da Rochele")
    contaRochele.deposita(50.0)
    println(contaRochele.saldo)

    println("depositando na conta da Joaquim")
    contaJoaquim.deposita(70.0)
    println(contaJoaquim.saldo)

    println("sacando na conta da Rochele")
    contaRochele.saca(250.0)
    println(contaRochele.saldo)

    println("sacando na conta de Joaquim")
    contaJoaquim.saca(100.0)
    println(contaJoaquim.saldo)

    println("saque em excesso na conta da Rochele")
    contaRochele.saca(100.0)
    println(contaRochele.saldo)

    println("saque em excesso na conta do Joaquim")
    contaJoaquim.saca(500.0)
    println(contaJoaquim.saldo)

    println("Transferência da conta do Joaquim para Rochele")

    if (contaJoaquim.transfere(valor= 100.0, destino = contaRochele)) {
        println("TRansferência sucedida")
    } else {
        println("Falha na transferência")
    }
    println(contaRochele.saldo)
    println(contaJoaquim.saldo)
}

class Conta(
    var titular: String,
    val numero: Int
    ) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
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


    fun testaCopiasEReferencias() {
        // variaveis do tipo inteiro

        val numeroX = 10
        var numeroY = numeroX
        numeroY++

        println("numeroX $numeroX")
        println("numeroY $numeroY")

        // joao aponta para a conta e maria tambem.
        // lidar com objeto é lidar com referência
        val contaJoao = Conta("João", 1002)
        contaJoao.titular = "João"
        val contaMaria = Conta("Maria", 1003)
        contaMaria.titular = "Maria"
        println("titular conta joão : ${contaJoao.titular}")
        println("titular conta maria : ${contaMaria.titular}")

        println(contaJoao)
        println(contaMaria)

    }

//    fun testaLacos() {
//        var i = 0
//        while (i < 5) {
//            val titular: String = "Rochele $i"
//            val numeroConta: Int = 1000 + i
//            val saldo = i + 10.0
//
//            println("titular $titular")
//            println("numero da conta $numeroConta")
//            println("saldo da conta $saldo")
//            println()
//            i++
//
//        }
//    }

//    for (i in 5 downTo 1)
//    {
//        while ()
//    }

//    val titular: String = "Rochele $i"
//    val numeroConta: Int = 1000 + i
//    var saldo = i + 10.0
//
//
//    println("titular $titular")
//    println("numero da conta $numeroConta")
//    println("saldo da conta $saldo")
//    println()

//    testaCondicoes(saldo)

    fun testaCondicoes(saldo: Double) = if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
}


//outra maneira usando when
//when {
//    saldo > 0.0 -> println("conta é positiva")
//    saldo == 0.0 -> println("conta é neutra")
//    // condição contraria:verificar se é falso e em seguida verificar se é o zero
//    else -> println("conta é negativa")
//}





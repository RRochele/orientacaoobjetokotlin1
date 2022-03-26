package kotlindigitalinnovation

class Pessoa (
  var nome: String= "Rochele",
  var cpf: String= "124.571.645-50"

        )

fun main(args: Array<String>) {
    val Rochele= Pessoa()

    println(Rochele.nome)
    println(Rochele.cpf)
}
fun main(args: Array<String>) {
    println("Hello World!")
    val titular: String = "Lucas"
    val numeroConta: Int = 999
    var saldo: Double = 0.0

    saldo += 100 + 2.0
    saldo += 10

    println("titular $titular")
    println("Número da conta $numeroConta")
    println("Saldo da conta $saldo")

    when {
        saldo > 0 -> println("Tem dinheiro na conta")
        saldo < 0 ->println("Sua conta está negativa")
        else -> println("Não tem dinheiro na conta")
    }
}
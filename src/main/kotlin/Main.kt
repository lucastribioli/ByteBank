fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank")

    for (i in 5 downTo  1){
        val titular: String = "Lucas $i"
        val numeroConta: Int = 999 + i
        var saldo: Double = 0.0

        saldo += 100 + 2.0 * i
        saldo += 10

        println("titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        testarCondicoes(saldo)
    }
}
fun testarCondicoes(saldo: Double){
    when {
        saldo > 0 -> println("Tem dinheiro na conta")
        saldo < 0 ->println("Sua conta está negativa")
        else -> println("Não tem dinheiro na conta")
    }
}
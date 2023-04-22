fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank")
    val conta = criarConta("Adilson", 12, 419.0)
    conta.depositar(7666.0)
    conta.sacar(10.0)

    println("Titular ${conta.titular}")
    println("Número da conta ${conta.numeroConta}")
    println("Saldo ${conta.saldo}")

    val conta2 = criarConta("Joãozinho", 1343, 41553.0)
    conta2.depositar(10.0)
    conta2.sacar(100000.0)

    println("Titular ${conta2.titular}")
    println("Número da conta ${conta2.numeroConta}")
    println("Saldo ${conta2.saldo}")

    conta2.transferir(conta, 100000.0)
}

class Conta {
    var titular = ""
    var numeroConta = 0
    var saldo = 0.0

    fun depositar(valor: Double){
        this.saldo += valor
        println("Valor depositado na conta do ${this.titular}, no valor de $valor")
    }

    fun sacar(valor:Double): Boolean{
        return if (this.saldo >= valor){
            this.saldo -= valor
            println("Saque concluído com sucesso, seu saldo agora é ${this.saldo}")
            true
        }else{
            println("Valor acima do permitido para saque, você tem apenas ${this.saldo}")
            false
        }
    }

    fun transferir(conta: Conta, valor: Double){
        if (conta.sacar(valor)){
            this.depositar(valor)
            println("Valor depositado na conta do ${this.titular}, com sucesso")
        }else{
            println("Valor não pode ser depositado")
        }

    }
}

fun criarConta(titular: String, numeroConta: Int, saldo: Double): Conta {
    val conta = Conta()
    conta.titular = titular
    conta.numeroConta = numeroConta
    conta.saldo = saldo

    return conta

}

fun testarLoop(){
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
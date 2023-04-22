fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank")
    val conta = Conta("Adilson", 12)
    conta.depositar(7666.0)
    conta.sacar(10.0)

    println("Titular ${conta.titular}")
    println("Número da conta ${conta.numeroConta}")
    println("Saldo ${conta.saldo}")

    val conta2 = Conta("Joãozinho", 1343)
    conta2.depositar(10.0)
    conta2.sacar(100000.0)

    println("Titular ${conta2.titular}")
    println("Número da conta ${conta2.numeroConta}")
    println("Saldo ${conta2.saldo}")

    conta2.transferir(conta, 100000.0)
}

class Conta(var titular: String, var numeroConta: Int) {
    var saldo = 0.0
        set(valor){
            if (valor > 0) {
                field = valor
            }
        }

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
# ByteBank
Projeto simples, simulando algumas funções de um banco digital, pelo terminal. Fiz esse projeto 
para praticar e aprender a linguagem Kotlin.

<img src="data:image/png;base64,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" />
Para mais informações acesse a documentaçãod da linguagem:
<a href="https://kotlinlang.org/docs/home.html"> Saiba mais... </a>

# Orientação a Objeto

## Projeto Banco
*Classe Pessoa* 

Foi criada uma classe simples para representar algo do mundo real.. 
Em seguida será incrementada.
A ideia desse projeto é criar um sistema para bancos.

`A classe é a estrutura de como vai ser o objeto`

`val`   eu posso alterar a informação a qualquer momento, mas o  CPF não é uma não é uma boa opção para ser alterada.
Desta forma, fiz com que o meu cfp sempre seja inicializado e não mais alterado.

`Private var cpf: String`

Toda informação tem seu *set* e seu *get* , deixando totalmente *private* 
Essa informação será visível apenas no escopo da `classe`

Logo , mesmo que eu a referencie.. eu não consigo "pegar" nem o *get*
Então, vou *setar* o **objeto**

`Uma vez que eu crio a instancia eu não consigo alterar`
~~~
Resumo: Posso usar o modificador de visibilidade para uma propriedade em si, mas decidi deixar como private somente o `set` que é a propriedade que atribui valor.
~~~

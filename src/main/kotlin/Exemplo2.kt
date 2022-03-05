fun main(){

val estoque = mutableListOf("Caneta", "Caderno", "Acessorios")
do {


    println("Estoque de Materiais Escolares")
    print(
        "Menu: \n\n1)Adicionar Item" + "\n2)Atualizar Lista de Itens \n3)Remover Item " +
                "\n4)Apresentar Itens em Estoque \n" + "5)Sair" +
                "\n\nDigite o que você deseja fazer:"
    )

    val materialEscolar = readLine()!!.toInt()


    when (materialEscolar) {
        //Funções sem retorno
        1 -> adiciona(estoque)
        2 -> atualiza(estoque)
        3 -> remove(estoque)
        4 -> lista(estoque)
    }
}while (materialEscolar != 5)
}
fun adiciona(estoque: MutableList<String>) {
    println("\nDigite o item a ser adicionado:")
    val materialEscolar = readLine()!!.uppercase()
    estoque.add(materialEscolar)
}

fun atualiza(estoque: MutableList<String>) {
    println("\nDigite o item da lista: ")
    val antigoItem = readLine()!!.uppercase()
    println("\nDigite o novo item: ")
    val novoItem = readLine()!!.uppercase()
    if (estoque.contains(antigoItem) && novoItem.isNotEmpty()) {
        estoque[estoque.indexOf(antigoItem)] = novoItem

    } else {
        println("Produto não encontrado")
    }

}

fun remove(estoque: MutableList<String>) {
    println("\nDigite o numero do item a ser removido:")
    val materialEscolar = readLine()!!.uppercase()
    if (estoque.contains(materialEscolar)){
        estoque.remove(materialEscolar)
    }else{
        println("Produto não encontrado")
    }

}

fun lista(estoque: MutableList<String>) {
    estoque.forEach{
        println(it)
    }

}

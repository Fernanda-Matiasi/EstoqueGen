fun main() {
    val estoque = arrayListOf("Caneta", "Lápis", "Borracha")

    println("***Estoque de Materiais Escolares***")
    print(
        "Menu: \n1)Adicionar Item" + "\n2)Atualizar Lista de Itens \n3)Remover Item " +
                "\n4)Apresentar Itens em Estoque \n" +
                "Digite o que você deseja fazer:"
    )

    val material = readLine()!!

    if (!(material == "1" || material == "2" || material == "3" || material == "4")) {
        println("Operação Inválida")
    } else {
        while (!(material == "1" || material == "2" || material == "3" || material == "4")) {
            when (estoque) {
                //Funções sem retorno
                "1" -> adiciona()
                "2" -> atualiza()
                "3" -> remove()
                "4" -> lista()
            }
        }
    }
}








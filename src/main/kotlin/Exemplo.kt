fun main(){

    val listaEstoque = mutableListOf<String>()

    while (true) {
        println("\n*****Estoque da Maria Chiquinha*****\n")

        println("1 - Adicionar Item: ")
        println("2 - Remover Item: ")
        println("3 - Atualizar Item: ")
        println("4 - Listar Itens: ")
        println("5 - Sair: ")

        println("\nEscolha uma opção: ")
        val opc = readLine()!!.toInt()

        println("\n")

        when (opc) {
            1 -> {
                print("Digite o item para ser adicionado no estoque: ")
                val item = readLine()!!

                if (item.isEmpty()) {
                    println("Valor inválido!")

                } else {
                    listaEstoque.add(item)
                    println("Item inserido com sucesso")
                }
            }

            2 -> {
                print("Digite o item para ser removido no estoque: ")
                val item = readLine()!!

                if (item.isEmpty()) {
                    println("Valor inválido")
                } else {
                    if (listaEstoque.contains(item)) {
                        listaEstoque.remove(item)
                        println("O item foi removido com sucesso")
                    } else {
                        println("O item não existe na lista")
                    }
                }
            }

            3 -> {
                println("Selecione um item de 0 a $listaEstoque.size - 1)")
                val pos = readLine()!!.toInt()

                if (pos in 0 ..(listaEstoque.size - 1)){
                    println("Digite o produto a ser atualizado: ")
                    val item = readLine()!!

                listaEstoque[pos] = item
                }else{
                    print("Esse item não existe!")
                }
            }

            4 -> {
                if (listaEstoque.isEmpty()) {
                    println("Oestoque está vazio")
                } else {
                    println("Item do Estoque")
                    listaEstoque.forEach {
                        println(it)
                    }
                }
            }
            else -> break
        }
    }
}



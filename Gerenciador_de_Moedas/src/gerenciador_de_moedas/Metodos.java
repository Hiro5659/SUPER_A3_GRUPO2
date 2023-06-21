package gerenciador_de_moedas;

import javax.swing.JOptionPane;

public class Metodos {

// Criando um array de moedas da classe Moeda e um contador para controlar a quantidade de moedas inseridas
    private Moeda[] moedas;
    private int contador;

    // Construtor da Classe Metodos
    public Metodos(int tamanho) {
        //Criar um novo array chamado moedas do tipo Moeda, com um tamanho especificado pelo parâmetro tamanho. Esse valor é dado na classe Menu(1)
        moedas = new Moeda[tamanho];
        // Atribuir o valor zero à variável contador. Essa variável é usada para acompanhar o número de moedas atualmente armazenadas no array moedas.
        contador = 0;
    }
// Método get para o contador, que retorna o valor do contador

    public int getContador() {
        return contador;
    }

    // Método para inserir moedas, se o contador for igual ao Array de moedas, invocar o método aumentarTamanhoArray
    public void adicionarMoeda(Moeda novaMoeda) {
        if (contador == moedas.length) {
            aumentarTamanhoArray();
        }
        //  novaMoeda é inserida na posição do contador no Array moedas
        moedas[contador] = novaMoeda;
        // Setamos o ID dessa novaMoeda com o ID do contador
        novaMoeda.setId(contador);
        //  Aumentamos o contador
        contador++;
    }

//  Método para aumentar tamanho do array
    public void aumentarTamanhoArray() {
        //  Um novo int é criado com o valor do comprimento do Array +1
        int novoTamanho = moedas.length + 1;
        //  Um Array temporário é criado com o comprimento referente ao int criado na linha de cima
        Moeda[] novoArray = new Moeda[novoTamanho];
        // Método arraycopy da classe System é utilizado, onde temos: vetor origem, pos. inicial no array origem, vetor destino, pos. inicial no array destino e n. de elementos
        // que serão copiados
        System.arraycopy(moedas, 0, novoArray, 0, moedas.length);
        // Igualamos o Array moedas com o novoArray
        moedas = novoArray;
    }

    // Quando utilizamos o println em um objeto, normalmente é retornado um endereço de memória, por isso utilizamos o metodo toString(), da classe moeda, que age automaticamente e não precisa ser invocado
    public void exibirMoedasArray() {
        System.out.println("Moedas existentes:");
        // Iteramos até chegarmos ao valor do contador
        for (int i = 0; i < contador; i++) {
            //Se o valor não for nulo(evitar exceções)
            if (moedas[i] != null) {
                // E printamos os valores percorridos no array moedas
                System.out.println(moedas[i]);
            }
        }
    }

    //Método removerMoeda, pega um parâmetro ID que representa o ID da moeda a ser removida
    public void removerMoeda(int id) {
//Começa um for loop da posição id até o contador - 1(passamos por todos os elemento que existem na array >= id)
        for (int i = id; i < contador - 1; i++) {
            //O loop é usado para mudar os elementos de posição > id um index para a esquerda, para não haver zeros
            moedas[i] = moedas[i + 1];
            //Se o elemento atual moedas[i] não for nulo(evitar exceções)
            if (moedas[i] != null) {
                // Chama o método setId() para atualizar seu ID para a nova posição i
                moedas[i].setId(i);
            }
        }

        // Depois do loop, o último elemento na array é setado como null para remover referência a esse elemento, que agora andou um index para a esquerda
        moedas[contador - 1] = null;

        //O contador é decrementado para representar o número atualizado de moedas na array
        contador--;
        //Printamos o ID da moeda deletada
        System.out.println("Moeda com ID " + id + " removida com sucesso.");
    }

    //Método buscarMoeda, que procura uma moeda no array moedas baseado no ID dado como parâmetro
    public void buscarMoeda(String id) {

        //Mostra suas informações em uma JOptionPane
        // O ID é convertido em int para conseguirmos acessar o array via index
        JOptionPane.showMessageDialog(null, "Nome: " + moedas[Integer.parseInt(id)].getnomeMoeda() + " Pais: " + moedas[Integer.parseInt(id)].getpaisMoeda()
                + " Valor: " + moedas[Integer.parseInt(id)].getvalorMoeda() + " Codigo: " + moedas[Integer.parseInt(id)].getcodigoMoeda()
                + " Simbolo: " + moedas[Integer.parseInt(id)].getsimboloMoeda() + " Id: " + moedas[Integer.parseInt(id)].getId());
    }

    //Método atualizarMoeda, usado para atualizar informações da moeda baseado no ID dado, e seus novos valores
    public void atualizarMoeda(int id, String nome, String pais, String valor, String codigo, String simbolo) {
        //Atualizamos os atributos usando métodos set e tendo ID como referência
        moedas[id].setnomeMoeda(nome);
        moedas[id].setpaisMoeda(pais);
        moedas[id].setvalorMoeda(Integer.parseInt(valor));
        moedas[id].setcodigoMoeda(codigo);
        moedas[id].setsimboloMoeda(simbolo);
        //Printamos a moeda com seus novos atributos no console
        System.out.println("Nome: " + moedas[id].getnomeMoeda() + " Pais: " + moedas[id].getpaisMoeda()
                + " Valor: " + moedas[id].getvalorMoeda() + " Codigo: " + moedas[id].getcodigoMoeda()
                + " Simbolo: " + moedas[id].getsimboloMoeda() + " Id: " + moedas[id].getId());
    }
}

package gerenciador_de_moedas;

import javax.swing.JOptionPane;

public class Metodos {

// Criando um array de moedas da classe Moeda e um contador para controlar a quantidade de moedas inseridas
    private Moeda[] moedas;
    private int contador;

    //Construtor da Classe Metodos
    public Metodos(int tamanho) {
        moedas = new Moeda[tamanho];
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
        novaMoeda.setId(contador);
        //  Aumentamos o contador
        contador++;
    }

//  Método para aumentar tamanho do array
    public void aumentarTamanhoArray() {
        //  Um novo int é criado com o valor do comprimento do Array * 2
        int novoTamanho = moedas.length * 2;
        //  Um Array temporário é criado com o comprimento referente ao int criado na linha de cima
        Moeda[] novoArray = new Moeda[novoTamanho];
        // Método arraycopy da classe System é utilizado, onde temos: vetor origem, pos. inicial no array origem, vetor destino, pos. inicial no array destino e n. de elementos
        // que serão copiados
        System.arraycopy(moedas, 0, novoArray, 0, moedas.length);
        // Igualamos o Array moedas com o novoArray
        moedas = novoArray;
    }

    // Método para exibir moedas no console pra debug, atualmente utilizado no botao Salvar da classe AddMoeda, talvez mantenha ou nao. Atualmente utilizando o metodo toString() da classe Moeda para representar o objeto em String.
    // Quando utilizamos o println em um objeto, automaticamente o metodo toString() e invocado para representar o objeto em String, por isso nao e preciso invoca-lo aqui.
    public void exibirMoedasArray() {
        System.out.println("Moedas existentes:");
        // Iteramos até chegarmos ao valor do contador
        for (int i = 0; i < contador; i++) {
            //Se o valor nao for nulo(tava dando erro quando e nulo)
            if (moedas[i] != null) {
                // E printamos os valores percorridos no array moedas
                System.out.println(moedas[i]);
            }
        }
    }

    public void removerMoeda(int id) {
        // Shift the elements after the removed element
        for (int i = id; i < contador - 1; i++) {
            moedas[i] = moedas[i + 1];
            if (moedas[i] != null) {
                moedas[i].setId(i);
            }
        }

        // Set the last element to null
        moedas[contador - 1] = null;

        contador--;
        System.out.println("Moeda com ID " + id + " removida com sucesso.");
    }

    public void buscarMoeda(String id) {

        JOptionPane.showMessageDialog(null, "Nome: " + moedas[Integer.parseInt(id)].getnomeMoeda() + " Pais: " + moedas[Integer.parseInt(id)].getpaisMoeda()
                + " Valor: " + moedas[Integer.parseInt(id)].getvalorMoeda() + " Codigo: " + moedas[Integer.parseInt(id)].getcodigoMoeda()
                + " Simbolo: " + moedas[Integer.parseInt(id)].getsimboloMoeda() + " Id: " + moedas[Integer.parseInt(id)].getId());
    }

    public void atualizarMoeda(int id, String nome, String pais, String valor, String codigo, String simbolo) {

        moedas[id].setnomeMoeda(nome);
        moedas[id].setpaisMoeda(pais);
        moedas[id].setvalorMoeda(Integer.parseInt(valor));
        moedas[id].setcodigoMoeda(codigo);
        moedas[id].setsimboloMoeda(simbolo);

        System.out.println("Nome: " + moedas[id].getnomeMoeda() + " Pais: " + moedas[id].getpaisMoeda()
                + " Valor: " + moedas[id].getvalorMoeda() + " Codigo: " + moedas[id].getcodigoMoeda()
                + " Simbolo: " + moedas[id].getsimboloMoeda() + " Id: " + moedas[id].getId());
    }
}

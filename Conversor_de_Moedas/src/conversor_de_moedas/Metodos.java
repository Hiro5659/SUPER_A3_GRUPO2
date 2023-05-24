package conversor_de_moedas;

import java.util.Scanner;

public class Metodos {

    // Criando um array de moedas da classe Moeda e um contador para controlar a quantidade de moedas inseridas
    private Moeda[] moedas;
    private int contador;
    Scanner scan = new Scanner(System.in);

    public Metodos(int tamanho) {
        moedas = new Moeda[tamanho];
        contador = 0;
    }

    // Método para inserir objetos
    public void inserirObjeto(Moeda objeto) {
        objeto.setId(contador);
        moedas[contador] = objeto;

        Moeda moeda[] = new Moeda[contador];
        System.out.println("Qual e o nome da moeda?");
        String nome = scan.next();

        System.out.println("Qual e o codigo da moeda?");
        String codigo = scan.next();

        System.out.println("Qual e o pais de origem da moeda?");
        String pais = scan.next();

        System.out.println("Descreva o simbolo da moeda");
        String simbolo = scan.next();

        System.out.println("Qual e o valor da moeda em relacao ao dolar? Ex: Moeda = 3 x Dolar");
        int valor = scan.nextInt();

        moeda[contador - 1] = new Moeda(codigo, simbolo, nome, pais, valor);
        contador++;

    }

    // Método para remover por ID
    public void removerPorId(int id) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            for (int i = indice; i < contador - 1; i++) {
                moedas[i] = moedas[i + 1];
            }
            moedas[contador - 1] = null;
            contador--;
        }
    }

    // Método para atualizar atributo por ID
    public void atualizarAtributoPorId(int id, String novoValor) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            moedas[indice].setcodigoMoeda(novoValor);
        }
    }

    // Método para buscar por ID
    public Moeda buscarPorId(int id) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            return moedas[indice];
        }
        return null;
    }

    // Buscar Indice Por ID
    private int buscarIndicePorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (moedas[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

}

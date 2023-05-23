package conversor_de_moedas;

public class Metodos {

    // Criando um array de objetos da Moeda e um contador para controlar a quantidade de objetos inseridos
    private Moeda[] moedas;
    private int contador;

    public Metodos(int tamanho) {
        moedas = new Moeda[tamanho];
        contador = 0;
    }

    // Método para inserir objetos
    public void inserirObjeto(Moeda objeto) {
        objeto.setId(contador);
        moedas[contador] = objeto;
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
            moedas[indice].setAtributo1(novoValor);
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

package conversor_de_moedas;

public class Classe2 {

    //Criando um array de objetos da Classe1 e um contador para controlar a quantidade de objetos inseridos
    private Classe1[] objetos;
    private int contador;

    public Classe2(int tamanho) {
        objetos = new Classe1[tamanho];
        contador = 0;
    }

    //Método para inserir objetos
    public void inserirObjeto(Classe1 objeto) {
        objeto.setId(contador);
        objetos[contador] = objeto;
        contador++;
    }

    //Método para remover por ID
    public void removerPorId(int id) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            for (int i = indice; i < contador - 1; i++) {
                objetos[i] = objetos[i + 1];
            }
            objetos[contador - 1] = null;
            contador--;
        }
    }

    //Método para atualizar atributo por ID
    public void atualizarAtributoPorId(int id, String novoValor) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            objetos[indice].setAtributo1(novoValor);
        }
    }
    
    //Método para buscar por ID
    public Classe1 buscarPorId(int id) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            return objetos[indice];
        }
        return null;
    }
    
    //Buscar Indice Por ID
    private int buscarIndicePorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (objetos[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

}

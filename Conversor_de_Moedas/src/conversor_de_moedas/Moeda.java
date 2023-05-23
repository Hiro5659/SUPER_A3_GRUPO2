package conversor_de_moedas;

public class Moeda {

    //6 atributos, um sendo obrigatoriamente int
    private int id; // ID da moeda.
    private String codigoMoeda; //Uma String que representa o código da moeda, como "USD" para US Dollar ou "EUR" para Euro.
    private String simboloMoeda; //Uma String representando o símbolo da moeda, como "$" para US Dollar ou "€" para Euro.
    private String nomeMoeda; //Uma String representando o nome completo da moeda, como "Dólar americano" ou "Euro".
    private String paisMoeda; //Uma String representando a entidade ou país que distribui a moeda.
    private int valorMoeda; //Um int representando o valor da moeda em relação ao Dólar americano.

    // Construtor padrão
    public Moeda() {
    }

    // Construtor com todos os parâmetros, exceto id
    public Moeda(String atributo1, String atributo2, String atributo3, String atributo4, int atributo5) {
        this.codigoMoeda = atributo1;
        this.simboloMoeda = atributo2;
        this.nomeMoeda = atributo3;
        this.paisMoeda = atributo4;
        this.valorMoeda = atributo5;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAtributo1() {
        return codigoMoeda;
    }

    public void setAtributo1(String atributo1) {
        this.codigoMoeda = atributo1;
    }

    public String getAtributo2() {
        return simboloMoeda;
    }

    public void setAtributo2(String atributo2) {
        this.simboloMoeda = atributo2;
    }

    public String getAtributo3() {
        return nomeMoeda;
    }

    public void setAtributo3(String atributo3) {
        this.nomeMoeda = atributo3;
    }

    public String getAtributo4() {
        return paisMoeda;
    }

    public void setAtributo4(String atributo4) {
        this.paisMoeda = atributo4;
    }

    public int getAtributo5() {
        return valorMoeda;
    }

    public void setAtributo5(int atributo5) {
        this.valorMoeda = atributo5;
    }

}

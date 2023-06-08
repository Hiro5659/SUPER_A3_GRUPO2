package gerenciador_de_moedas;

public class Moeda {

    // 6 atributos, um sendo obrigatoriamente int
    private int idMoeda; // ID da moeda
    private String codigoMoeda; // Uma String que representa o código da moeda, como "USD" para US Dollar ou "EUR" para Euro
    private String simboloMoeda; // Uma String representando o símbolo da moeda, como "$" para US Dollar ou "€" para Euro
    private String nomeMoeda; // Uma String representando o nome completo da moeda, como "Dólar Americano" ou "Euro"
    private String paisMoeda; // Uma String representando a entidade ou país que distribui a moeda
    private int valorMoeda; // Um int representando o valor da moeda em relação ao Dólar americano

    // Construtor padrão
    public Moeda() {
    }

    // Construtor com todos os parâmetros, exceto id
    public Moeda(String codigo, String simbolo, String nome, String pais, int valor) {
        this.codigoMoeda = codigo;
        this.simboloMoeda = simbolo;
        this.nomeMoeda = nome;
        this.paisMoeda = pais;
        this.valorMoeda = valor;
    }

    // Getters e setters
    //Metodo toString() usado para retornar um valor String ao inves de um endereco de memoria no metodo exibirMoedasArray() da classe Metodos.
    @Override
    public String toString() {return "Moeda de ID " + idMoeda;}
    
    public int getId() {
        return idMoeda;
    }

    public void setId(int id) {
        this.idMoeda = id;
    }

    public String getcodigoMoeda() {
        return codigoMoeda;
    }

    public void setcodigoMoeda(String codigo) {
        this.codigoMoeda = codigo;
    }

    public String getsimboloMoeda() {
        return simboloMoeda;
    }

    public void setsimboloMoeda(String simbolo) {
        this.simboloMoeda = simbolo;
    }

    public String getnomeMoeda() {
        return nomeMoeda;
    }

    public void setnomeMoeda(String nome) {
        this.nomeMoeda = nome;
    }

    public String getpaisMoeda() {
        return paisMoeda;
    }

    public void setpaisMoeda(String pais) {
        this.paisMoeda = pais;
    }

    public int getvalorMoeda() {
        return valorMoeda;
    }

    public void setvalorMoeda(int valor) {
        this.valorMoeda = valor;
    }

}

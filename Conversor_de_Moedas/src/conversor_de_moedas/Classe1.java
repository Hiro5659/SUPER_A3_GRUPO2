package conversor_de_moedas;

public class Classe1 {

    //6 atributos, um sendo obrigatoriamente int
    private int id;
    private String atributo1;
    private String atributo2;
    private String atributo3;
    private String atributo4;
    private String atributo5;

    // Construtor padrão
    public Classe1() {
    }

    // Construtor com todos os parâmetros, exceto id
    public Classe1(String atributo1, String atributo2, String atributo3, String atributo4, String atributo5) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
        this.atributo4 = atributo4;
        this.atributo5 = atributo5;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    public String getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(String atributo3) {
        this.atributo3 = atributo3;
    }

    public String getAtributo4() {
        return atributo4;
    }

    public void setAtributo4(String atributo4) {
        this.atributo4 = atributo4;
    }

    public String getAtributo5() {
        return atributo5;
    }

    public void setAtributo5(String atributo5) {
        this.atributo5 = atributo5;
    }

}

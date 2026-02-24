import java.util.ArrayList;

public class Squadra {

    private int identificativo;
    private String nome;
    private ArrayList<String> giocatori = new ArrayList<>();

    public Squadra() {
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
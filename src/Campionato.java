import java.util.ArrayList;

public class Campionato {

    private ArrayList<String> Squadre = new ArrayList<>();
    private String categoria;

    public Campionato() {
    }

    public String getSquadre() {
        return Squadre.toString();
    }

    public void setSquadre(ArrayList<String> Squadre) {
        this.Squadre = Squadre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
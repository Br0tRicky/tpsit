import java.util.ArrayList;
import java.util.List;

public class Studenti extends Persone {

    private List<Voto> voti;

    public Studenti(String nome, String cognome, String dataDiNascita) {
        super(nome, cognome, dataDiNascita);
        this.voti = new ArrayList<>();
    }

    public void aggiungiVoto(Voto voto) {
        voti.add(voto);
    }

    public List<Voto> getVoti() {
        return voti;
    }
}
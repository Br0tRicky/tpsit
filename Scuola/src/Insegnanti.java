import java.util.ArrayList;
import java.util.List;

public class Insegnanti extends Persone {

    private List<String> materie;

    public Insegnanti(String nome, String cognome, String dataDiNascita) {
        super(nome, cognome, dataDiNascita);
        this.materie = new ArrayList<>();
    }

    public void aggiungiMateria(String materia) {
        materie.add(materia);
    }

}
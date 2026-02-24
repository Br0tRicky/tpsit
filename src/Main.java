import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Campionato campionato = new Campionato();
        campionato.setCategoria("Campionato scolastico");

        ArrayList<String> listaSquadre = new ArrayList<>();
        listaSquadre.add("Classe 4D");
        listaSquadre.add("Classe 4B");
        campionato.setSquadre(listaSquadre);

        System.out.println("Categoria: " + campionato.getCategoria());
        System.out.println("Squadre: " + campionato.getSquadre());

        Squadra squadra1 = new Squadra();
        squadra1.setIdentificativo(1);
        squadra1.setNome("Classe 4D");

        System.out.println("\nSquadra:");
        System.out.println("ID: " + squadra1.getIdentificativo());
        System.out.println("Nome: " + squadra1.getNome());

        Giocatore giocatore1 = new Giocatore();
        giocatore1.setNome("Riccardo");
        giocatore1.setCognome("Paternò");
        giocatore1.setSesso("M");

        System.out.println("\nGiocatore:");
        System.out.println("Nome: " + giocatore1.getNome());
        System.out.println("Cognome: " + giocatore1.getCognome());
        System.out.println("Sesso: " + giocatore1.getSesso());

        Partita partita = new Partita();
        partita.setSquadraCasa("Classe 4D");
        partita.setSquadraOspite("Classe 4B");
        partita.setPunteggioCasa(21);
        partita.setPunteggioOspiti(15);
        partita.setSetVintiCasa(2);
        partita.setSetVintiOspiti(1);
        partita.setData("24/02/2026");

        System.out.println("\nPartita:");
        System.out.println("Data: " + partita.getData());
        System.out.println(partita.getSquadraCasa() + " vs " + partita.getSquadraOspite());
        System.out.println("Risultato: " + partita.getPunteggioCasa() + " - " + partita.getPunteggioOspiti());
        System.out.println("Set vinti: " + partita.getSetVintiCasa() + " - " + partita.getSetVintiOspiti());

    }
}
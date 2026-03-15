import java.util.ArrayList;

public class Socio {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String numeroTessera;
    private String dataIscrizione;
    private ArrayList<CopiaFisica> libriInPrestito;

    public Socio(String nome, String cognome, String codiceFiscale, String numeroTessera, String dataIscrizione, ArrayList<CopiaFisica> libriInPrestito) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.numeroTessera = numeroTessera;
        this.dataIscrizione = dataIscrizione;
        this.libriInPrestito = libriInPrestito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(String numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

    public ArrayList<CopiaFisica> getLibriInPrestito() {
        return libriInPrestito;
    }

    public void setLibriInPrestito(ArrayList<CopiaFisica> libriInPrestito) {
        this.libriInPrestito = libriInPrestito;
    }

}
public abstract class Persone {

    private String nome;
    private String cognome;
    private String dataDiNascita; // formato: "gg/mm/aaaa"

    public Persone(String nome, String cognome, String dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }
}
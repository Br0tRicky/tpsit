import java.util.ArrayList;

public class Biblioteca {
    private String nomeBiblioteca;
    private String citta;
    private ArrayList<Autore> AutoriLibri;
    private ArrayList<Libro> BibliotecaLibri;
    private ArrayList<CopiaFisica> BibliotecaCopie;
    private ArrayList<Socio> SociIscritti;

    public Biblioteca(String nomeBiblioteca, String citta, ArrayList<Autore> autoriLibri, ArrayList<Libro> bibliotecaLibri, ArrayList<CopiaFisica> bibliotecaCopie, ArrayList<Socio> sociIscritti) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.citta = citta;
        this.AutoriLibri = autoriLibri;
        this.BibliotecaLibri = bibliotecaLibri;
        this.BibliotecaCopie = bibliotecaCopie;
        this.SociIscritti = sociIscritti;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public ArrayList<Autore> getAutoriLibri() {
        return AutoriLibri;
    }

    public void setAutoriLibri(ArrayList<Autore> autoriLibri) {
        AutoriLibri = autoriLibri;
    }

    public ArrayList<Libro> getBibliotecaLibri() {
        return BibliotecaLibri;
    }

    public void setBibliotecaLibri(ArrayList<Libro> bibliotecaLibri) {
        BibliotecaLibri = bibliotecaLibri;
    }

    public ArrayList<CopiaFisica> getBibliotecaCopie() {
        return BibliotecaCopie;
    }

    public void setBibliotecaCopie(ArrayList<CopiaFisica> bibliotecaCopie) {
        BibliotecaCopie = bibliotecaCopie;
    }

    public ArrayList<Socio> getSociIscritti() {
        return SociIscritti;
    }

    public void setSociIscritti(ArrayList<Socio> sociIscritti) {
        SociIscritti = sociIscritti;
    }

    public int numLibriScritti(Autore autore){
        for(Autore scrittore : AutoriLibri){
            if(scrittore.getNome().equals(autore.getNome()) && scrittore.getCognome().equals(autore.getCognome())){
                return scrittore.getLibri().size();
            }
        }
        return 0;
    }

    public ArrayList<Libro> listaLibriScritti(Autore autore){
        for(Autore scrittore : AutoriLibri){
            if(scrittore.getNome().equals(autore.getNome()) && scrittore.getCognome().equals(autore.getCognome())){
                return scrittore.getLibri();
            }
        }
        return null;
    }

}

import java.util.ArrayList;

public class Libro {
    private String titolo;
    private String autore;
    private String isbn;
    private String editore;
    private ArrayList<Autore> Autori;
    private static int numPrestiti = 0;

    public Libro(String titolo, String autore,  String isbn, String editore, ArrayList<Autore> Autori) {
        this.titolo = titolo;
        this.autore = autore;
        this.isbn = isbn;
        this.editore = editore;
        this.Autori = Autori;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public ArrayList<Autore> getAutori() {
        return Autori;
    }

    public void setAutori(ArrayList<Autore> Autori) {
        this.Autori = Autori;
    }

}

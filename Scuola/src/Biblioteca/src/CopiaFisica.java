public class CopiaFisica {
    private String codiceInventario;
    private String statoConservazione;
    private Libro copiaLibro;

    public CopiaFisica(String codiceInventario, String statoConservazione, Libro copiaLibro) {
        this.codiceInventario = codiceInventario;
        this.statoConservazione = statoConservazione;
        this.copiaLibro = copiaLibro;
    }

    public String getCodiceInventario() {
        return codiceInventario;
    }

    public void setCodiceInventario(String codiceInventario) {
        this.codiceInventario = codiceInventario;
    }

    public String getStatoConservazione() {
        return statoConservazione;
    }

    public void setStatoConservazione(String statoConservazione) {
        this.statoConservazione = statoConservazione;
    }

    public Libro getCopiaLibro() {
        return copiaLibro;
    }

    public void setCopiaLibro(Libro copiaLibro) {
        this.copiaLibro = copiaLibro;
    }
}

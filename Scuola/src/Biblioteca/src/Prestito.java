public class Prestito {
    private String inizioData;
    private String scadenzaData;
    private String restituzioneData;

    public Prestito(String inizioData, String scadenzaData, String restituzioneData) {
        this.inizioData = inizioData;
        this.scadenzaData = scadenzaData;
        this.restituzioneData = restituzioneData;
    }

    public String getInizioData() {
        return inizioData;
    }

    public void setInizioData(String inizioData) {
        this.inizioData = inizioData;
    }

    public String getScadenzaData() {
        return scadenzaData;
    }

    public void setScadenzaData(String scadenzaData) {
        this.scadenzaData = scadenzaData;
    }

    public String getRestituzioneData() {
        return restituzioneData;
    }

    public void setRestituzioneData(String restituzioneData) {
        this.restituzioneData = restituzioneData;
    }
}

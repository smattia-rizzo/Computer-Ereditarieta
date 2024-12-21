public class PC_Portatile extends PC{
    //Attributi
    protected String wireless;
    protected double polliciMonitor;
    protected double profondita;
    protected double larghezza;
    protected double altezza;
    protected double peso;
    
    //Costruttore
    public PC_Portatile(String processore, int ram, String hardDisk, String marca, String modello, String so,
            String wireless, double polliciMonitor, double profondita, double larghezza, double altezza, double peso) {
        super(processore, ram, hardDisk, marca, modello, so);
        this.wireless = wireless;
        this.polliciMonitor = polliciMonitor;
        this.profondita = profondita;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.peso = peso;
    }
    
    //Metodi
    public final boolean equals(PC_Portatile pc){
        if(!super.equals(pc)) return false;
        if (!wireless.equals(pc.wireless)) return false;
        if (polliciMonitor!=pc.polliciMonitor) return false;
        if (profondita!=pc.profondita) return false;
        if (larghezza!=pc.larghezza) return false;
        if (altezza!=pc.altezza) return false;
        if (peso!=pc.peso) return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", wireless:" + wireless + ", polliciMonitor: " + polliciMonitor + ", profondita: "
                + profondita + ", larghezza: " + larghezza + ", altezza: " + altezza + ", peso: " + peso;
    }
    

}

class Notebook extends PC_Portatile{
    //Attributi
    protected boolean haveWebcam;
    protected int risoluzioneWebcamX;
    protected int risoluzioneWebcamY;

    //Costruttore
    public Notebook(String processore, int ram, String hardDisk, String marca, String modello, String so,
            String wireless, double polliciMonitor, double profondita, double larghezza, double altezza, double peso,
            boolean haveWebcam, int risoluzioneWebcamX, int risoluzioneWebcamY) {
        super(processore, ram, hardDisk, marca, modello, so, wireless, polliciMonitor, profondita, larghezza, altezza,
                peso);
        this.haveWebcam = haveWebcam;
        this.risoluzioneWebcamX = risoluzioneWebcamX;
        this.risoluzioneWebcamY = risoluzioneWebcamY;
    }

    //Metodi
    public final boolean equals(Notebook pc){
        if(!super.equals(pc)) return false;
        if (haveWebcam!=pc.haveWebcam) return false;
        if (risoluzioneWebcamX!=pc.risoluzioneWebcamX) return false;
        if (risoluzioneWebcamY!=pc.risoluzioneWebcamY) return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", haveWebcam: " + haveWebcam + ", risoluzioneWebcamX: " + risoluzioneWebcamX
                + ", risoluzioneWebcamY: " + risoluzioneWebcamY;
    }
    
}

class Palmare extends PC_Portatile {
    //Attributi
    protected boolean haveBluetooth;
    protected String tipoSD;
    
    //Costruttore
    public Palmare(String processore, int ram, String hardDisk, String marca, String modello, String so,
            String wireless, double polliciMonitor, double profondita, double larghezza, double altezza, double peso,
            boolean haveBluetooth, String tipoSD) {
        super(processore, ram, hardDisk, marca, modello, so, wireless, polliciMonitor, profondita, larghezza, altezza,
                peso);
        this.haveBluetooth = haveBluetooth;
        this.tipoSD = tipoSD;
    }

    //Metodi
    @Override
    public String toString() {
        return super.toString() + ", haveBluetooth: " + haveBluetooth + ", tipoSD: " + tipoSD;
    }
    
    public final boolean equals(Palmare pc){
        if(!super.equals(pc)) return false;
        if (haveBluetooth!=pc.haveBluetooth) return false;
        if (!tipoSD.equals(pc.tipoSD)) return false;
        return true;
    }
    
}
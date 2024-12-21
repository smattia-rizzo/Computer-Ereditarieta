public class PC_Fisso extends PC {
    //attributi
    protected String contenitore;

    //Costruttore
    public PC_Fisso(String processore, int ram, String hardDisk, String marca, String modello, String so, String contenitore) {
        super(processore, ram, hardDisk, marca, modello, so);
        this.contenitore = contenitore;
    }
    
    //Metodi
    @Override
    public String toString() {
        return super.toString() + ", case: " + contenitore;
    }

    public final boolean equals(PC_Fisso pc){
        if(!super.equals(pc)) return false;
        if (!contenitore.equals(pc.contenitore)) return false;
        return true;
    }
    
}

class PC_Desktop extends PC_Fisso {
    //Attributi
    protected String schedaVideo;
    protected String schedaAudio;

    //Costruttore
    public PC_Desktop(String processore, int ram, String hardDisk, String marca, String modello, String so,
            String contenitore, String schedaVideo, String schedaAudio) {
        super(processore, ram, hardDisk, marca, modello, so, contenitore);
        this.schedaVideo = schedaVideo;
        this.schedaAudio = schedaAudio;
    }

    //Metodi
    @Override
    public String toString() {
        return super.toString() + ", schedaVideo: " + schedaVideo + ", schedaAudio: " + schedaAudio;
    }

    public final boolean equals(PC_Desktop pc){
        if(!super.equals(pc)) return false;
        if (!schedaVideo.equals(pc.schedaVideo)) return false;
        if (!schedaAudio.equals(pc.schedaAudio)) return false;
        return true;
    }
    
}

class Server extends PC_Fisso {
    //Attributi
    protected int numProcessori;
    protected boolean haveRaid;

    //Costruttore
    public Server(String processore, int ram, String hardDisk, String marca, String modello, String so,
            String contenitore, int numProcessori, boolean haveRaid) {
        super(processore, ram, hardDisk, marca, modello, so, contenitore);
        this.numProcessori = numProcessori;
        this.haveRaid = haveRaid;
    }

    //Metodi
    @Override
    public String toString() {
        return super.toString() + ", numProcessori: " + numProcessori + ", haveRaid: " + haveRaid;
    }

    public final boolean equals(Server pc){
        if(!super.equals(pc)) return false;
        if (numProcessori!=pc.numProcessori) return false;
        if (haveRaid!=pc.haveRaid) return false;
        return true;
    }
    
}
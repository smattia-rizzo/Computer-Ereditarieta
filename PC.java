import java.util.ArrayList;

abstract class PC {
    //Attributi
    protected String processore;
    protected int ram;
    protected String hardDisk;
    protected String marca;
    protected String modello;
    protected String so;
    
    //Costruttore
    public PC(String processore, int ram, String hardDisk, String marca, String modello, String so) {
        this.processore = processore;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.marca = marca;
        this.modello = modello;
        this.so = so;
    }

    //Metodi

    @Override
    public String toString() {
        return "Processore: " + processore + ", ram: " + ram + ", hardDisk: " + hardDisk + ", marca: " + marca
                + ", modello: " + modello + ", so: " + so;
    }
    public final boolean equals(PC pc){
        if (!this.processore.equals(pc.processore)) return false;
        if (this.ram != pc.ram) return false;
        if (!this.hardDisk.equals(pc.hardDisk)) return false;
        if (!this.marca.equals(pc.marca)) return false;
        if (!this.modello.equals(pc.modello)) return false;
        if (!this.so.equals(pc.so)) return false;
        return true;
    }
    
    public static void main(String[] args) {
        //PC pc = new PC_Desktop("Intel 12600K", 12, "Seagate 512 NVME", "Asus", "B4D6A", "Windows 11", "Tower", "Nvidia RTX 3060", "Intel");
        //System.out.println(pc.equals(pc) ? "Vero" : "Falso");
        //System.out.println(pc);
        ArrayList<PC> pcs = new ArrayList<PC>();
        pcs.add(new PC_Fisso("Intel 12600K", 16, "Samsung 512 EVO", "Asus", "B450", "Windows 11", "Asus 1B1"));
        pcs.add(new PC_Desktop("AMD 5600", 32, "512 Kingdian", "Corsair", "A24B", "Windows 11", "A24C", "Nvidia RTX 4060", "Amd"));
        pcs.add(new Server("AMD Threadripper", 128, "4TB_HDD*2", "Cisco", "Server-B23D", "Windows 11 Server", "4U Case", 16, true));
        pcs.add(new PC_Portatile("AMD 4600H", 8, "512 NVME Samsung", "Lenovo", "Ideapad Gaming 3", "Windows 11", "WIFI-6E", 13, 4, 12, 8, 10));
        pcs.add(new Notebook("Intel Core Ultra 5 265K", 32, "256 NVME Samsung", "Asus", "45BG", "Windows 11", "WIFI-7", 11, 1, 8, 1, 8, true, 1920, 1080));
        for (PC pc : pcs) {
            System.out.println(pc); //Binding dinamico: in runtime, viene associata la classe corretta per l'oggetto
        }
    }
}

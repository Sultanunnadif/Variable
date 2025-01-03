package OOP.OBJECT.ORIENTED.PROGRAM;

public class Mobil1 {
    String merk, warna, tipe;
    int kapasitasBensin;

    public Mobil1(String merk, String warna, String tipe, int kapasitasBensin){
        this.merk = merk;
        this.warna = warna;
        this.tipe = tipe;
        this.kapasitasBensin = kapasitasBensin;
    }
    public void gas(){
        System.out.println("Bremmmmmm");
    }
    public void rem(){
        System.out.println("skittt");
    }
    public void wiper(){
        System.out.println("wush wush");
    }
}

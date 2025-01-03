package OOP.OBJECT.ORIENTED.PROGRAM;

public class Mobil2 {
    public static void main(String[] args) {
        Mobil1 HondaJazz = new Mobil1("Honda","Putih","Jazz",5000);
        System.out.println(HondaJazz.warna);
        System.out.println(HondaJazz.kapasitasBensin);

        HondaJazz.gas();
        HondaJazz.rem();
    }
}

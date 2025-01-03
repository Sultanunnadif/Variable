package OOP.OBJECT.ORIENTED.PROGRAM;

class Makan {
    public void makan(){
        System.out.println("hewan makan");
    }
}
class Terbang extends Hewan {
    public void terbang(){
        System.out.println("Burung terbang");
    }
    public void berkembangbiak(){
        System.out.println("Burung Bertelur");
    }
}
class Meow extends Hewan {
    public void mengeong(){
        System.out.println("Meow");
    }
    public void berkembangbiak(){
        System.out.println("Kucing beranak");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Terbang Kakaktua = new Terbang();
        Kakaktua.terbang();
        Kakaktua.makan();
        Kakaktua.berkembangbiak();

        Kucing Persia = new Kucing();
        Persia.mengeong();
        Persia.makan();
        Persia.berkembangbiak();
    }
}

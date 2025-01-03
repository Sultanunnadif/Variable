package OOP.OBJECT.ORIENTED.PROGRAM;

class Hewan {
    public void makan(){
        System.out.println("hewan makan");
        }
    }
    class Burung extends Hewan {
    public void terbang(){
        System.out.println("Burung terbang");
        }
    }
    class Kucing extends Hewan {
    public void mengeong(){
        System.out.println("Meow");
        }
        public void berkembangbiak(){
            System.out.println("Kucing beranak");
        }
    }

    public class Inheritance {
        public static void main(String[] args) {
            Burung Kakaktua = new Burung();
            Kakaktua.terbang();
            Kakaktua.makan();

            Kucing Persia = new Kucing();
            Persia.mengeong();
            Persia.makan();
        }

    }

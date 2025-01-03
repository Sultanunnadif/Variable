package Belajar.Variable.Operator;

import org.example.Main;

public class playgroundMethod {

//=================================================
//method sendiri dengan number tanpa static
//    public int addNumber(int a, int b){
//        int c = a + b;
//        return c;
//    }
//    public static void main(String[] args) {
//        int one = 5;
//        int two = 9;
//    playgroundMethod Number = new playgroundMethod(); //playgroundMethod adalah nama class nya,Number nama sendiri
//        int result = Number.addNumber(one,two);
//        System.out.println(result);
//    }
//====================================================
//Return penjumlahan dengan static
    //static int add(int a, int b){
    //    return a + b;
    //}
    //public static void main(String[] args) {
    //int result = add(5,9);
    //int lower = add(4,6);
    //System.out.println(result);
    //System.out.println(lower);
    //}
//====================================================
//melakukan penjumlahan dengan static dan void
    //static void add(int a , int b) {
    //System.out.println(a + b);
    //}
    //public static void main(String[] args) {
    //add(5,9);
    //add(6,2);
    //add(7,4);
    //}
//====================================================
//membuat method string sendiri dengan static
//    static void greeting(){ //Greeting merupakan nama methodnya kurung dapat diisi parameter
//        System.out.println("Hello Nadif");
//    }

//    public static void main(String[] args) {
//        greeting();
//        greeting();
//        greeting();
//    }
//==================================================
//==================================================
//        public static void main(String[] args) {
    //method contoh mencari nilai max
//        System.out.println(Math.max(5,8));
//    }
//==================================================
//Parameter static dengan void tanpa return
    //static void Greeting(String name, int age){
    //    System.out.println("hello "+name);
    //    System.out.println("Age "+age);
    //}
    //public static void main(String[] args) {
    //    Greeting("Nadif",27);
    //}
//Parameter static dengan return
    //static String Greeting(String name, int age){
        //return name + age;
    //}
    //public static void main(String[] args) {
    //String introduction = Greeting("Nadif ",27);
        //System.out.println(introduction);
    //}
//==================================================
//constructor
    //playgroundMethod(String name){
        //System.out.println("hallo "+name);
    //}

    //public static void main(String[] args) {
        //playgroundMethod play = new playgroundMethod("Sultanunnadif");
    //}
//====================================================
//constructor + Parameter lebih
    String name;
    playgroundMethod(String id){
        this.name = id;
    }
    public static void main(String[] args) {
        playgroundMethod data = new playgroundMethod("Nadif");
        playgroundMethod data2 = new playgroundMethod("Sultan");
        System.out.println("Hallo "+ data.name);
        System.out.println("Hallo "+ data2.name);

    }
}


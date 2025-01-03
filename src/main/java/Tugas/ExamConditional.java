package Tugas;
import java.util.Scanner;

public class ExamConditional {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Masukkan Bilangan 1 sampai 10: ");
        int bilangan = scanner.nextInt();

        if (bilangan == 1){
            System.out.println("Bilangan Ganjil");
        }else if (bilangan == 3){
            System.out.println("Bilangan Ganjil");
        }else if (bilangan == 5){
            System.out.println("Bilangan Ganjil");
        }else if (bilangan == 7){
            System.out.println("Bilangan Ganjil");
        }else if (bilangan == 9){
            System.out.println("Bilangan Ganjil");
        }else if (bilangan == 2){
            System.out.println("Bilangan Genap");
        }else if (bilangan == 4){
            System.out.println("Bilangan Genap");
        }else if (bilangan == 6){
            System.out.println("Bilangan Genap");
        }else if (bilangan == 8){
            System.out.println("Bilangan Genap");
        }else if (bilangan == 10){
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Angka Diluar Jangkauan");
        }
    }
}

package Belajar.Variable.Operator;
import java.util.Scanner;
public class RelationExamOperator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Masukkan Bilangan Bulat: ");
        System.out.println("Bilangan 1: ");
        int bilangan1 = scanner.nextInt();

        System.out.println("Bilangan 2: ");
        int bilangan2 = scanner.nextInt();

        System.out.println("bilangan 1 == bilangan 2: ");
        System.out.println(bilangan1 == bilangan2);
        System.out.println("bilangan 1 != bilangan 2: ");
        System.out.println(bilangan1 != bilangan2);
        System.out.println("bilangan 1 > bilangan 2: ");
        System.out.println(bilangan1 > bilangan2);
        System.out.println("bilangan 1 >= bilangan 2: ");
        System.out.println(bilangan1 >= bilangan2);
        System.out.println("bilangan 1 < bilangan 2: ");
        System.out.println(bilangan1 < bilangan2);
        System.out.println("bilangan 1 <= bilangan 2: ");
        System.out.println(bilangan1 <= bilangan2);
    }
}

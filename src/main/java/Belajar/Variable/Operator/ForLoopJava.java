package Belajar.Variable.Operator;

import javax.print.DocFlavor;
import java.util.Arrays;

public class ForLoopJava {
    public static void main(String[] args) {
        //for
//        for (int i = 0; i <= 5; i++){
//            System.out.println(i);
//        }

        //for break
//        for (int i = 0; i <= 5; i++){
//            if (i == 2) break;
//            System.out.println(i);
//        }
//        for (int i = 0; i <= 5; i++){
//        if (i == 2) continue;
//        System.out.println(i);
//        }

        //for array
//        String[] buahBuahan = {"Jeruk", "Mangga", "Semangka", "Melon"};
//        for (String buah: buahBuahan){
//            System.out.println(buah);
//        }

        //for Specific Array

        String[] buahBuahan = {"Jeruk", "Mangga", "Semangka", "Melon"};
        for (String buah: buahBuahan){
            if (buah == "Mangga") {
                System.out.println("ada buah mangga");
            }
        }
    }
}

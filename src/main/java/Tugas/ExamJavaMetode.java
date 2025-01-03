package Tugas;

import java.util.Arrays;

public class ExamJavaMetode {
    public static void string(String A, String B){
        if(A.length() != B.length()){ //untuk Lebar text
            return;
        }

        char[] Array1 = A.toCharArray(); //Convert String ke Array agar String dapat di edit atau di banding
        char[] Array2 = B.toCharArray();

        Arrays.sort(Array1); //Agar meskipun posisi huruf beda contoh ACT dengan TAC
        Arrays.sort(Array2);

        if (Arrays.equals(Array1, Array2)) { //Equals adalah sama dengan dengan context Panjang dan Huruf nya
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }
    }

    public static void main(String[] args) {
        String StringA = "CAT";
        String StringB = "tac";
        StringA = StringA.toLowerCase(); // agar string dapat menerima huruf kecil
        StringB = StringB.toLowerCase();
      string(StringA,StringB);
    }

}

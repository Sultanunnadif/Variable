package Belajar.Variable.Operator;

public class WhileLoopJava {
    public static void main(String[] args) {
        //while
//        int nilai = 0;
//        while (nilai < 10) {
//            System.out.println(nilai);
//            nilai++; // di dalam ekspresi harus ada ekspresi didalam untuk merubah menjadi false/batas
//        }

//        while break digunakan untuk berhenti di nomor tertentu
//        while (nilai < 10) {
//            System.out.println(nilai);
//            if (nilai == 4) break;
//            nilai++;
//        }

//        while continue
//        while (nilai < 10) {
//            nilai++;
//            if (nilai == 4) continue;
//            System.out.println(nilai);
//        }

        //================================================================================================
        //do while
//        int nilai = 20;
//        do {
//            System.out.println("print ketika do while");
//            nilai++;
//        } while (nilai < 10);
//        while (nilai < 10) {
//            System.out.println("print melewati do while");
//        } //penjelasan: do while akan melakukan minimal print satu kali meskipun nilai while salah
    //implementasi Automation
    boolean clickContinue = true;
    int maxClick = 3;
    while (clickContinue && maxClick>0) {
        System.out.println("Click Continue");
        maxClick--;
        }
    }
}

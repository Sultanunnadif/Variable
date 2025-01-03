package Belajar.Variable.Operator;

public class IfelseOperator {
    public static void main(String[] args) {
        int nilai = 85;
//Tenary Operator
        String Pesanlulus = "Lulus";
        String TidakLulus = "Tidak Lulus";
        String Hasil = (nilai < 70) ? TidakLulus:Pesanlulus;
        System.out.println(Hasil);
        
//Else IF statement
        if (nilai < 50){
            System.out.println("Nilai = D");
        }else if (nilai > 50 && nilai < 60){
            System.out.println("Nilai = C");
        }else if (nilai > 60 && nilai < 70){
            System.out.println("Nilai = B");
        }else{
            System.out.println("Nilai = A");
        }
    }
}
package Belajar.Variable.Operator;

public class ForLoopExam {
    public static void main(String[] args) {
        String[] Warna = {"Hitam", "Biru", "Putih", "Merah", "Kuning"};
        for (String Colour: Warna){
            if (Colour == "Putih") {
                continue;
            }
                System.out.println("Warnanya adalah "+ Colour);
        }
    }
}

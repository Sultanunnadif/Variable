package Belajar.Variable.Operator;
public class SwitchCase {
    public static void main(String[] args) {
        int hari = 7;
        String countHari;

        switch (hari){
            case 1:
                countHari = "Senin";
                break;
            case 2:
                countHari = "Selasa";
                break;
            case 3:
                countHari = "Rabu";
                break;
            case 4:
                countHari = "Kamis";
                break;
            case 5:
                countHari = "Jumat";
                break;
            case 6:
                countHari = "Sabtu";
                break;
            case 7:
                countHari = "Minggu";
                break;
            default:
                countHari = "hari hanya ada 1 sampai 7 ";
        }
        System.out.println(countHari);
    }
}

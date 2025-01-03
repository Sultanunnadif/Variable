package OOP.OBJECT.ORIENTED.PROGRAM;

class siswa{
    private String nama;

    public String getNama(){
        return this.nama;
    }
    public void setNama(String Nama){
        this.nama = nama;
    }
}

    public class Encapsulation {
        public static void main(String[] args) {
            siswa siswa1 = new siswa();
            siswa1.setNama("Nadif");

            System.out.println(siswa1.getNama());
        }
}

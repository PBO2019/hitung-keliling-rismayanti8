public class BUJURSANGKAR {
    private int keliling;
    private int sisi = 8;

    public void bjrsk(){
        keliling = 4 * sisi;
        System.out.println("Keliling BujurSangkar " + keliling);

    }
    public static void main(String [] args){
        BUJURSANGKAR hitung = new BUJURSANGKAR();
        hitung.bjrsk();
    }

}

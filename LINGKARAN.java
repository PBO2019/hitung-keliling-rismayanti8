public class LINGKARAN {
    private double r = 10;
    private double phi = 3.14;
    private double luas;

    public void Hitung(){
        luas = 2 * phi * r;
        System.out.println("Luas Lingkaran " + luas);
    }
    public static void main (String[] args){
        LINGKARAN nih = new LINGKARAN();
        nih.Hitung();
    }

}

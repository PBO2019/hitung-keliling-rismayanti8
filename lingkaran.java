public class lingkaran {
    private double phi = 3.14 ;
    private double r;
    private double keliling;

    public void setr(int r) {
        this.r = r;
    }

    public void hitung(){
        keliling = 2 * phi * r;
    }

    public double getkeliling(){
        return keliling;
    }
}


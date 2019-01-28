public class main {
        public static void main(String[] args) {
            bujursangkar bjrskr = new bujursangkar();
            lingkaran lkrn = new lingkaran();

            bjrskr.setsisi(8);
            bjrskr.hitung();
            System.out.println("keliling bujursangkar " + bjrskr.getkeliling() + " cm ");

            lkrn.setr(7);
            lkrn.hitung();
            System.out.println("keliling lingkaran " + lkrn.getkeliling() + "cm");
        }
    }


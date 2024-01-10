public class ujicoba {
    public static void main(String[] args) {

        bus busMini = new bus(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.plusBerat(45);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.plusBerat(80);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.plusBerat(60);
        busMini.cetak();
        
    }
}

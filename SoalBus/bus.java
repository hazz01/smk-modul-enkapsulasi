public class bus {
    private int penumpang, maxpenumpang;
    private double beratTotal;

    public bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
        beratTotal = 0;
    }

    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload Penumpamg");
        } 
        else {
            this.penumpang=temp;
        }
    }

    public void plusBerat(double berat) {
        beratTotal = beratTotal + berat;
    }

    public double getAverage() {
       return beratTotal / penumpang;        
    }
    

    public void getPassword(int password){
        if (password==90) {
            System.out.println("Password Benar");
        }
        else {
            System.out.println("Password Salah");
        }
    }

    public void cetak(){
        System.out.println("Penumpang sekarang: " +penumpang);
        System.out.println("Penumpang seharusnya adalah: " +maxpenumpang);
        System.out.println("Berat sekarang = " + beratTotal);
        System.out.println("Berat rata rata = " + getAverage());
    }
}

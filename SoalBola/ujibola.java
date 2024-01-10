package SoalBola;

public class ujibola {
    public static void main(String[] args) {
        // Langkah 1: Membuat variabel jari-jari
        double jariJari = 5.0;

        // Langkah 2: Menciptakan objek Bola
        bola bola = new bola();

        // Langkah 3: Memanggil method showDiameter(), showLuasPermukaan(), dan
        // showVolume()
        System.out.println("Sebelum manipulasi:");
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();

        // Langkah 4: Memanipulasi objek dengan memanggil method setJariJari()
        bola.setJariJari(jariJari);

        // Langkah 5: Menampilkan hasil setelah manipulasi
        System.out.println("\nSetelah manipulasi:");
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }
}

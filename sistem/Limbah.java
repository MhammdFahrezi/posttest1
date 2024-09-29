/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

public class Limbah {
    // Properti
    private String jenis;
    private int jumlah; // Dalam kilogram
    private String metodePembuangan;
    
    // Konstruktor
    public Limbah(String jenis, int jumlah, String metodePembuangan) {
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.metodePembuangan = metodePembuangan;
    }
    
    // Metode untuk menampilkan detail limbah
    public void tampilkanDetailLimbah() {
        System.out.println("Jenis: " + jenis + ", Jumlah: " + jumlah + " kg, Metode Pembuangan: " + metodePembuangan);
    }
    
    // Metode Getter
    public String getJenis() {
        return jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getMetodePembuangan() {
        return metodePembuangan;
    }

    // Metode Setter
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setMetodePembuangan(String metodePembuangan) {
        this.metodePembuangan = metodePembuangan;
    }
}


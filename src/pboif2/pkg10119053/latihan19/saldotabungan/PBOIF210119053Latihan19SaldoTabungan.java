/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan19.saldotabungan;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menghitung saldo tabungan
 */
public class PBOIF210119053Latihan19SaldoTabungan {

    public static void main(String[] args) {

        double lama, bunga, saldo, saldoAwal, saldoAkhir;

        saldoAwal = 2500000;
        bunga = 15;
        lama = 6;

        for (int i = 1; i <= lama; i++) {
            saldo = saldoAwal * bunga / 100;
            saldoAkhir = saldo + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " Rp.%,1.0f%n", saldoAkhir);
            saldoAwal += saldo;
        }
    }

}

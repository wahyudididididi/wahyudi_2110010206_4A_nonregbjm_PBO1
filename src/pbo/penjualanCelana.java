package pbo;

import java.util.Scanner;
public class penjualanCelana {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int jumlahBarang;
        System.out.println("masukan jumlah barang:");
        jumlahBarang=input.nextInt();
        input.nextLine();
        
        celana[] daftarBarang=new celana[jumlahBarang];
        //input data barng
        for (int i =0;i < jumlahBarang;i++){
        System.out.println("\nData barang ke-"+(i+1));
        System.out.print("kode barang:");
        String kodeBarang =input.nextLine();
        System.out.print ("Nama Barang:");
        String namaBarang = input.nextLine();
        System.out.print("harga:RP");
        int harga = input.nextInt();
        input.nextLine(); 
        System.out.print("ukuran:");
        String ukuran = input.nextLine();
        
        daftarBarang[i] = new celana(kodeBarang,namaBarang,harga,ukuran);
    }
        System.out.println("\nDaftar Barang yang di jual");
        for (int i = 0; i < jumlahBarang;i++){
            daftarBarang[i].showInfo();
            System.out.println();
        }
       //hitung total
        int totalHarga=0;
        for (int i = 0; i < jumlahBarang; i++){
             totalHarga += daftarBarang[i].getharga();
        }
        System.out.print("Total harga: RP"+totalHarga);
        // error hendling
        try {
            //input pembayaran
            System.out.println("Masukan jumlah uang yang dibayarkan: Rp ");
            int pembayaran =input.nextInt();
            //hitung kembalian
            int kembalian = pembayaran - totalHarga;
            if (kembalian >=0){
                System.out.println("kembalian: Rp " + kembalian);
            }else {
                System.out.println("uang tidak cukup!!!");
            }
        }catch (Exception e){
            System.out.println("input tidak valid. masukanangka yang benar.");
        }
    }
}
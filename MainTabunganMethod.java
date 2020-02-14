/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;
import java.util.Scanner;
/**
 *
 * @author Lab Informatika
 */
public class MainTabunganMethod {
   
    public static void main (String[] args){//class main
    Tabungan tabungan = new Tabungan();//CONSTUCTTOR:menginiliasisasi nilai awal
    tabungan.setJumlahSaldo(200000);
   
    Scanner scanInput = new Scanner(System.in);//object
    //penarikanSaldo= fungsi
    int saldoAkhir;
    int pilih;
    char kembali = 'n';
    int jumlah;
    
    do{
        System.out.println("MENU TABUNGAN");
        System.out.println("1. Penarikan");
        System.out.println("2. Penyetorsn");
        System.out.print("Pilih menu:");
        pilih = scanInput.nextInt();
        if (pilih==1){
            System.out.println("MENU PENARIKAN");
            System.out.println("Jumlah  :");
            jumlah = scanInput.nextInt();
            if (jumlah < tabungan.getJumlahSaldo() - 50000)
            {
            saldoAkhir =tabungan.penarikanSaldo(jumlah);
            System.out.println("Transaksi Berhasil");
            System.out.println("Saldo Akhir" + saldoAkhir);
            }
            else{
            saldoAkhir = tabungan.getJumlahSaldo();
                System.out.println("Saldo Anda Kurang");
                System.out.println("Transaksi Dibatalkan");
                System.out.println("Saldo Akhir : " + saldoAkhir);
            }
        }else if (pilih ==2){
          System.out.println("MENU PENARIKAN");
            System.out.println("Jumlah  :");
            jumlah = scanInput.nextInt();
            tabungan.setorSaldo(jumlah);
            
            saldoAkhir = tabungan.getJumlahSaldo();
            System.out.println("Transaksi Berhasil");
            System.out.println("Saldo Akhir : " + saldoAkhir);
        }else{
            System.out.println("Input Menu Tidak Sesuai");
        }
        System.out.println("Kembali ke menu? (y/n)");
        kembali =scanInput.next().charAt(0);
    }while(kembali == 'y' || kembali == 'Y');
    }
}
    


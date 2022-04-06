/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;
import Divisi.Android;
import Divisi.Web;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double nik, coding = 0, tulis = 0, wawancara = 0, hasil = 0;
        int select;
        String nama;
        boolean option = true;
        System.out.println("PENDAFTARAN PELAMAR");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Divisi : ");
        select = input.nextInt();
        
        
        if (select==1){
            Android android = new Android( coding, tulis, wawancara, hasil);
            OUTER:
            do{
                System.out.println("Menu");
                System.out.println("1. Edit Nilai");
                System.out.println("2. Tampilkan Nilai");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                select = input.nextInt();
            
                switch (select) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("EDIT NILAI PELAMAR");
                        System.out.print("Input Nilai Tes Coding     : ");
                        android.coding = input.nextDouble();
                        System.out.print("Input Nilai Tes Tulis    : ");
                        android.tulis = input.nextDouble();
                        System.out.print("Input Nilai Tes Wawancara : ");
                        android.wawancara = input.nextDouble();
                        break;
                    case 2:
                        android.hasil();
                        System.out.println(" ");
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Data tidak ditemukan!");
                        break;
                }
            }while(option = true);       
        }if (select==2){
            Web web = new Web(coding, tulis, wawancara, hasil);
            OUTER:
            do{
                System.out.println("Menu");
                System.out.println("1. Edit Nilai");
                System.out.println("2. Tampilkan Nilai");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                select = input.nextInt();
            
                switch (select) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("EDIT NILAI PELAMAR");
                        System.out.print("Input Nilai Tes Coding    : ");
                        web.coding = input.nextDouble();
                        System.out.print("Input Nilai Tes Tulis    : ");
                        web.tulis = input.nextDouble();
                        System.out.print("Input Nilai Tes Wawancara : ");
                        web.wawancara = input.nextDouble();
                        break;
                    case 2:
                        web.hasil();
                        System.out.println(" ");
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Data tidak ditemukan!");
                        break;
                }
            }while(option = true);
        }
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Divisi;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Web implements nilaiWeb{
    //atribut
    Scanner input = new Scanner (System.in);
    String nama;
    public double nik,  coding, tulis, wawancara, hasil;
    
    //constructor

    public Web(String nama, double nik) {
        this.nik = nik;
        this.nama = nama;

    }

    public Web(double tulis, double coding, double wawancara, double hasil) { 
        this.coding = coding;
        this.tulis = tulis;
        this.wawancara = wawancara;
        this.hasil = hasil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getCoding() {
        return coding;
    }

    public void setCoding(double coding) {
        this.coding = coding;
    }
    
    public double getTulis() {
        return tulis;
    }

    public void setTulis(double tulis) {
        this.tulis = tulis;
    }

    public double getWawancara() {
        return wawancara;
    }

    public void setWawancara(double wawancara) {
        this.wawancara = wawancara;
    }
    
    public void pendaftaran(){
        System.out.println(" ");
        System.out.println("PENDAFTARAN PELAMAR");
        System.out.println(" ");
        System.out.print("Input NIK  : ");
        nik = input.nextInt();
        System.out.print("Input Nama : ");
        nama = input.next();
        System.out.print("Input Nilai Tes Coding    : ");
        coding = input.nextDouble();
        System.out.print("Input Nilai Tes Tulis     : ");
        tulis = input.nextDouble();
        System.out.print("Input Nilai Tes Wawancara : ");
        wawancara = input.nextDouble();
    }
    
    void keterangan(){
        System.out.println("Nilai Total : " + nilaitotal());     
        System.out.println("Nilai Total : " + nilaitotal());     
        if(hasil < 85){
            System.out.println("Maaf" + nama + "dinyatakan TIDAK LULUS di divisi Android");
        }else if(hasil >= 85){
            System.out.println("Selamat!!!" + nama + " dinyatakan LULUS di divisi Android");
        }
    }
    
    private double nilaitotal() {
        return hasil = ( coding() + tulis() + wawancara());
    }

    

    @Override
    public double coding() {
        return coding = coding*35/100;
    }
    
    @Override
    public double tulis() {
        return tulis = tulis*40/100;
    }

    @Override
    public double wawancara() {
        return wawancara = wawancara*25/100;
    } 

    @Override
    public void hasil() {
        keterangan();
    }
}
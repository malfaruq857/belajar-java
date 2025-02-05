package com.belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan7 {  
    public static void main(String[] args)throws IOException {
    String nama;
    int umur;

    //stream reader
    InputStreamReader isr = new InputStreamReader(System.in);
    //Buffered reader
    BufferedReader br = new BufferedReader(isr);
    System.out.print("\nMasukan Nama Anda: ");
    nama=br.readLine();
    System.out.print("\nMasukan Umur Anda: ");
    umur =Integer.parseInt(br.readLine());
    System.out.println("Nama Anda Adalah " + nama);
    System.out.println("Umur Anda " + umur);
    }  
}

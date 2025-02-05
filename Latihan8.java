package com.belajar;
import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int id;

        System.out.println("pilih barang");
        System.out.println("1.tepung");
        System.out.println("2.telur");
        System.out.println("3.roti");
        System.out.println("4.susu");
        System.out.println("5.tempe");
        id = Input.nextInt();

        if(id==1){
            System.out.println("tepung 4000");
        }else if (id==2){
            System.out.println("telur 2000");
        }else if(id==3){
            System.out.println("roti 3000");
        }else if (id==4) {
          System.out.println("susu 5000");  
        }else if (id==5){
            System.out.println("tahu 7000");
        }
    }
}

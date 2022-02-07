/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

import java.util.Scanner;

/**
 *
 * @author ASUS A455L
 */
public class siswa {
    
 String nama;
 String kelas;
 int nilai; 
 
 
 void data_diri(){
     Scanner input = new Scanner(System.in);
     
     System.out.println(" ");
     
     System.out.print("Masukan Nama : ");
     nama = input.nextLine();
     System.out.print("Masukan Kelas : ");
     kelas = input.nextLine();
     System.out.print("Masukan Nilai Mata Pelajaran : ");
     nilai = input.nextInt();
    
     
     
     }
     
}



 


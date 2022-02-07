/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

public class kelulusan {
String lulus;


    
    public static void main(String[] args) {
        siswa data = new siswa();
        data.data_diri();
        
        if(data.nilai >= 75){
            System.out.println(" ");
            System.out.println("==================");
            System.out.println(" ");
            System.out.println(data.nama+" dari kelas "+data.kelas+" dengan Nilai "+data.nilai);
            System.out.println("Selamat Anda dinyatakan Lulus");
            System.out.println("");
            System.out.println("==================");
        }
        else{ 
            System.out.println(" ");
            System.out.println("==================");
            System.out.println(" ");
            System.out.println(data.nama+" dari kelas "+data.kelas+" dengan Nilai "+data.nilai);
            System.out.println("Anda tidak lulus , maka Anda Harus Belajar Lebih Giat Lagi");}
            System.out.println(" ");
            System.out.println("==================");
        
    }
    
}

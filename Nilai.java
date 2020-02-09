/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int n,i;
        float rata,min=0,max=1000,jumlah=0;;
       
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama    : ");
        nama = input.nextLine();
        
        System.out.print("Berapa banyak nilai yang akan diinputkan ? ");
        n = input.nextInt();
        System.out.println("");
        
        int nilai[] = new int [n];
        
        for (i=0;i<n;i++){
            System.out.print("Nilai ke - "+ (i+1) + " : ");
            nilai[i] = input.nextInt();
            
            // untuk menentukan nilai max 
            if (nilai[i]>min){
                min=nilai[i];
                
            } 
            // untuk menentukan nilai min
            if (nilai[i]<max) {
                max=nilai[i];
                
            }
            //untuk menjumlahkan nilai
            jumlah=jumlah+nilai[i];
            
        }
       //menentukan rata-rata 
       rata=jumlah/n;
        
        System.out.println("");
        System.out.println("Nama            : "+nama);
        System.out.println("Nilia tertinggi : "+max);
        System.out.println("Nilia terendah  : "+min);
        System.out.println("Rata - rata     : "+rata);
        
        
        
        
    }
    
}

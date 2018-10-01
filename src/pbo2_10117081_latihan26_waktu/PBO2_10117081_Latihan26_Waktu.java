/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan26_waktu;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081\
 * Kelas : IF2/PBO2
 * Deskripsi Program : Menampilkan format waktu
 */
public class PBO2_10117081_Latihan26_Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE,d MMMM yyyy, " + 
                "hh:mm:ss");
       
                String kalendar = tanggal.format(calendar.getTime());
                
                System.out.println("Hari Ini Adalah Hari : " + kalendar);
                
    }
    
}

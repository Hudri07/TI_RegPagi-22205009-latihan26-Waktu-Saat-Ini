 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan26WaktuSaatIni;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * waktu saat ini sesuai dengan lokasi kita berada saat ini
 * 
 */
public class TIRegPagi22205009latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        Locale locale = new Locale("id","ID");
        
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss",locale);
        
        String today = formatter.format(date);
        System.out.println("Hari ini adalah hari : " +today );
    }
    
}
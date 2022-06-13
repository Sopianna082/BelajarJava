import java.util.Scanner;

public class JavaOutputFormatting {
    
    public static void main(String[]args){

        /* contoh string literal */
        String nama = "Nama : Situs pemrograman";
        System.out.println(nama.length());
        
        /* contoh menggunakan keyword new */
        String txt = "Belajar \"Java\" di gotutorid.com";
        System.out.println(txt);

        System.out.println("\n" + nama.concat(txt));

    }
    
}

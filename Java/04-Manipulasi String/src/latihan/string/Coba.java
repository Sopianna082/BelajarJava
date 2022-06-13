package latihan.string;

public class Coba {
    public static void main(String[] args) {
    String txt = "Hello World";
    //length
    System.out.println("The length of the txt string is: " + txt.length());
    //mengubah menjadi huruf kapital
    System.out.println(txt.toUpperCase());
    //mengubah menjadi huurf keci;
    System.out.println(txt.toLowerCase());
    //indexOf untuk mengetahui indeks dari sebuah string
    System.out.println(txt.indexOf("World"));

    //penggunaan concatened
    String firstName = "Sopianna";
    String lastName = "Siagian";
    System.out.println(firstName + " "+ lastName);
    //atau
    System.out.println(firstName.concat(lastName));

    /*
    * -- \' (Single quote) => result '
    * -- \" (double quotw) +> result "
    * */
    }
}

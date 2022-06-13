// Diberikan string : ada sebuah mobil di depan rumah ana
// Temukan string jika dibalikan tetap membentuk kata yang sama, 
// dari string di atas dapat kita temukan 2 kata yaitu ada dan ana

public class Manipulasi {

    public static void main(String[] args) {
        String s = "ada sebuah mobil di depan rumah ana";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String text = sb.toString();
        System.out.println("Awal : " + s);
        System.out.println("Akhir1 : " + text);
        System.out.print(s.compareTo(text));
    }
    
}









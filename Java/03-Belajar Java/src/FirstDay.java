// Diberikan string : ada sebuah mobil di depan rumah ana

// Temukan string jika dibalikan tetap membentuk kata yang sama, dari string di
// atas dapat kita temukan 2 kata yaitu ada dan ana

public class FirstDay {

    static int findString(String string) {
        String[] arr = string.split(" ");
        int count = 0;
        for (String str : arr) {
            StringBuilder reverse = new StringBuilder();
            reverse.append(str);
            // Complete this method
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findString("ada sebuah mobil di depan rumah ana"));
    }
    
}

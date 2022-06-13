public class Main {

    public static void main(String[] args){
        // Misahin string
        String text = "Program String Split";
        
        String[] kata = text.split("\\s+");
        
        for(String result : kata){
            System.out.println("Text = "+result);
        }

        System.out.println("=======");

        // Misahin dari titik
        String text1 = "Sekarang.adalah.hari sabtu";

        String[] kata1 = text1.split("\\.");

        for(String result : kata1){
            System.out.println("Text = "+result);
        }

    }
    
}

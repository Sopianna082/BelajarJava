public class Ketupat {

    public static void main(String[] args) {
        
        for(int i=1; i<=4; i++){
            for(int c=4; c>=i; c--){
                System.out.print(" ");
            }
            for(int d=1; d<=i; d++){
                System.out.print("*");
            }
            for(int e=1; e<=i-1; e++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int j=1; j<=5; j++){
            for(int c=1; c<=j-1; c++){
                System.out.print(" ");
            }
            for(int d=5; d>=j; d--){
                System.out.print("*");
            }
            for(int e=4; e>=j; e--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
    
}

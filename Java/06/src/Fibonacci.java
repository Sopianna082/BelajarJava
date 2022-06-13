
//
public class Fibonacci {

    public static int hitungFibonacci(int x){
        if (x == 1 || x == 2){
            return 1;
        } else {
            return hitungFibonacci(x - 1) + hitungFibonacci(x - 2);
        }
    }
      
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf(hitungFibonacci(i) + " " );
                
            }
        }
}
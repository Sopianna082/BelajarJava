public class App {
    
    public static long Fibonacci(long angka){
        
        if((angka == 0) || (angka == 1))
            return angka;
        else
            return Fibonacci(angka -1) + Fibonacci(angka -2);
    }
    
    public static void main(String[] args) {
        for(int i=0; i<=10; i++)
            System.out.printf("%d, %d\n", i, Fibonacci(i));
    }

}

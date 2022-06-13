//solve this problem then i give you arr[1,3,4,5,6,7,2]
//then i need you to sort it just use 2 for

public class arr {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,2};
        int x = 0;
        for(int y=0; y<arr.length; y++){
            for(int z=y+1; z<arr.length; z++){
                if(arr[y]>arr[z]){
                    x = arr[y];
                    arr[y] = arr[z];
                    arr[z] = x;
                }
            }
            System.out.print(arr[y]);    
        }
    
    }
}

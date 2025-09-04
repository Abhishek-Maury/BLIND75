import java.util.Arrays;

public class Non_OverlappingInterval {

    public static int non(int[][] arr){
        Arrays.sort(arr,(a,b) -> (a[1] - b[1]));
        int[] interval=arr[0];
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if (interval[1]>arr[i][0]) {
                count++;
            }
            interval=arr[i];
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2},
                     {2,3},
                     {3,4},
                     {1,3} 
             }; 
             System.out.println(non(arr));
    }
}

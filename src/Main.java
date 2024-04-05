import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Tasks task = new Tasks();
    public static void main(String[] args) {
        int n= sc.nextInt();
        int[] arr=Create_Arr(n);
        System.out.println(task.average_in_array(arr,arr.length-1));

    }
    public static int[] Create_Arr(int n){
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Tasks task = new Tasks();
    public static void main(String[] args) {
        int a = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(task.Binomial_coefficient(a,k));

    }
    public static int[] Create_Arr(int n){
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void Output_Arr(int[] arr,int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
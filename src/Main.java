import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Tasks task = new Tasks();
    public static void main(String[] args) {
        int n= sc.nextInt();
        System.out.println(task.check_for_prime(n));

    }
    public static int[] Create_Arr(int n){
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
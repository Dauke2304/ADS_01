import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Tasks task = new Tasks();
    public static void main(String[] args) {
        String arr = sc.next();
        task.Check_String_For_Digit(arr);

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
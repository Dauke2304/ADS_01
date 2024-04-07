import org.w3c.dom.ls.LSOutput;

import static java.lang.Math.min;
import static java.util.Collections.swap;

public class Tasks {
    public int min_in_array(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        } else {
            return min(arr[n], min_in_array(arr, n - 1));
        }
    }
    public int sum_of_arr(int[] arr, int n) {
        if (n == 0) {
            return (arr[0]);
        } else {
            return (arr[n]) + sum_of_arr(arr, n - 1);
        }
    }
    public double average_in_array(int[] arr,int n){
        return sum_of_arr(arr,n)/arr.length;
    }
    public String check_for_prime(int n){
        int counter=0;
        for (int i =1;i<=n;i++){
            if(n%i==0)
                counter++;
            if(counter>2)
                return "Composite";
        }
        return "Prime";
    }
    public int find_factorial(int n){
        if(n==1)
            return 1;
        else
            return n*find_factorial(n-1);
    }
    public int find_fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else
            return find_fibonacci(n-1)+find_fibonacci(n-2);
    }
    public int find_power(int a,int n){
        if(n==0)
            return 1;
        if(n==1)
            return a;
        else
            return a*find_power(a,n-1);
    }
    public void reverse_array_main(int[] arr,int left,int right){
        if(left>=right)
            return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        reverse_array_main(arr,left+1,right-1);
    }
    public void Reverse_Arr(int[] arr){
        int left=0;
        int right=arr.length-1;
        reverse_array_main(arr,left,right);
    }
    public boolean Check_for_digit_main(String arr,int n){
        if(n==0)
            return Character.isDigit(arr.charAt(0));
        else
            return Character.isDigit(arr.charAt(n))&&Check_for_digit_main(arr,n-1);
    }
    public void Check_String_For_Digit(String arr){
        int n = arr.length()-1;
        boolean check = Check_for_digit_main(arr,n);
        if(check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public int Binomial_coefficient(int n,int k){
        if(n==0||n==1)
            return 1;
        if(k==0)
            return 1;
        if(n==k)
            return 1;
        else
            return Binomial_coefficient(n-1,k-1)+Binomial_coefficient(n-1,k);
    }
    public int GDC(int a,int b){
        if(b==0)
            return a;
        else
            return GDC(b,a%b);
    }

}

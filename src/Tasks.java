import org.w3c.dom.ls.LSOutput;

import static java.lang.Math.min;
import static java.util.Collections.swap;

public class Tasks {

    /*
    1) function returns the minimum value in array, made by recursion.
     */
    public int min_in_array(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        } else {
            return min(arr[n], min_in_array(arr, n - 1));
        }
    }


    /*
    function returns the sum of values in array, made by recursion.
     */
    public int sum_of_arr(int[] arr, int n) {
        if (n == 0) {
            return (arr[0]);
        } else {
            return (arr[n]) + sum_of_arr(arr, n - 1);
        }
    }
    /*
    2) returns the average value of array, made without recursion,
    used the function sum_of_arr(int[] arr, int n) task sum_of_arr(int[] arr, int n)
     */
    public double average_in_array(int[] arr,int n){
        return sum_of_arr(arr,n)/arr.length;
    }

    /*
    3) function get one integer and check it for prime/composite, output is String value. Made by recursion.
     */
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

    /*
    4) function gets for input a integer number and outputs its factorial, made by recursion.
     */
    public int find_factorial(int n){
        if(n==1)
            return 1;
        else
            return n*find_factorial(n-1);
    }

    /*
    5) function finds fibonacci of n th term, n is input. Works by formula a1=0,a2=1.
     */
    public int find_fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else
            return find_fibonacci(n-1)+find_fibonacci(n-2);
    }

    /*
    6) function gets two value a and b, output is a on b th degree. Made by recursion.
     */
    public int find_power(int a,int n){
        if(n==0)
            return 1;
        if(n==1)
            return a;
        else
            return a*find_power(a,n-1);
    }

    /*
    7) there 2 function:
    reverse_array_main()-main body that make reverse array, gets for parameter the array, and 2 indexes of positions of
    values that should be changed. Made by recursion

    Reverse_Arr()-the function that only for input, it gets only array and identifies the 2 values a=0
    index and b is the last value's index. After that calls reverse_array_main() and inputs array, a,b.
     */
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

    /*
    8)
    Also function divided into 2 parts:
    Check_for_digit_main()-main function that checks every character in array, and outputs boolean value
    depending on check. Uses recursion not loops.
    Check_String_For_Digit() - its just function for clear output, get values and calls Check_for_digit_main()
    depending on its return outputs String answer "yes"/"no".
     */
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

    /*
    9) function for finding a binomial coefficient of an expression, by getting k,n.
    Uses special mathematics formula with recursion.
     */
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

    /*
    function just finds GDC of 2 numbers(Greatest Common Divisor), uses recursion.
     */
    public int GCD(int a,int b){
        if(b==0)
            return a;
        if (a==0)
            return b;
        else
            return GCD(b,a%b);
    }

}

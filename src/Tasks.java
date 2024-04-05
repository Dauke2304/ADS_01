import static java.lang.Math.min;

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
}

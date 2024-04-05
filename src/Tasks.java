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
}

public class FindTwoNumbers {

    public static int[] findTwoElements(int arr[], int n){

        int[] a = {0, 0};
        for(int i = 0 ; i < n - 1 ; i++)
            for(int j = i + 1 ; j < n ; j++){
                if( arr[i] == arr[j]){
                    a[1] = arr[i];
                }
            }
        return a;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;

        System.out.println("  "+ findTwoElements(arr, n).toString());
    }
}

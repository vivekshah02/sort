public class quickSort{

    public static int partition (int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;

                int temp =  arr[i];        //swapping
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void sort(int arr[], int low, int high){
        if(high<=low) return;

        if(low<high){
            int pivin = partition(arr, low, high);

            sort(arr, low, pivin-1);
            sort(arr, pivin+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,9,3,4,5,2,1};
        int n = arr.length;

        sort(arr, 0, n-1);      //0 is low index, n-1 is high index

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
    }
}


//time complexity: best, average: O(nlogn)   , worst : O(n^2)
//last element is taken as pivot, placed at correct place and both sides of pivot is called partition
//which is then sorted
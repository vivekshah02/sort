public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;

            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//time complexity: O(n^2) for worst and average case
//O(n) for best case as it doesn't enter inner loop even once as current < arr[j] is always false
//for first pass, the smallest element is selected and placed at first
//then this becomes sorted part, from unsorted part, same is continued

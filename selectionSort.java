public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,7,6,9,1,4};

        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0 ; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//time complexity: O(n^2) for all cases
//for first pass, the smallest element is placed at first
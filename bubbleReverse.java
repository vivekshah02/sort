public class bubbleReverse {
    public static void main(String[] args) {
        int[] arr ={8,1,4,3,2,7,9};
        for(int i=0; i<2; i++){          //<2 so that it runs for 2 times and only the two smallest numbers are sorted
            for(int j=0; j<arr.length-i-1; j++){       //ie 8 4 3 7 9 2 1    ,time complexity O(n)
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] =temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

public class BucketSort {

    public static void bucketSort(float[] arr, int n) {
        if (n <= 0) return;

        float[][] buckets = new float[n][n];
        int[] bucketSizes = new int[n];


        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);
            buckets[bucketIndex][bucketSizes[bucketIndex]++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (bucketSizes[i] > 0) {
                insertionSort(buckets[i], bucketSizes[i]);
            }
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bucketSizes[i]; j++) {
                arr[index++] = buckets[i][j];
            }
        }
    }


    private static void insertionSort(float[] bucket, int size) {
        for (int i = 1; i < size; i++) {
            float key = bucket[i];
            int j = i - 1;
            while (j >= 0 && bucket[j] > key) {
                bucket[j + 1] = bucket[j];
                j--;
            }
            bucket[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
        int n = arr.length;

        bucketSort(arr, n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
}

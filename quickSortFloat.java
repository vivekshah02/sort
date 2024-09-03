public class quickSortFloat {

    public static int partition(float arr[], int low, int high) {
        float pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swapping
                float temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        float temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void sort(float arr[], int low, int high) {
        if (high <= low) return;

        if (low < high) {
            int pivin = partition(arr, low, high);

            sort(arr, low, pivin - 1);
            sort(arr, pivin + 1, high);
        }
    }

    public static void main(String[] args) {
        float[] arr = {8.2f, 9.5f, 3.3f, 4.7f, 5.1f, 2.6f, 1.0f};
        int n = arr.length;

        sort(arr, 0, n - 1);  // 0 is low index, n-1 is high index

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class MergeSortedArrays {
    public static void merge(int[] A, int m, int[] B, int n) {
        int indexA = m - 1;
        int indexB = n - 1;
        int mergedIndex = m + n - 1;

        while (indexA >= 0 && indexB >= 0) {
            if (A[indexA] > B[indexB]) {
                A[mergedIndex--] = A[indexA--];
            } else {
                A[mergedIndex--] = B[indexB--];
            }
        }
        while (indexB >= 0) {
            A[mergedIndex--] = B[indexB--];
        }
    }
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 0, 0, 0};
        int[] B = {2, 4, 6};
        int m = 3;
        int n = 3;
        merge(A, m, B, n);

        for (int num : A) {
            System.out.print(num + ", ");
        }
    }
}
//Time:O(n)
//Space: O(1)
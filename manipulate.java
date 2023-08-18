public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 4, 9, 2};
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

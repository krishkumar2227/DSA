public class Q29_Second_Largest_Element_Array {
    public static int secondLargest(int[] arr) {

        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 34, 5, 67, 8, 9};

        System.out.println("Second Largest = " + secondLargest(arr));
    }
}


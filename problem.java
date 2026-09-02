// public class problem{
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }

//         System.out.println("The sum of the array elements is: " + sum);
//     }
// }

public class problem{
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                evenCount++;
            }
        }

        System.out.println("The number of even elements in the array is: " + evenCount);
    }
}
import java.util.*;

public class PartitionNegativeAndPositiveNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
        // Write your code here
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if ((arr[0] ^ arr[i]) < 0) {
                list2.add(arr[i]);
            } else {
                list1.add(arr[i]);
            }
        }

        // Printing elements in list1
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        // Printing elements in list2
        if (list2.size() > 0) {
            for (int i = 0; i < list2.size(); i++) {
                System.out.print(list2.get(i) + " ");
            }
        } else {
            if (arr[0] > -1) {
                System.out.println("Array doesn't have negative numbers");
            } else
                System.out.println("Array doesn't have positive numbers");
        }
    }
}

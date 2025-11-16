import java.util.*;

public class ACTIVITY_10 {
    
    
    static void generateSubsets(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);

        current.remove(current.size() - 1);
        generateSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array (mininum of 3 elements): ");
        int n = sc.nextInt();
        do { 
            if (n < 3) {
                System.out.print("Please enter a elements above 3: ");
                n = sc.nextInt();
            }
        }while (n < 3);
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The subsets are:");
        generateSubsets(arr, 0, new ArrayList<>());
        sc.close();
    }

}



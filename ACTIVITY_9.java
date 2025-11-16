import java.util.Scanner;

public class ACTIVITY_9 {

    
    static String toGray(String binary, int index, String gray) {
        
        if (index == binary.length()) {
            return gray;
        }

        
        if (index == 0) {
            gray += binary.charAt(0);
        } else {
    
            char prev = binary.charAt(index - 1);
            char curr = binary.charAt(index);
            char grayBit = (prev == curr) ? '0' : '1';
            gray += grayBit;
        }

    
        return toGray(binary, index + 1, gray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary;

        do {
            System.out.print("Enter a binary number (max 10 bits): ");
            binary = sc.nextLine();

            if (!binary.matches("[01]+") || binary.length() > 10) {
                System.out.println("❌ Invalid input! Enter only up to 10 bits (0s and 1s).");
            }
        } while (!binary.matches("[01]+") || binary.length() > 10);

   
        String gray = toGray(binary, 0, "");

        System.out.println("The equivalent Gray code is: " + 1gray);
    }
}

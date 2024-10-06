package exp2;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the character to find frequency: ");
        char ch = scanner.next().charAt(0);
        
        int frequency = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                frequency++;
            }
        }
        
        System.out.println("The frequency of '" + ch + "' in the string is: " + frequency);
    }
}

import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Getting the Greater Value");

        
        System.out.print("Enter the first character: ");
        char char1 = scanner.next().charAt(0); 

        System.out.print("Enter the second character: ");
        char char2 = scanner.next().charAt(0);  

        
        if (char1 == char2) {
            
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("Both characters are the same: " + char1);
            System.out.println("-------------------------------------------------------------");
        } else {
            
            char greaterChar = (char) Math.max(char1, char2);

            
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("The character with greater value is: " + greaterChar);
            System.out.println("-------------------------------------------------------------");
        }

        
        System.out.println("Showing the ASCII Codes");
        System.out.println(char1 + " : " + (int) char1);
        System.out.println(char2 + " : " + (int) char2);

        
        scanner.close();
    }
}
import java.util.Scanner;


public class Menu {
    public static void main (String [] args) {
        String letter;
        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose what operation you want to perform:");
        System.out.println("A. Convert from any system to the decimal system");
        System.out.println("B. Convert from decimal system to another system");
        System.out.println("C. Summing up numbers from different systems");
        System.out.println("D. Subtracting numbers from different systems");
        System.out.println("E. Multiplying numbers from different systems");
        System.out.println("F. Dividing numbers from different systems");
        System.out.println(" ");
        System.out.println("W. Exit the program");
        do {
            System.out.println("Enter the letter:");
            letter = scanner.next();
            switch (letter) {
                case "A" :
                    methods.AMethod();
                    break;
                case "B" :
                    methods.BMethod();
                    break;
                case "C" :
                    methods.CMethod();
                    break;
                case "D" :
                    methods.DMethod();
                    break;
                case "E":
                    methods.EMethod();
                    break;
                case "F":
                    methods.FMethod();
                    break;

                default:
                    System.out.println("PROGRAM IS FINISHED!");
                    break;
            }
        } while (!letter.equals("W"));
    }
}

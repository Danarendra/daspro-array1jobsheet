import java.util.Scanner;
public class FIndValue19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numberOfElements = sc.nextInt();
        int[] numbers = new int[numberOfElements];
        System.out.println("Enter the values of the elements:");
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        int highest = numbers[0];
        int lowest = numbers[0];
        int sum = 0;
        
        for (int i = 0; i < numberOfElements; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
            sum += numbers[i];
        }
        double average = (double) sum / numberOfElements;
        System.out.println("\nResults:");
        System.out.println("Highest Value: " + highest);
        System.out.println("Lowest Value: " + lowest);
        System.out.printf("Average Value: %.2f", average);
        
        sc.close();
    }
}

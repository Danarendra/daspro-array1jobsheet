import java.util.Scanner;
public class ArrayAverageScore19Secondmodify {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int[] scores = new int[numberOfStudents];
        double totalPassing = 0;
        double totalFailing = 0;
        int countPassing = 0;
        int countFailing = 0;
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the final score " + i + ": ");
            scores[i] = sc.nextInt();
            
            
            if (scores[i] >= 70) {
                totalPassing += scores[i];
                countPassing++;
            } else {
                totalFailing += scores[i];
                countFailing++;
            }
        }
        
        double averagePassing = (countPassing > 0) ? totalPassing / countPassing : 0;
        double averageFailing = (countFailing > 0) ? totalFailing / countFailing : 0;
        System.out.println("The average score of students who passed is " + averagePassing);
        System.out.println("The average score of students who failed is " + averageFailing);
    }
}

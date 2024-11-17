import java.util.Scanner;
public class ArrayAverageScore19Modify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        double total = 0;
        double average;
        int passedCount = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            total += score[i];
            if (score[i] > 70) {
                passedCount++;
            }
        }
        average = total / score.length;
        System.out.println("The class average score is " + average);
        System.out.println("Number of students who passed: " + passedCount);
    }
    
}

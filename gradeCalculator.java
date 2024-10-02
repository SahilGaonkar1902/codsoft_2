import java.util.*;
public class gradeCalculator 
{
    public static void Average(int marks[])
    {
        int i = 0;
        int sum = 0;
        int avg = 0;
        for(i = 0;i < marks.length;i++)
        {
            sum = sum + marks[i];
        }
        System.out.println("-----------------\nTotal Marks:"+sum);
        avg = sum/5;
        System.out.println("Average Percentage:"+avg);
        if(avg >= 80)
        {
            System.out.println("Grade:A");
        }
        else if(avg >= 70)
        {
            System.out.println("Grade:B");
        }
        else if(avg >= 50)
        {
            System.out.println("Grade:C");
        }
        else if(avg >= 35)
        {
            System.out.println("Grade:D");
        }
        else
        {
            System.out.println("Grade:F");
        }
    }
    public static void main(String[]args)
    {
        int[] score = new int[6];
        System.out.println("Enter Marks Of 5 Subjects:");
        Scanner scanner = new Scanner(System.in);
        for(int i = 1;i <= 5;i++)
        {
            System.out.println("Subject " + i + ":");
            score[i] = scanner.nextInt();
        }
        Average(score);
    }
}
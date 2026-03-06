import java.util.Scanner;
public class GradeEvaluator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grades: ");
        int mark = input.nextInt();
        System.out.println("Your grade is: " + mark);
        String word = (mark >= 40) ? "Pass" : "Fail";
        System.out.println(word);
    }
}
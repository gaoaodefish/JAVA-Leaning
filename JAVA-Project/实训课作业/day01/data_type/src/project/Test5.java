package project;
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        char result;

        if(score >= 90)result = 'A';
        else if(score >= 80)result = 'B';
        else if(score >= 70)result = 'C';
        else if(score >= 60)result = 'D';
        else result = 'E';

        switch(result)
        {
            case 'A','B','C','D','E':
                System.out.println("result: " + result);
                break;
            default:
                break;
        }
    }
}

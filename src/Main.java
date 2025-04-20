
import java.util.Scanner;
// импортировали Scanner
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        Float num1 = scan.nextFloat();
        System.out.print("Введите число 2: ");
        Float num2 = scan.nextFloat();
        Float res1 = num1 + num2;
        Float res2 = num1 - num2;
        Float res3 = num1 * num2;
        Float res4 = num1 / num2;
        Float res5 = num1 % num2;


        System.out.println("Результат: " );
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5);


    }
}

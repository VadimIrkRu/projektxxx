
import java.util.Scanner;
// импортировали Scanner
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //создали строку для пользователя
        System.out.print("Введите ваше имя: ");
        // просто печатаем текст
        String username = scan.nextLine();
        // получаем строку от пользователя!!!!
        System.out.print("Привет: " + username);
        // печатаем текст  Привет и строку которую получили от пользователя

        // вводим то что хотим получить от пользователя - переменная называется scan
        int num1 = scan.nextInt();
        byte num2 = scan.nextByte();
        boolean b = scan.nextBoolean();
        float num3 = scan.nextFloat();
        

    }
}

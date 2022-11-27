import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(scan.nextLine());
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scan.next().charAt(0);
        scan.close();
        int result = 0;
        switch(operation){
            case '+': result = a + b;
                break;
            case '-': result = a - b;
                break;
            case '*': result = a * b;
                break;
            case '/': result = a / b;
                break;
            default: System.out.println("Ошибка: некорректный оператор");
        }
        System.out.printf("Результат: %d", result);

    }

}

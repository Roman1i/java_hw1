import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        String n = scan.nextLine();
        scan.close();
        System.out.printf("Треугольное = %d\n", triangle(Integer.parseInt(n)));
        System.out.printf("Факториал = %d\n", fact(Integer.parseInt(n)));
    }


    public static int triangle(int n){
        int a = 0;
        for (int i = 0; i <= n; i++){
            a += i;
        }
        return a;
    }


    public static int fact(int n){
        if (n == 1){
            return 1;
        }else{
            return n * fact(n - 1);
        }
    }
}
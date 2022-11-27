public class Task2 {
    public static void main(String[] args){
    for (int i = 1; i < 1001; i++){
        if (simple(i, 2)) System.out.println(i);
    }
    }


    public static boolean simple(double n, int d){
        if (n == 1) return false;
        if (n/d == 1) return true;
        else{
            if (n%d == 0) return false;
            else return simple(n, d+1);
        }
    }
}

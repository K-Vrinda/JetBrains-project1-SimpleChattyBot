import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long fact = 1, i = 1;
        while(fact <= n){
            fact *= i++;
        }
        System.out.println(i - 1);
    }
}
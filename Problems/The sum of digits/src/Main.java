import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumOfDigits = 0;
        while(n > 0){
            sumOfDigits += n % 10;
            n /= 10;
        }
        System.out.println(sumOfDigits);
    }
}
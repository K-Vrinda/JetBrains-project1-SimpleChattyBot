import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = -99999;

        int value;
        do {
            value = scanner.nextInt();
            max = Math.max(value,max);
        } while (value != 0);
        System.out.println(max);
    }
}
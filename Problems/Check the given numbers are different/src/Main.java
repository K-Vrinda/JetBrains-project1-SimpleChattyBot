import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1,b2,b3;
        b1 = scanner.nextInt();
        b2 = scanner.nextInt();
        b3 = scanner.nextInt();
        System.out.println((b1 != b2) && (b2 != b3) && (b1 != b3));
    }
}
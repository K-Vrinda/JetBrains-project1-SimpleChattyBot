import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int butterCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        if(weekend) System.out.println((15 <= butterCups) && (butterCups <= 25));
        else System.out.println((10 <= butterCups) && (butterCups <= 20));
    }
}
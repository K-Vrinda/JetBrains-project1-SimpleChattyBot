import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int costNight = scanner.nextInt();
        int res = (duration * (food + costNight)) - costNight + 2 * flight;
        System.out.println(res);
    }
}
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cityName = in.nextLine();
        boolean endsWith = cityName.endsWith("burg");
        System.out.println(endsWith);
    }
}
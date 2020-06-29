import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String noWhitespaces1 = s1.replace(" ", "");
        String noWhitespaces2 = s2.replace(" ", "");
        System.out.println(noWhitespaces1.equals(noWhitespaces2));
    }
}
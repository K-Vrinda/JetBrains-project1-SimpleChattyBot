import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        int pos = 3;

        a = scanner.nextInt();
        if(a <= 0) pos--;

        b = scanner.nextInt();
        if (b <= 0) pos--;

        c = scanner.nextInt();
        if (c <= 0) pos--;
        System.out.println(pos == 1);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        for(int i =0; i < 4; i++){
            x = scanner.nextInt();
            System.out.print(--x + " ");
        }
    }
}
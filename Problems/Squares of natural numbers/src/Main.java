import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        int i = 1;
        while(i * i <= value){
            System.out.println(i * i);
            i++;
        }

    }
}
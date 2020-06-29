import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long product = 1;
        long mod = 1000000007;
        for( int i = a; i < b; i++){
            product = (product * i) ;
        }
        System.out.println(product);
    }
}
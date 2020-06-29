import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -999;
        int x;
        for( int i = 0; i < n; i++){
            x = scanner.nextInt();
            if(x % 4 == 0 && x > max){
                max = x;
            }
        }
        System.out.println(max);
    }
}
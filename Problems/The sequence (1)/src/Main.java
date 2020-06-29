import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= n ;i++){
            for(int j = 1; j <= i && count < n; j++){
                count++;
                System.out.print(i + " ");
            }
            if(count == n) break;
        }
    }
}
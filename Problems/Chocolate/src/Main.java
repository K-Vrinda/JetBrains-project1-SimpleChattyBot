import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 1 , j = 1;
        boolean flag = false;
        if( k > n * m){
            flag = false;
        }
        else if(k%n == 0 || k %m == 0){
            flag = true;
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
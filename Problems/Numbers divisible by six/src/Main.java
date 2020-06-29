import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x, sum = 0;
        for(int i =0 ; i < n; i++){
            x = scanner.nextInt();
            if(x % 6 == 0){
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
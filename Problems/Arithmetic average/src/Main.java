import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        double sumAvgOf3 = 0;
        for(int i = a; i <= b; i++){
            if(i % 3 == 0){
                sumAvgOf3 += i;
                count++;
            }
        }
        sumAvgOf3 /= count;
        System.out.println(sumAvgOf3);
    }
}
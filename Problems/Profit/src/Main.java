import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        double m,p,k;
        m = scanner.nextInt();
        p = scanner.nextInt();
        k = scanner.nextInt();
        while(m < k){
            year++;
            m = m + m * p * 0.01;
        }
        System.out.println(year);
    }
}
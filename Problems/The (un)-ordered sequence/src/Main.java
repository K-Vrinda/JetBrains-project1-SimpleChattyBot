import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int prev = scanner.nextInt();
        int n = scanner.nextInt();
        boolean asc = false, des = false;

        if(prev <= n){
            asc = true;
        }
        else if(prev >= n){
            des = true;
        }

        while(scanner.hasNext()){
            prev = n;
            n = scanner.nextInt();
            if(n == 0){
                //asc = true;
                break;
            }
            if(prev > n && asc){
                asc = false;
                break;
            }
            else if(prev < n && des) {
                des = false;
                break;
            }
        }
        System.out.println(asc || des);
    }
}
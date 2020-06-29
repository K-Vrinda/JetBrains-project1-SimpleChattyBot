import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();
        int res = 0;
        if(class1 % 2 == 0){
            res += (class1 / 2);
        }
        else{
            res += 1 + (class1/2);
        }

        if(class2 % 2 == 0){
            res += (class2/2);
        }
        else{
            res += 1 + (class2/2);
        }

        if(class3 % 2 == 0){
            res += (class3/2);
        }
        else{
            res += 1 + (class3/2);
        }
        System.out.println(res);
    }
}
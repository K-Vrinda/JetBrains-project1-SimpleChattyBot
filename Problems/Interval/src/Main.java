import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag;

        if( n <= -15){
            flag = false;
        }
        else if (n > -15 && n <= 12){
            flag = true;
        }
        else if(n > 14 && n < 17){
            flag = true;
        }
        else if(n >= 19){
            flag = true;
        }
        else{
            flag = false;
        }

        if (flag) System.out.println("True");
        else System.out.println("False");
    }
}
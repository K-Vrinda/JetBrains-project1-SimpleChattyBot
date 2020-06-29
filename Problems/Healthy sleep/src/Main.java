import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,h;
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();
        //atleast >= a hours
        //< b hours
        if ( h >= a && h <= b){
            System.out.println("Normal");
        }
        else if(h < a){
            System.out.println("Deficiency");
        }
        else if(h > b){
            System.out.println("Excess");
        }
    }
}
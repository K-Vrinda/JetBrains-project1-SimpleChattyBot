import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        String floorShape = scanner.nextLine();
        switch(floorShape){
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = ( a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "rectangle":
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                System.out.println(side1 * side2);
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(pi * r * r);
                break;
            default:
                System.out.println("Unknown form");
                break;
        }
    }
}
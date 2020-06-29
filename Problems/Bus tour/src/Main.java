import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int bridge,success = 0;
        for(int i = 1; i <= numberOfBridges; i++){
            bridge = scanner.nextInt();
            if(bridge <= busHeight){
                System.out.println("Will crash on bridge " + i);
                break;
            }
            else{
                success++;
            }
        }
        if(success == numberOfBridges) System.out.println("Will not crash");
    }
}
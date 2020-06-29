//put imports you need here
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String firstName,stageOfEducation,cuisinePreference;
        int age,yearsOfExperience;
        firstName = in.next();
        age = in.nextInt();
        stageOfEducation = in.next();
        yearsOfExperience = in.nextInt();
        cuisinePreference = in.next();
        System.out.println("The form for " + firstName  + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}
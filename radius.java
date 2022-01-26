import java.util.*;

public class radius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();
        input.close();
        double PI = 3.14159;
        double area = PI * radius * radius;
        System.out.println("The area for the circle of radius " + radius + " is " +area);


    }
}

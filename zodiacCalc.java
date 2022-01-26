import java.util.*;

public class zodiacCalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.close();

        int index = year%12;
        String my_array[] = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        String output = my_array[index];
        System.out.println(output);
    }
}

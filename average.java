import java.util.*;

public class average {
    public static void main(String[] args){
        float sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float firstFloat = input.nextFloat();
        Scanner input2 = new Scanner(System.in);
        
        float secondFloat = input2.nextFloat();
        Scanner input3 = new Scanner(System.in);
       
        float thirdFloat = input3.nextFloat();
        sum = firstFloat+secondFloat+thirdFloat;
        input.close();
        input2.close();
        input3.close();

            
        float average = sum/3;
        System.out.println("The average of " + firstFloat + ' '+secondFloat+' '+thirdFloat + " is " + average);


        }
    }
    
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter three numbers: ");
    //     float a = sc.nextFloat();
    //     float b = sc.nextFloat();
    //     float c = sc.nextFloat();
    //     float sum = a + b + c;
    //     float average = sum/3;
    //     sc.close();
    //     System.out.println("The average of "+a+' '+b+' '+c+" is "+average);
    // }
    

    


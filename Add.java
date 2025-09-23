/* INPUT 
10 20
OUTPUT
First Number:10
Second Number:20 */
import java.util.Scanner;
public class Add{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers separated by comma: ");
        String input = s.nextLine();
        //Split by comma
        String[] parts = input.split(",");
        int num1 = Integer.parseInt(parts[0].trim());
        int num2 = Integer.parseInt(parts[1].trim());
        System.out.println("First Number: "+ num1);
        System.out.println("Second Number: "+num2);
        s.close();
            
        

    }
}
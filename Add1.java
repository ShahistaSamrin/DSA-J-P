/* INPUT 
10,20
OUTPUT
First Number:10
Second Number:20 */
import java.util.Scanner;
public class Add1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String line = s.nextLine();
        int sum=0;
        String[] parts = line.split(",");
        for(String i:parts){
            i=i.trim();
            sum+=Integer.parseInt(i);
        }
        System.out.println(sum);

    }
}
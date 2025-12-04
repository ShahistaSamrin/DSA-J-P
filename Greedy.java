/*OUTPUT:
Enter the number of chocolate types:
6
Enter the price of each chocolate:
10 5 3 2 1 2
Enter the total amount you have:
10
Maximum different types of chocolates you can buy = 4 */
import java.util.*;

public class Greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of chocolate types:");
        int size = sc.nextInt();

        int[] price = new int[size];

        System.out.println("Enter the price of each chocolate:");
        for (int i = 0; i < size; i++) {
            price[i] = sc.nextInt();
        }

        System.out.println("Enter the total amount you have:");
        int amount = sc.nextInt();
        Arrays.sort(price);

        int count = 0;

        for (int p : price) {
            if (amount >= p) {
                amount -= p;   
                count++;       
            } else {
                break;
            }
        }

        System.out.println("Maximum different types of chocolates you can buy = " + count);
    }
}
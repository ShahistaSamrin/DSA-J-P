/*OUTPUT:
500 51
200 0
100 1
50 1
10 2 */
public class Greedy2 {
    public static void main(String[] args) {
         int[] arr ={500,200,100,50,10};
         int amount = 25670;
         for(int i=0;i<arr.length;i++){
            int count=amount/arr[i];
            amount=amount%arr[i];

            System.out.println(arr[i]+" "+count);
         }
    }
    
}
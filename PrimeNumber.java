/*OUTPUT:
45 is not a prime number */
class PrimeNumber{
    public static void main(String[] args) {
        int num = 45;
        int count = 0;
        for (int i = 2; i <= 50 / 2; i++) {
            if (num % i == 0) {
                count++;
                
            }
        }
        if (count == 0 ) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
            }
        }
}
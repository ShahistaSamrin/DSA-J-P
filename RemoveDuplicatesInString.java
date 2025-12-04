//OUTPUT:misisipi
public class RemoveDuplicatesInString {
   public static void main(String[] args) {

        String str = "mississippi";
        String result = "";

        result += str.charAt(0); // first character

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    } 
}

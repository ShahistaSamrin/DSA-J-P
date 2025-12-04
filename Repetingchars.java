/*OUTPUT
m = 1
i = 4
s = 4
p = 2 */
import java.util.*;
public class Repetingchars {
    public static void main(String[] args) {
        String str = "mississippi";
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char i : str.toCharArray()){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(char i : map.keySet())
            System.out.println(i+" = "+map.get(i));
    }
    
}
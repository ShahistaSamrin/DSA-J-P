//OUTPUT:cdc
public class StringPalindrome {
    public static void main(String[] args) {

        String str = "abcdcdabcdacbbdcadbcada";
        String temp="";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length()-1;j++){
                String sub=str.substring(i,j+1);
                if(pal(sub) &&sub.length()>temp.length() ){
                    temp=sub;

                }
            }
        }

            System.out.println(temp);
        
    }
    public static boolean pal(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }

        }
        return true;
    }
}
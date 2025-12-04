 //OUTPUT: a2b3c3d5
public class CompressString {
    public static void main(String[] args) {
        String str = "aabbbcccddddd";
        String res="";
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(res.contains(String.valueOf(s)))
                continue;
            int count =0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==s){
                    count++;
                }
            }
            res=res+s+count;
        }
        System.out.println(res);
    }
}
 public class Solution{
    public boolean ValidWordAbbrevation(String word,String abbre){
        if(word==null || abbre==null){
            return false;
        }
        int a=0;
        int b=0;
        while(a<word.length() && b<abbre.length()){
            if(Character.isDigit(abbre.charAt(b))){

                if(abbre.charAt(b)=='0'){
                    return false;
                }
                int total=0;
                while(b<abbre.length() && Character.isDigit(abbre.charAt(b))){
                    total=total*10+abbre.charAt(b)-'0';
                    b++;
                }
                a+=total;
            }else{
                if(word.charAt(a)!=abbre.charAt(b)){
                    return false;
                }
                a++;
                b++;
            }
            
        }
        return a==word.length() && b==abbre.length();
    }

}
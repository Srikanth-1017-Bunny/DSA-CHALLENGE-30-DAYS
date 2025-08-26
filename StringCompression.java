class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 0)
         return 0;

        int idx = 0; 
        
        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;
      
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }
   
            if (idx < n) chars[idx++] = ch;
     
            if (count > 1) {
               
                String countStr = String.valueOf(count);
                for (char dig : countStr.toCharArray()) {
                    if (idx < n) chars[idx++] = dig;
                    else return idx; 
                }
            }
            i--; 
        }
        return idx;
    }
}
class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        char[] c=s.toCharArray();
        for(char ch:c){
            freq[ch-'a']++;
        }
        for(int i=0;i<c.length;i++){
            if(freq[c[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
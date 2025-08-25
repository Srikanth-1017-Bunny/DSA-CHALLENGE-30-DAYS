class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength=0;
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,Boolean.FALSE);
        }
        for(int num:nums){
            int currentLength=1;

      
        int nextNum=num+1;
        while(hm.containsKey(nextNum) && hm.get(nextNum)==false){

            currentLength++;
            hm.put(nextNum,Boolean.TRUE);
            nextNum++;

        }

        int prevNum=num-1;
            while(hm.containsKey(prevNum) && hm.get(prevNum)==false){

            currentLength++;
            hm.put(nextNum,Boolean.TRUE);
            prevNum--;

        }
        longestLength=Math.max(longestLength,currentLength);
        

          }
          return longestLength;


    }
}

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> hm=new HashMap<>();
        List<String> res=new ArrayList<>();
        int i=0;
        while(i+10<=s.length()){
            String sub=s.substring(i,i+10);
            hm.put(sub,hm.getOrDefault(sub,0)+1);
            if(hm.get(sub)==2){
                res.add(sub);
            }
            i++;
        }
        return res;
        
    }
}

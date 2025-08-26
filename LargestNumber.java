class Solution {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=""+nums[i];
        }
        Arrays.sort(arr,
        (a,b)->{
            String x=a+b;
            String y=b+a;
            if(x.compareTo(y)<0) return +1;
            else if(x.compareTo(y)>0) return -1;
            else return 0;
        }
        );
        StringBuilder res=new StringBuilder();
        for(String val : arr){
            res.append(val);
        }
        
      
    if(res.length()==0 || res.charAt(0)=='0') return "0";
        return res.toString();
    }
}
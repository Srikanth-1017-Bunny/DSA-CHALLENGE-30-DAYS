class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n2 : nums2) {
            map.put(n2, map.getOrDefault(n2, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int n1 : nums1) {
            if (map.containsKey(n1) && map.get(n1) > 0) {
                list.add(n1);
                map.put(n1, map.get(n1) - 1); 
            }
        }
        
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
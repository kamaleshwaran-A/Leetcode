class Solution {
    public List<Integer> countSmaller(int[] nums) {
        
        int n = nums.length;

        List<Integer> clone = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int num: nums) clone.add(num);
        
        Collections.sort(clone);
        
        for(int i=0;i<n;i++){
            int pos = binarySearch(clone,nums[i]);
            ans.add(pos);
            clone.remove(pos);
        }
        
        return ans;
        
    }
    
    public int binarySearch(List<Integer> clone, int target){
        int l=0;
        int h = clone.size();
        
        while(l<h){
            int m =  l + (h-l)/2;
            if(clone.get(m)<target){
                l = m+1;
            }else{
                h = m;
            }
        }
        
        return l;
    }
}
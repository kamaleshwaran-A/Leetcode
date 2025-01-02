class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int i;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j:arr)
        {
            map.put(j,map.getOrDefault(j,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
       for(int valuesi:map.values())
       {
        if(!(set.add(valuesi)))
        {
              return false;
        }
       }
       return true;


        
    }
}
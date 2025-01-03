class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int i:nums1)
        {
            set1.add(i);
        }
        for(int j:nums2)
        {
            set2.add(j);
        }

        ArrayList<Integer> list1=new ArrayList<>(set1);
        list1.removeAll(set2);
        
        ArrayList<Integer> list2=new ArrayList<>(set2);
        list2.removeAll(set1);

        ArrayList<List<Integer>> fin=new ArrayList<>();
        fin.add(list1);
        fin.add(list2);

        return fin;

        
    }
}
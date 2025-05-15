class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] prefixSum = new long[nums.length + 1];
        TreeSet<Long> values = new TreeSet<>();
        
        // Step 1: Compute prefix sums
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        
        // Step 2: Collect all possible values for compression
        for (long sum : prefixSum) {
            values.add(sum);
            values.add(sum - lower);
            values.add(sum - upper);
        }
        
        // Step 3: Coordinate compression (Map prefix sums to small indices)
        Map<Long, Integer> compressedIndex = new HashMap<>();
        int rank = 1;
        for (long value : values) {
            compressedIndex.put(value, rank++);
        }
        
        // Step 4: Fenwick Tree for range counting
        FenwickTree bit = new FenwickTree(compressedIndex.size());
        int count = 0;
        
        // Step 5: Process prefix sums in order
        for (long sum : prefixSum) {
            int left = compressedIndex.get(sum - upper);
            int right = compressedIndex.get(sum - lower);
            
            // Query count of valid prefix sums
            count += bit.rangeQuery(left, right);
            
            // Insert current prefix sum into BIT
            bit.update(compressedIndex.get(sum), 1);
        }
        
        return count;
    }
}

class FenwickTree {
    private int[] bit;
    
    public FenwickTree(int size) {
        bit = new int[size + 1]; // BIT uses 1-based indexing
    }
    
    public void update(int index, int delta) {
        while (index < bit.length) {
            bit[index] += delta;
            index += index & -index; // Move to next index
        }
    }
    
    public int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += bit[index];
            index -= index & -index; // Move to parent index
        }
        return sum;
    }
    
    public int rangeQuery(int left, int right) {
        return query(right) - query(left - 1); // Count elements in [left, right]
    }
}
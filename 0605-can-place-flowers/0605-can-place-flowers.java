class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        // Edge case for arrays of length 1
        if (length == 1) {
            return flowerbed[0] == 0 ? n <= 1 : n == 0;
        }

        // Check the first position if eligible for planting
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            count++;
        }

        // Check the last position if eligible for planting
        if (flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0) {
            flowerbed[length - 1] = 1;
            count++;
        }

        // Check all other positions in between
        for (int i = 1; i < length - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                count++;
            }

            // Return early if we've already placed enough flowers
            if (count >= n) {
                return true;
            }
        }

        return count >= n;
    }
}

class Solution {
    public int minBitFlips(int start, int goal) {
        int xorVal = start ^ goal;
        int count = 0;
        while (xorVal != 0) {
            xorVal &= (xorVal - 1); // Remove the rightmost set bit
            count++;
        }
        return count;
    }
}

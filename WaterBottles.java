class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int out = numBottles;
        int empty = numBottles;
        int leftover = 0;
        while(empty >= numExchange)
        {
            System.out.println(out);
            out = out + (empty/numExchange);
            empty = (empty/numExchange) + (empty%numExchange);
        }
        return out;
    }
}

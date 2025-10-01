class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int emptybottles = numBottles;
        while(emptybottles>=numExchange){
            int newbottle = emptybottles/numExchange;

            drink += newbottle;

            emptybottles = newbottle + (emptybottles%numExchange);
        }
        return drink;
    }
}
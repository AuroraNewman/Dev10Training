package learn;

import java.util.Arrays;

/*
problem 322
https://leetcode.com/problems/coin-change/description/
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0){
            return 0;
        }

        int numberCoins = 0;
        Arrays.sort(coins);

        for (int i = coins.length - 1; i >= 0; i--){
            numberCoins+=amount/coins[i];
            amount = amount % coins[i];
            if (amount == 0){
                return numberCoins;
            }
        }

        if (amount != 0){
            return -1;
        }
        return numberCoins;
    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
//        System.out.println(cc.coinChange(new int[] {}, 0));
//        System.out.println(cc.coinChange(new int[] {2}, 3));
//        System.out.println(cc.coinChange(new int[] {1,2,5}, 11));
//        System.out.println(cc.coinChange(new int[] {1}, 3));
//        System.out.println(cc.coinChange(new int[] {2, 4, 8, 16}, 31));
//        System.out.println(cc.coinChange(new int[] {2, 4, 8, 16}, 32));
        System.out.println(cc.coinChange(new int[] {186,419,83,408}, 6249));
    }
}

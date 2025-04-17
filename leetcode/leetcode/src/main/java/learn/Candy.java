package learn;
/*
problem 135
https://leetcode.com/problems/candy/
 */
public class Candy {
    public int candy(int[] ratings) {
       return 0;
    }

    public static void main(String[] args) {
        int[] ratings1 = {1,0,2};
        int[] ratings2 = {1,2,2};
        int[] ratings3 = {1};
        int[] ratings4 = {1,1,1};
        int[] ratings5 = {1032, 4567, 829, 19032, 2, 0, 15876, 4932, 1204, 7634};
        int[] ratings6 = {42, 19999, 0, 5893, 12034, 897, 20, 1345, 20000, 3, 456, 823, 9023, 1111};
        int[] ratings7 = {12, 8734, 10456, 3920, 100, 10000, 834, 582, 19999, 16578, 4, 6382, 3001, 4982,
                5789, 19000, 734, 9823, 100, 0};


        Candy candy = new Candy();
        System.out.println(candy.candy(ratings1));
        System.out.println(candy.candy(ratings2));
        System.out.println(candy.candy(ratings3));
        System.out.println(candy.candy(ratings4));
        System.out.println(candy.candy(ratings5));
        System.out.println(candy.candy(ratings6));
        System.out.println(candy.candy(ratings7));


    }
}

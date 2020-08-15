package com.leecode.day02_2020_08_04;

/**
 * @Classname IntReverse
 * @Author 刘春良
 * @Date 2020/8/4 0004
 */
public class IntReverse {
    public int reverse(int x) {
        int rev = 0 , pop = 0;

        while ( x != 0 ) {
            pop = x % 10;
            x /= 10;
            if ( rev > Integer.MAX_VALUE/10 || ( rev > Integer.MAX_VALUE/10 && pop > 7 ) ) { return 0;}
            if ( rev < Integer.MIN_VALUE/10 || ( rev < Integer.MIN_VALUE/10 && pop < -8 ) ) { return 0;}
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        IntReverse intReverse = new IntReverse();
        System.out.println( intReverse.reverse(123456) );
    }
}

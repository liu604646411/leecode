package com.leecode.day02_2020_08_04;

/**
 * @Classname isPalindrome
 * @Author 刘春良
 * @Date 2020/8/4 0004
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        int org = x , rev = 0 , pop = 0;

        while ( x != 0 ) {
            pop = x % 10;
            x /= 10;
            if ( rev > Integer.MAX_VALUE/10 || ( rev > Integer.MAX_VALUE/10 && pop > 7 ) ) {
                throw new RuntimeException();
            }
            if ( rev < Integer.MIN_VALUE/10 || ( rev < Integer.MIN_VALUE/10 && pop < -8 ) ) {
                throw new RuntimeException();
            }
            rev = rev * 10 + pop;
        }
        System.out.println( "rev : " + rev );
        System.out.println( "org : " + org );
        if ( org == rev ) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        IsPalindrome IsPalindrome = new IsPalindrome();
        System.out.println( IsPalindrome.isPalindrome( -1212 ) );
    }
}

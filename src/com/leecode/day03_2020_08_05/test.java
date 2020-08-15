package com.leecode.day03_2020_08_05;

/**
 * @Classname test
 * @Author 刘春良
 * @Date 2020/8/5 0005
 */
public class test {
    public static void main(String[] args) {
        test t = new test();
        System.out.println( t.fn( 8 ) );
    }

    public int fn( int x ) {
        if ( 1 == x ) {
            return 0;
        } else if ( 2 == x || 3 == x ) {
            return 1;
        } else {
            return fn( x-2 ) + fn( x-1 );
        }

    }
}

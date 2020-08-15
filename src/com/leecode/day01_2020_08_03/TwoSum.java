package com.leecode.day01_2020_08_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname TwoSum
 * @Author 刘春良
 * @Date 2020/8/3 0003
 */
public class TwoSum {
    public int[] sum( int[] arrays, int target ) {
        Map<Integer,Integer> map = new HashMap<>();
        for ( int i = 0; i < arrays.length; i++ ) {
            map.put( arrays[i], i );
        }
        for ( int i = 0; i < arrays.length; i++ ) {
            if ( map.containsKey( target - arrays[i] ) && map.get( target - arrays[i] ) != i ) {
                return new int[] { i , map.get( target - arrays[i] ) };
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum TwoSum = new TwoSum();
        int a[] = TwoSum.sum( new int[]{1,2,7,8,11},9 );
        for ( int i = 0; i < a.length; i++ ) {
            System.out.println( a[i] );
        }
    }
}

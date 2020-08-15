package com.leecode.day01_2020_08_03;

/**
 * @Classname AddStrings
 * @Author 刘春良
 * @Date 2020/8/3 0003
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        // 计算完以后的答案需要翻转过来
        ans.reverse();
        return ans.toString();
    }
    public String addStrings1(String num1, String num2) {
        StringBuilder s = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = i < 0 ? 0 : num1.charAt(i--) - '0';
            int y = j < 0 ? 0 : num2.charAt(j--) - '0';
            int sum = x + y + carry;
            s.append(sum % 10);//添加到字符串尾部
            carry = sum / 10;
        }
        return s.reverse().toString();//对字符串反转
    }

    public static void main(String[] args) {
        AddStrings AddStrings = new AddStrings();
        System.out.println( AddStrings.addStrings1("123","123") );
    }
}

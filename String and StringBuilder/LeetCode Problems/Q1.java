/*

                                      17. Letter Combinations of a Phone Number
Medium
Topics
premium lock icon
Companies
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = "2"
Output: ["a","b","c"]
 */


public class Q1{
    public static void main(String[] args) {
        pad("","12");
        
    }

    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // This will convert '2' to 2

        for(int i = (digit - 1)*3;i<digit*3;i++){
            char ch = (char)('a' + i);

            pad(p + ch,up.substring(1));
        }
    }
}
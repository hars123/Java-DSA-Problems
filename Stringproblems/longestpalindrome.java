// Write a program to find the longest Palindrome in a string.[ Longest palindromic Substring]

public class longestpalindrome {
    public static String LongestPlaindrome(String s){
        if(s == null  || s.length() < 1) return "";
        int start = 0, end = 0;

        for(int i = 0;i<s.length();i++){
            int len1 = expandfromcenter(s, i, i);
            int len2 = expandfromcenter(s, i, i+1);
            int len = Math.max(len1, len2);

            if(len > end - start){
                start = i - (len -2)/2;
                end = i+len/2;
            }
        }
        return s.substring(start, end+1);
    }

    private static int expandfromcenter(String s , int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; 
    }

    public static void main(String[] args) {
        String input = "babad";
        String longestPalindrome = LongestPlaindrome(input);
        System.out.println("The longest palindromic substring of \"" + input + "\" is: " + longestPalindrome);
    }       
    }

class Solution {
    public static String reverseString(String s) {
        String res = "";
        for(int i=s.length()-1; i>= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
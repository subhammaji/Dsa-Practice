1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> st = new HashSet<>();
4        for(int num: nums) {
5            if(!st.add(num)) return  true;
6        }
7        return false;
8    }
9}
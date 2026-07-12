1class Solution {
2public:
3    bool isAnagram(string s, string t) 
4    {
5        if (s.length() != t.length()) return false;
6        int n = s.length();
7        int counts[26] = {0};
8        for (int i = 0; i < n; i++) { 
9            counts[s[i] - 'a']++;
10            counts[t[i] - 'a']--;
11        }
12        for (int i = 0; i < 26; i++)
13            if (counts[i]) return false;
14        return true;
15        
16    }
17};
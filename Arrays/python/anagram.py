"""class Solution:
    def anagram(self,s,t):
        s1="".join(sorted(s))// sorted the string in alphabetical order return in list
        s2="".join(sorted(t))//
        if s1==s2:
            return True
        else:
            return False
s1=Solution()
s="racecar"
t="carrace"
print(s1.anagram(s,t)"""

#simple logic for this  "return sorted(s1)==sorted(s2)"
from collections import Counter
class Solution:
    def anagram(self,s,t):
        return Counter(s)==Counter(t)
s1=Solution()
s="racecar"
t="carrace"
print(s1.anagram(s,t))


from collections import defaultdict
from typing import List


"""class Solution:
    def groupAnagrams(self, strs):
        anagram_map = defaultdict(list)

        for word in strs:
            sorted_word = ''.join(sorted(word))
            anagram_map[sorted_word].append(word)
            print(list(anagram_map))

        return list(anagram_map.values())"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res=defaultdict(list)
        for s in strs:
            count=[0]*26
            for c in s:
                count[ord(c)-ord("a")]+=1
            res[tuple(count)].append(s)
        return list(res.values())


strs = ["act", "pots", "tops", "cat", "stop", "hat"]
s1=Solution()
print(s1.groupAnagrams(strs))

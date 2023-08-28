class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        str =s.split()
        l = len(str[-1])
        return l
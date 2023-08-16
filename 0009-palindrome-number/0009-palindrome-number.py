class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        
        original_x = x
        rev = 0
        
        while x != 0:
            rem = x % 10
            rev = rev * 10 + rem
            x = x // 10
        
        return original_x == rev

# Test the function
sol = Solution()
print(sol.isPalindrome(121))  # Output: True
print(sol.isPalindrome(-121))  # Output: False
print(sol.isPalindrome(10))  # Output: False

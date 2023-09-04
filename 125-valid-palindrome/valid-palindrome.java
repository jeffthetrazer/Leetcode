class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                s1 += Character.toLowerCase(c);
            }
        }
        
        String s2 = new StringBuilder(s1).reverse().toString();
        
        return s1.equals(s2);
    }
}

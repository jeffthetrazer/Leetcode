class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int x = 0;
        while(x<str1.length() && x<str2.length()){
            if(str1.charAt(x)==str2.charAt(x)){
                x++;
            }
            else{
                break;
            }
        }
        return str1.substring(0,x);

    }
}
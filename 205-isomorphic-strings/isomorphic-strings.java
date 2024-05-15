class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Character> mappedChar = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char org = s.charAt(i);
            char rep = t.charAt(i);

            if(!mappedChar.containsKey(org)){
                if(!mappedChar.containsValue(rep)){
                    mappedChar.put(org, rep);
                }
                else{
                    return false;
                }
            }
                else{
                    char newChar = mappedChar.get(org);
                    if(newChar != rep){
                        return false;
                    }
                }
                
            }
            return true;
        }
    }

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<Character, Character>();

        for(int i=0; i< s.length() ; i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }else{
                    return false;
                }
            }else{
                char MappedCharacter = map.get(original);
                if(MappedCharacter != replacement)
                return false;
            }
        }
        return true;
    }
}
```

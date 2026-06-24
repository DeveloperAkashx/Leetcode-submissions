class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        java.util.Arrays.sort(sArr);
        java.util.Arrays.sort(tArr);

        return java.util.Arrays.equals(sArr,tArr);
        
    }
}

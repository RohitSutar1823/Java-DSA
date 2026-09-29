class Solution {
    public static char getMaxOccuringChar(String s) {
        int[] Freq = new int[26];
        
        for(int i = 0; i<s.length(); i++){
            Freq[s.charAt(i) - 'a']++;
        }
        
        int max = -1;
        char ans = 'a';
        for(int i = 0; i<26; i++){
            if(Freq[i]>max){
                max = Freq[i];
                ans = (char)(i+'a');
            }
        }
        
        return ans;
    }
}
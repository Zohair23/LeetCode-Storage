class Solution {
    public boolean isSubsequence(String s, String t) {
        int spointer = 0;
        int tpointer = 0;

        while(spointer < s.length() && tpointer < t.length())
        {
            if (s.charAt(spointer) == t.charAt(tpointer))
            {
                spointer++;
            }
            tpointer++;
        }

        return spointer == s.length();


    }
}

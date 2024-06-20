class Solution {
    public boolean isPalindrome(String s) {
        String mystring = "";
        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
            {
                mystring = mystring + s.charAt(i);
            } else if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
            {
                mystring = mystring + s.charAt(i);
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
            {
                mystring = mystring + s.charAt(i);
            }
        }

        String pali = "";
        for(int j = mystring.length()-1; j >= 0; j--)
        {
            pali = pali + mystring.charAt(j);
        }

        mystring = mystring.toLowerCase();
        pali = pali.toLowerCase();
        if (mystring.equals(pali))
        {
            return true;
        }else
        {
            return false;
        }
    }
}

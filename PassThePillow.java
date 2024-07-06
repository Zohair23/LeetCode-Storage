class Solution {
    public int passThePillow(int n, int time) {
        boolean end = false;
        boolean up = true;
        int count = 1;
        while(!end)
        {
            if(time == 0)
            {
                break;
            }

            if(up == true)
            {
                if(n == count)
                {
                    up = false;
                    count--;
                }else
                {
                    count++;
                }
            }else
            {
                if(count == 1)
                {
                    up = true;
                    count++;
                }else
                {
                    count--;
                }
            }
            time--;
        }
        return count;
    }
}

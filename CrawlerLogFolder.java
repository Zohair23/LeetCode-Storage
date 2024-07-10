class Solution {
    public int minOperations(String[] logs) {
        int minimumsteps = 0;
        for(int i = 0; i < logs.length; i++)
        {
            if(logs[i].equals("../"))
            {
                if(minimumsteps != 0)
                {
                    minimumsteps--;
                }
            }else if(logs[i].equals("./"))
            {
                minimumsteps = minimumsteps;
            }else
            {
                minimumsteps++;
            }
        }
        return minimumsteps;
    }
}

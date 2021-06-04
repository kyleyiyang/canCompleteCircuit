class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,tank=0,start=0;
        for (int i=0;i<gas.length;i++) {
            if ((tank+=gas[i]-cost[i])<0) {
                start=i+1;
                total+=tank;
                tank=0;
            }
        }
        return (total+tank<0)?-1:start;
    }
}

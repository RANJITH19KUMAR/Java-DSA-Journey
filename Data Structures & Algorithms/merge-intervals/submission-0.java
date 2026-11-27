class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int []> result = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        for(int i=0;i<intervals.length;i++ ){
             if(result.isEmpty()){
            result.add(intervals[i]);
        }
        else{
            int[] last = result.get(result.size()-1);

            if(last[1] >= intervals[i][0]){
                last[1]= Math.max(last[1], intervals[i][1]);
            }
            else{
                result.add(intervals[i]);
            }
        }
        }
        return result.toArray(new int[result.size()][]);
    }
}

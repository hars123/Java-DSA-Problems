import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervalsinjavadsaproblembylovebabbar {
    public static int[][] Mergeintervals(int intervals[][]){
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        ArrayList<int[]> result = new ArrayList<>();
        int newinterval[] = intervals[0];
        result.add(newinterval);

        for(int interval[] : intervals){
            if(interval[0] <= newinterval[1])
            newinterval[1] = Math.max(newinterval[1],interval[1]);
            else{
                newinterval = interval;
                result.add(newinterval);
            }
        }
        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args) {
        
    } 
}
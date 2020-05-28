import java.util.ArrayList;
import java.util.Collections;
/*
Given a collection of intervals, merge all overlapping intervals.

For example:

Given [1,3],[2,6],[8,10],[15,18],

return [1,6],[8,10],[15,18].

Make sure the returned intervals are sorted.
*/
import java.util.Comparator;
class IB_Merge_Overlapping_Intervals{
    public static void main( String[] args) {
         IB_Merge_Overlapping_Intervals obj = new IB_Merge_Overlapping_Intervals();
         obj.callMerge();
    }
    public void callMerge() {
        ArrayList<Interval> arr = new ArrayList<>();
        arr.add(new Interval(1,2));
        arr.add(new Interval(3,5));
        arr.add(new Interval(6,15));
        arr.add(new Interval(8,15));
        arr.add(new Interval(7,20));
        arr.add(new Interval(10,20));
        arr.add(new Interval(47,57));
        arr.add(new Interval(30,40));

        this.merge(arr);
    }
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new IntervalSort());
        ArrayList<Interval> result = new ArrayList<>();
        result.add(intervals.get(0));
        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start<=result.get(result.size()-1).end){
                Interval temp = result.get(result.size()-1);
                result.remove(result.size()-1);
                result.add(new Interval(Math.min(temp.start,intervals.get(i).start),Math.max(temp.end, intervals.get(i).end)));
            }else{
                result.add(intervals.get(i));
            }
        }
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i).start+ " "+result.get(i).end);
        }
        return null;
    }
     class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval( int s,  int e) { start = s; end = e; }
   }

    class IntervalSort implements Comparator<Interval>{

        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start-o2.start;
        }

    } 
}
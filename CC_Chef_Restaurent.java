
import java.util.*;
import java.lang.*;
import java.io.*;

public class CC_Chef_Restaurent {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while (test-- > 0) {
                int times = sc.nextInt();
                int query = sc.nextInt();
                ArrayList<Pair> arr = new ArrayList<Pair>(times);
                int queries[] = new int[query];
                for (int i = 0; i < times; i++) {
                    Pair p = new Pair(sc.nextInt(), sc.nextInt());
                    arr.add(p);
                }
                for (int i = 0; i < query; i++) {
                    queries[i] = sc.nextInt();
                }
                Collections.sort(arr, new PairSort());
                for (int i = 0; i < query; i++) {
                    int low = 0;
                    int high = arr.size() - 1;
                    int mid = low + (high - low) / 2;
                    int minWaitTime = Integer.MAX_VALUE;
                    if (queries[i] < arr.get(low).start) {
                        System.out.println(arr.get(low).start - queries[i]);
                    } else if (queries[i] >= arr.get(high).end) {
                        System.out.println(-1);
                    }
                    else{
                        while (low <= high) {
                            mid = low + (high - low) / 2;
                            if (queries[i] < arr.get(low).start) {
                                if(arr.get(low).start - queries[i]< minWaitTime){
                                    minWaitTime = arr.get(low).start - queries[i];
                                    break;
                                }
                            } else if (queries[i] > arr.get(high).end) {
                                if(queries[i] - arr.get(high).end < minWaitTime){
                                    minWaitTime = queries[i] - arr.get(high).end;
                                    break;
                                }
                            }else{
                                if (queries[i] >= arr.get(mid).start && queries[i] < arr.get(mid).end) {
                                    minWaitTime = 0;
                                    break;
                                } else if (queries[i] < arr.get(mid).start) {
                                    int wait = arr.get(mid).start - queries[i];
                                    if (minWaitTime > wait) {
                                        minWaitTime = wait;
                                    }
                                    high = mid - 1;
                                } else {
                                    low = mid + 1;
                                }
                            }
                        }
                        System.out.println(minWaitTime);
                    }
                }

            }

        } catch (Exception e) {
            throw e;
        }
    }
}

class PairSort implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        return p1.start - p2.start;
    }
}

class Pair {
    int start;
    int end;

    public Pair(int x, int y) {
        this.start = x;
        this.end = y;
    }
}
package sit.int202.jcfreview;

import java.util.HashMap;
import java.util.Map;

public class ProblemTwo {
    public static void main(String[] args) {
        int result = 6;
        int[] data = {1,2,3,4,5,8,7,9,6,4};
        Map<Integer ,Integer> map = new HashMap<>(16,0.75f); //default value
        for (int i = 0; i < data.length; i++) {
            int value = data[i];
            int requireValue = result - value;
             if(map.get(requireValue) == null) { //check duplicate
                 map.put(requireValue, i);
             } else {
                 int index = map.get(requireValue);
                 System.out.println("(" + index + ", " + i);
                 map.put(requireValue, i);
             }
        }
    }

    /* [(key:value)]
    * f(6) => x - 1 -> 5    [(1,0)]
    * f(6) => x - 2 -> 4    [(1,0) , (2,1)]
    * f(6) => x - 3 -> 3    [(1,0) , (2,1) , (3,2)]
    * f(6) => x - 5 -> 1   [*(1,0) , (2,1) , (3,2), *(5,3)] (3,0)
    * f(6) => x - 8 -> -2   [(1,0) , (2,1) , (3,2), (5,3) , (8,4)]
    * f(6) => x - 7 -> -1   [(1,0) , (2,1) , (3,2), (5,3) , (8,4) , (7,5)]
    * f(6) => x - 9 -> -3   [(1,0) , (2,1) , (3,2), (5,3) , (8,4) , (7,5) , (9,6)]
    * f(6) => x - 6 -> 0    [(1,0) , (2,1) , (3,2), (5,3) , (8,4) , (7,5) , (9,6) , (6,7)]
    * f(6) => x - 4 -> 2    [(1,0) , *(2,1) , (3,2), (5,3) , (8,4) , (7,5) , (9,6) , (6,7) , *(4,8)] (8,1)
    * */
}

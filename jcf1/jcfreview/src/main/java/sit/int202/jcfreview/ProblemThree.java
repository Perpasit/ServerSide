package sit.int202.jcfreview;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ProblemThree {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        if (!file.exists()) {
            System.out.println(file.getName() + " does NOT exist !!!");
            return;
        }
        Scanner sc = new Scanner(file);
        Map<String, List<Integer>> map = new HashMap<>(132);
        int index = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, " .=<>\"+-*/(){},0123456789[];");

            while (stk.hasMoreTokens()) {
                String word = stk.nextToken();
                if (map.get(word) == null) {
                    map.put(word, new LinkedList<>());
                }
                map.get(word).add(++index);
            }
        }
        sc.close();
        Comparator<Map.Entry<String, List<Integer>>> FREQ_SORT = new Comparator<Map.Entry<String, List<Integer>>>() {
            @Override
            public int compare(Map.Entry<String, List<Integer>> o1, Map.Entry<String, List<Integer>> o2) {
                return o1.getValue().size() - o2.getValue().size();
            }
        };
        List<Map.Entry<String, List<Integer>>> tmpList = map.entrySet().stream().sorted(FREQ_SORT).toList();

        for (Map.Entry<String, List<Integer>> entry : tmpList) {
            System.out.print(entry.getKey() + "(" + entry.getValue().size() + "): ");
            for (Integer i : entry.getValue()) {
                System.out.print("@" + i + "  ");
            }
            System.out.println();
        }
    }
}


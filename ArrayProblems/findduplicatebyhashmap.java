import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findduplicatebyhashmap {
    
public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        // Step 1: Count frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Collect elements that appear more than once
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }





}

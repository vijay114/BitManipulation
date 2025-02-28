package basics;

import java.util.*;

public class FindSubSet {
    
    public static void main(String[] args) {
        
        List<Integer> list = List.of(1,2,3);

        List<List<Integer>> subSets = new ArrayList<>();

        int numberOfSubset = 1 << list.size(); // = Math.pow(2, list.size());

        for(int i = 0; i < numberOfSubset; i++) {
            List<Integer> subSet = new ArrayList<>();

            for(int j = 0; j < list.size(); j++ ) {
                if((i & (1 << j)) != 0) {
                    subSet.add(list.get(j));
                }
            }
            subSets.add(subSet);

        }

        System.out.println(subSets);




    }

}

package io.kabir.leetcode;

import java.util.*;

public class NumberProblems {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    PairInt IDsOfmovies(int flightDuration, int numMovies, ArrayList<Integer> movieDuration) {

        Set<PairInt> rSet = new HashSet<>();
        movieDuration.forEach(dOut -> {
            movieDuration.forEach(dIn -> {
                if (dOut + dIn == flightDuration - 30) {
                    rSet.add(new PairInt(movieDuration.indexOf(dOut), movieDuration.indexOf(dIn)));
                }
            });
        });

        if (rSet.isEmpty()) return new PairInt(-1, -1);

        if(rSet.size() == 1 ) return rSet.iterator().next();

        PairInt longest = null;

        Iterator<PairInt> it = rSet.iterator();

        return rSet.iterator().next();
    }


    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> rSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> twoSum = twoSum(nums, i);
            if (twoSum.size() > 0) {
                twoSum.add(Integer.valueOf(nums[i]));
                twoSum.sort(Comparator.naturalOrder());
                rSet.add(twoSum);
            }
        }
        return new ArrayList<>(rSet);
    }


    private List<Integer> twoSum(int[] nums, int pos) {
        int[] result = new int[2];
        int target = -nums[pos];
        for (int idxOut = 0; idxOut < nums.length; idxOut++) {
            for (int idxIn = idxOut + 1; idxIn < nums.length; idxIn++) {
                if ((idxOut != pos) && (nums[idxOut] + nums[idxIn] == target)) {
                    result[0] = idxOut;
                    result[1] = idxIn;
                    break;
                }
            }
        }

        if (result[0] == 0 && result[1] == 0) return new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        r.addAll(Arrays.asList(nums[result[0]], nums[result[1]]));

        return r;
    }
}

class PairInt {
    int first, second;

    PairInt() {
    }

    public PairInt(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

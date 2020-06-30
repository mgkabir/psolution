package io.kabir.arrays;

public class Playground {

    /**
     *
     * @param myArray
     * @return number of subArrays that results to negative number when all
     * the elemenst are added together
     */
    public int negativeSubArrayNumber(int[] myArray){
        int numNegativeSubarrays = 0;

        for(int i = 0; i < myArray.length; i++) {
            for(int j = i; j < myArray.length; j++) {

                int sum = 0;

                for(int k = i; k <= j; k++) {
                    sum = sum + myArray[k];
                }

                if(sum < 0) {
                    numNegativeSubarrays++;
                }
            }
        }
        return numNegativeSubarrays;
    }
}

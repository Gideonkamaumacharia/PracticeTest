import com.sun.source.doctree.SeeTree;

import java.util.*;


public class PracticeTest {


//    List<Integer> nums = new ArrayList<>();
//    nums.addAll(Arrays.asList(1,2,3,6,29));



    public int largestNum(int[] nums){
        int max = nums[0];

        for (int i=0;i < nums.length;i++){
            if(nums[i] > max){
                 max = nums[i];
            }
        }
        return max;
    }

    public String reverseString(String string){
     char[] chars = string.toCharArray();
     int start = 0;
     int end = chars.length - 1;

     while (start < end){
         char temp = chars[start];
         chars[start] = chars[end];
         chars[end] = temp ;
         start ++;
         end --;

     }
        return new String(chars);
    }
//Given an array of integers, write a method to find the second largest number in the array.

    public int secondLargestNum(int[] nums){
        if(nums.length < 2){
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax && num < max){
                secondMax = num;

            }
        }return secondMax;
    }

    //Write a method that takes an array of strings and returns the number of strings that have a length greater than 3.
    //Example:
    //String[] words = {"Java", "Go", "Python", "C", "React"};
    //Expected; 3

    public int countLongWords(String[] words) {
        int count = 0;

        for (String word : words) {
            if (word.length() > 3) {
                count++;
            }
        }

        return count;
    }
//Remove duplicate elements from an array of numbers

    public Integer[] removeDuplicates(Integer [] nums){
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (Integer num : nums) {
            uniqueNumbers.add(num);
        }
    return uniqueNumbers.toArray(new Integer[0]);
    }

    //CountOccurences
//    public int[] countOccurrences (int [] nums){
//        int[] numbers = {5,6,8,9,5,6};
//        Map<Integer,Integer> countMap = new HashMap<>();
//
//        for(int num : nums){
//            if(countMap.containsKey(num)){
//                countMap.put(num,countMap.get(num) + 1);
//            }
//            else {
//                countMap.put(num,1);
//            }
//        }
////        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
////            System.out.println(entry.getKey() + " -> " + entry.getValue());
//    }
}

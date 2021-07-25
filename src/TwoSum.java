
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSumm(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(); int a= 0; int comp = 0;

        for(int i = 0; i< nums.length;i++)
        {
            map.put(nums[i],i); // map.put(K,V)
        }

        for(int i = 0; i< nums.length; i++)
        {
            comp = target - nums[i];

            if(map.containsKey(comp)&& map.get(comp) != i )
                return new int[]{i,map.get(comp)}; a= 1;
        }

        return new int[]{a,map.get(comp)};
    }
    // throw new IllegalArgumentException("No two sum solution");

    public int[] twoSumBrute(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        return (new int[]{i, j});
                    }
                }
            }
        }

        return nums;
    }
}

// using two pass Hash table

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/
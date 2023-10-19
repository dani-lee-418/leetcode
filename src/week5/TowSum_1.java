package week5;

public class TowSum_1 {

    public static void main(String[] args) {
        TowSum_1 s = new TowSum_1();
        int[] nums = {3,3};
        int target = 6;
        int[] answer = s.twoSum(nums, target);
        System.out.println(answer[0]+" "+ answer[1]);
    }
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j < nums.length; j ++ ){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    answer[0]=i;
                    answer[1]=j;
                    return answer;
                }
            }
        }
        return answer;
    }
}

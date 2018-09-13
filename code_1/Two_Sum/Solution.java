/**
 * @Author:Yankaikai
 * @Description:给一个整型数组，返回指定数字的和对应数组中两个元素的位置。
 * @Date:Created in 2018/9/12
 */
public class Solution {
    public static void main(String[] args)
    {
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=twoSum(nums,target);
        if (result.length>0) {
            System.out.println("[" + result[0] + "," + result[1] + "]");
        }else {
            System.out.println("[]");
        }

    }

    /**
    * @Author：Yankaikai
    * @Description:
    * @Date: 2018/9/12
    * @param: nums-数组，target-目标和数字
    */
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;

    }
}

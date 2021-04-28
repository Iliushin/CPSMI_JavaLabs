package twentyOne_Dlinniy_i_korotkiy;
// ищет максимум и минимум в массиве

public class arr_min_max {

    public static void main(String[] args) {

        int[] nums = {12,454,3,65454,3,4,};
        int max = nums[0];
        int min = nums[0];
        for (int i=1; i< nums.length; i++){
            if (max<nums[i]) max = nums[i];
            if (min>nums[i]) min = nums[i];

        }
        System.out.println(max + " " + min);



    }

}

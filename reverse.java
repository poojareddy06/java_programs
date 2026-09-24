public class reverse {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int leff=0;
        int right=nums.length-1;
        while(leff<right){
            int temp=nums[leff];
            nums[leff]=nums[right];
            nums[right]=temp;
            leff++;
            right--;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}

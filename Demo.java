class Demo{
	public static void main(String[] args){
		int[] nums = {12,45,7,89,32};
		
		int large = nums[0];
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]>large){
				large = nums[i];
			}
		}
		System.out.println(large);
	}
}

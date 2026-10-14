/*class Demo{
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
}*/


/*class Demo{
	public static void main(String[] args){
		int[] nums = {-2,-5,-7,-8,-1};
		
		int large = nums[0];
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]>large){
				large = nums[i];
			}
		}
		System.out.println(large);
	}
}*/
/*class Demo{
	public static void main(String[] args){
		int[] nums = {18, 7, 32, 4, 15};
		
		int min = nums[0];
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]<min){
				min = nums[i];
			}
		}
		System.out.println(min);
	}
}*/


class Demo{
	public static void main(String[] args){
		int[] nums = {};
		
		if(nums.length == 0){
			System.out.println("Empty array");
		}else{
			int min = nums[0];
			
			for(int i=0; i<nums.length; i++){
				if(nums[i]<min){
					min = nums[i];
				}
			}
			System.out.println(min);
		}
	}
}

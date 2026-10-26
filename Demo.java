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


/*class Demo{
	public static void main(String[] args){
		int[] nums = {};
		
		if(nums.length == 0){
			System.out.println("Empty array");
		}else{
			int min = nums[0];

			for(int i=0; i<nums.length; i++){
		if(nums[i]<min)
			}
			System.out.println(min);
		}
	}
}*/


class Demo{
	public static void main(String[] args){
		int[] numbers = {25, 10, 70, 45, 60};

		int large = numbers[0];
		int small = numbers[0];
		
		for(int i = 0; i < numbers.length; i++){
			if (numbers[i] > large) {
				large = numbers[i];
			}

			if (numbers[i] < small) {
				small = numbers[i];
			}
		}
		System.out.println(large);
		System.out.println(small);
	}
}

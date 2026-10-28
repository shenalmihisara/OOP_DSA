

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


/*class Demo{
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
}*/


/*class Demo {
	public static void main(String[] args) {
		int[] numbers = {-8, -3, -15, -2};

		int small = numbers[0];
		int large = numbers[0];

		for(int i = 1; i < numbers.length; i++){
			if (numbers[i] < small ) {
				small = numbers[i];
			}

			if (numbers[i] > large) {
				large = numbers[i];
			}
		}
		System.out.println(small);
		System.out.println(large);
	}
	
}*/


//==========First complexity O(1) - constant time=======================


/*class Demo {
	public static void main(String[] args) {
		int[] numbers = {12, 45, 7, 89, 32};

		System.out.println(numbers[0]);
	}

	
}*/


//============Secound complexity O(2) - liner time==========================


/*public class Demo {
	public static void main(String[] args) {
		int[] numbers = {18, 7, 32, 4, 15};

		int small = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (small > numbers[i]) {
				small = numbers[i];
			}
		}
		System.out.println(small);
	}

	
}*/


//==============Thirde cmplexity: O(n^2) - quadratic time=====================


// public class Demo {
// 	public static void main(String[] args) {
// 		int[] numbers = {10, 20, 30, 40, 50};

// 		for (int i = 0; i < numbers.length; i++) {
// 			for (int j = 0; j < numbers.length; j++) {
// 				System.out.println(numbers[i] + "," + numbers[j]);
// 			}
// 		}
// 	}
// }



// ====================Searching algorithms=======================

// ------------------------Linear Search------------------



// public class Demo {
// 	public static void main(String[] args) {
// 		int[] num = {10, 20, 30, 40, 50};

// 		int target = 100;
// 		int search = 0;

// 		for (int i = 0; i < num.length; i++) {
// 			if(target == num[i]){
// 				search = target;
// 			}
// 		}
// 		if (target == search) {
// 				System.out.println("target found" + search);
// 			}else{
// 				System.err.println("number not found");
// 			}
// 	}	
// }



// public class Demo {
// 	public static void main(String[] args) {
// 		int[] num = {10, 20, 30, 40, 50};

// 		int target = 30;
// 		int search = -1;

// 		for (int i = 0; i < num.length; i++) {
// 			if (num[i] == target) {
// 				 search = i;

// 				 break;
// 			}
// 		}

// 		if (target != -1) {
// 			System.err.println("target found " + search);
// 		}else{
// 			System.err.println("target not found");
// 		}
// 	}	
// }



// --------------------Binary Search------------------------------------


// public class Demo {
// 	public static void main(String[] args) {
// 		int[] nums = {10, 20, 30, 40, 50, 60, 70};

// 		int target = 70; 

// 		int left = 0;
// 		int right = nums.length - 1;

// 		int searchnum = -1;

// 		while (left <= right) {
// 			int mid = left + (right-left)/2;

// 			if (nums[mid] == target) {

// 				searchnum = mid;

// 				break;

// 			}else if (nums[mid] < target) {

// 				left = mid + 1;

// 			}else{

// 				right = mid - 1;
// 			}
// 		}

// 		if (searchnum != -1) {
// 			System.out.println("Number Found : " + searchnum);
// 		}else{
// 			System.out.println("number not found");
// 		}
// 	}	
// }



// public class Demo {
// 	public static void main(String[] args) {
// 		int[] numbers = {10, 20, 30, 40, 50};
		
// 		int target = 35;

// 		int left = 0;
// 		int right = numbers.length-1;

// 		int Searching = -1;

// 		while (left <= right) {
// 			int mid = left + (right-left)/2;

// 			if (target == numbers[mid]) {
// 				Searching = mid;

// 				break;

// 			}else if (target > numbers[mid]) {

// 				left = mid+1;

// 			}else{

// 				right = mid-1;
// 			}
// 		}
		
// 		if (Searching != -1) {
// 			System.out.println("Number Found : " + Searching);
// 		}else{
// 			System.out.println("Number Not found : " + Searching);
// 		}

// 	}	
// }



// ====================Soarting=======================

// ---------------------Bubble Sort--------------------


// public class Demo {

//     public static void main(String[] args) {
//         int[] nums = {5, 2, 4, 1, 3};

//         int large = 0;

//         for (int i = 0; i < nums.length-1-i; i++) {

// 			for (int j = 0; j < nums.length - 1; j++) {
// 				if (nums[j] > nums[j+1]) {
					
// 					large = nums[j];

// 					nums[j] = nums[j+1];
// 					nums[j+1] = large;
// 				}
// 			}

// 		}

// 		for (int i = 0; i < nums.length; i++) {
//             System.out.println(nums[i]);
//         }

        //     if (nums[1] > nums[2]) {
        //         large = nums[1];

        //         nums[1] = nums[2];
        //         nums[2] = large;

        //     } else {
        //         large = nums[2];
        //     }

        //     if (nums[2] > nums[3]) {
        //         large = nums[2];

        //         nums[2] = nums[3];
        //         nums[3] = large;

        //     } else {
        //         large = nums[3];
        //     }

        //     if (nums[3] > nums[4]) {
        //         large = nums[3];

        //         nums[3] = nums[4];
        //         nums[4] = large;

        //     } else {
        //         large = nums[4];
        //     }
        // }

        
//     }
// }




// public class Demo {
// 	public static void main(String[] args) {
// 		int[] numbers = {8, 3, 6, 2};

// 		int temp = -1;

// 		for (int i = 0; i < numbers.length - 1; i++) {
// 			for (int j = 0; j < numbers.length - 1 - i; j++) {
// 				if (numbers[j] > numbers[j+1]) {
// 					temp = numbers[j];

// 					numbers[j] = numbers[j+1];
// 					numbers[j+1] = temp;

// 				}else{

// 					temp = numbers[j+1];
// 				}
// 			}
// 		}

// 		for (int i = 0; i < numbers.length; i++) {
// 			System.out.println(numbers[i]);
// 		}
// 	}
// }



// public class Demo {
// 	public static void main(String[] args) {
// 		int[] numbers = {8, 3, 6, 2};

// 		int temp = -1;

// 		for (int i = 0; i < numbers.length - 1; i++) {
// 			for (int j = 0; j < numbers.length - 1 - i; j++) {
// 				if (numbers[j] < numbers[j+1]) {
// 					temp = numbers[j];

// 					numbers[j] = numbers[j+1];
// 					numbers[j+1] = temp;

// 				} else {
// 					temp = numbers[j+1];
// 				}
// 			}
// 		}

// 		for (int i = 0; i < numbers.length; i++) {
// 			System.out.println(numbers[i]);
// 		}
// 	}
// }


// ---------------------Selection Sort--------------------


// public class Demo {

//     public static void main(String[] args) {
//         int[] numbers = {29, 10, 14, 37, 13};

//         for (int i = 0; i < numbers.length - 1; i++) {

//             int minIndex = i;

//             for (int j = i; j < numbers.length; j++) {
//                 if (numbers[j] < numbers[minIndex]) {
//                     minIndex = j;
//                 }

//             }

//             int temp = numbers[i];
//             numbers[i] = numbers[minIndex];
//             numbers[minIndex] = temp;

//         }
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }
//     }
// }


/**
 * Demo
//  */
// public class Demo {
// 	public static void main(String[] args) {
// 		int[] num = {29, 10, 14, 37, 13};
		
// 		for (int i = 0; i < num.length - 1; i++) {
// 			int minIndex = i;

// 			for (int j = i; j < num.length; j++) {
// 				if (num[j] < num[minIndex]) {
// 					minIndex = j;
// 				}
// 			}
// 			int temp = num[i];
// 			num[i] = num[minIndex];
// 			num[minIndex] = temp;
// 		}
// 		for (int i = 0; i < num.length; i++) {
// 			System.out.println(num[i]);
// 		}
// 	}
// }


// ---------------------Insertion Sort--------------------


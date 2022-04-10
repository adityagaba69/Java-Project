package Unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		System.out.println("Array elements after sorting:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			// Print sorted elements of the Array
			System.out.println(arr[i]);
		}

	}

	void findTheDuplicateElements(int[] arr) {
		System.out.println("Duplicate elements in the array: ");
		
		// Search for duplicate elements
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		for(int i=0;i<arr.length;i++) { // Use to hold the element
			for (int j=i+1;j<arr.length;j++) { // Use to compare with the rest of the elements
				if(arr[i] < arr[j]) { // Check and Swap
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println("Second Largest element is "+arr[1]); 
		System.out.println("Second Smallest element is "+arr[arr.length-2]);

	}

	void leftRotationInAnArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int j, first; 
			
			// Stores the first element of the array
			first = arr[0];
			
			for (j=0;j<arr.length;j++) {
				// Shift element of array by one
				arr[j] = arr[j+1];
			}
			
			// First element of array will be added to the end
			arr[j] = first;
		}
		
		System.out.println();
		//Displays resulting array after rotation
		System.out.println("Array after left rotation: ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}

	}

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}

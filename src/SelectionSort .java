// Java program for implementation of Selection Sort 
class SelectionSort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		//ขอบเขตการเคลื่อนย้ายทีละตัวของ subarray ที่ไม่มีการเรียงลำดับ
		for (int i = 0; i < n-1; i++) // 
		{ 
			
			// ค้นหาองค์ประกอบขั้นต่ำในอาร์เรย์ที่ไม่ได้เรียงลำดับ
			int min_idx = i; // 1 , 2
			for (int j = i+1; j < n; j++) //

				if (arr[j] < arr[min_idx]) // 
					min_idx = j; //
			// สลับองค์ประกอบขั้นต่ำที่พบกับองค์ประกอบแรก
             // element
			int temp = arr[min_idx]; // arr[min_idx] = 2 next 45 next 59 next 73
			arr[min_idx] = arr[i];  
			arr[i] = temp; // temp = 26 next 45 next 59 next 73
		} 
	} 

	// พิมพ์อาร์เรย์
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		SelectionSort ob = new SelectionSort(); 
		int arr[] = {73, 45, 26 , 59 , 87}; // value จะทดสอบด้านบน
		ob.sort(arr); 
		System.out.print("Sorted array :\t"); 
		ob.printArray(arr); 
	} 
} 

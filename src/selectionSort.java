
public class selectionSort {
	
	public static void selection(int [] nums){

		for (int i = 0; i<nums.length; i++)
		{
			int index = i;
			for (int j = i+1; j<nums.length-1; j++)
			{
				if (nums[j] < nums[index])
				{
					index = j;
				}
			}
			int minNum = nums[i];
			nums[i] = nums[index];
			nums[index] = minNum;
			
			System.out.print(nums[i] + " ");
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = new int [10];
		
		for (int a=0; a<nums1.length; a++)
		{
			int j = (int)(Math.random()*9+1);
			nums1[a] = j;
		}
		selection(nums1);
	}

}

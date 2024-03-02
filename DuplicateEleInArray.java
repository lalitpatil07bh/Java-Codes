import java.util.ArrayList;
import java.util.List;

public class DuplicateEleInArray {
	
	public static List duplicateArray(int []arr)
	{
		ArrayList<Integer> al =new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					al.add(arr[i]);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,3,6,1};
	   System.out.println(	duplicateArray(arr));
		

	}

}

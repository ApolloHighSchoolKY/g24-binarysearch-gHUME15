import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		int bottom = 0;
		int top = ray.length-1;
		while( bottom <= top)
		{
			int avg = (bottom + top) / 2;

			if (ray[avg] == item)
				return avg;


			if (ray[avg] > item)
				top = avg - 1;


			else
				bottom = avg + 1;
		}
			return -1;
		
		
		// to low then to high
		//Arrays.sort(arrayName)
		//Arrays.reverse(arreayName)
		//When bottom is grater then the top stop
		
	}
	
}

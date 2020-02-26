
import java.util.ArrayList;

public class EgyptianFraction {


	public static int GCF (int a, int b)
	{
		if (b == 0)
		{
			return a;
		}
		else 
		{
			return (GCF(b, a % b));
		}
	}
	
	public static ArrayList<Integer> fractions = new ArrayList<Integer>();
	
	public static void EFHelper(int num, int den)
	{
				// 1/number format
				if (num == 1)
				{
					fractions.add(den);
				}
				else
				{
					int frac = (den / num) + 1;
					fractions.add(frac);
					//find greatest common factor
					int gcf = GCF((num*frac)/ - den , (den*frac));
					// recursive call
					egyptianFraction(((num*frac) - den)/gcf, ((den*frac)/gcf));
				}
	}
	public static int[] egyptianFraction(int num, int den)
	{	
		// if the value is equal to 0
		if (num == 0 || den == 0)
		{
			int[] array= new int[] {0};
			return array;
		}
		// recursion
		EFHelper(num, den);

		// converts arraylist to int array
		int fsize = fractions.size();
		int[] Array = new int[fsize];
		for (int i = 0; i < fsize; i++)
        {
           Array[i] = fractions.get(i);
        }
		return Array;
		
	}


	

	
	
}


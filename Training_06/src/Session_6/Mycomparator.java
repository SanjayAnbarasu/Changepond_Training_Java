package Session_6;

import java.util.Comparator;

public class Mycomparator implements Comparator<T>
{
	public int compare(Integer i1,Integer i2) {
		if(i1<i2)
			return +1;
		else if (i1>i2)
			return -1;
		else
			return 0;
	}
}

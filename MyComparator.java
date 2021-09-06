package com.src;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		item e1=(item)o1;
		item e2=(item)o2;
		if(e1.price>e2.price)
			return -1;
		else if(e1.price<e2.price)
			return 1;
		else
			return 0;
	}

}

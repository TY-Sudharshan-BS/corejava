package com.tyss.mockpractice.sets;

import java.util.Comparator;

public class SortMobileByBrand implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o2.brand.compareTo(o1.brand);
	}

}

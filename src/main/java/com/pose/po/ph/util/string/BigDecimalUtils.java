package com.pose.po.ph.util.string;

import java.math.BigDecimal;

public  class BigDecimalUtils {

	public static BigDecimal getBigDecimal(BigDecimal b) {
		if (null == b)
			return BigDecimal.ZERO;
		else
			return b;
	}
}

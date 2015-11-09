package com.pose.po.ph.util.math;

import java.math.BigDecimal;

import com.pose.po.ph.constants.PoseidonConstants;


public class Formula {

	// public static final DecimalFormat format = new DecimalFormat("0.00");

	/**
	 * 计算利息
	 */
	public static final BigDecimal interest(BigDecimal amt, Integer term, String termType, BigDecimal rate) {
		if (rate == null)
			return BigDecimal.ZERO;
		BigDecimal tmp = Arith.mul(Arith.mul(amt, rate), new BigDecimal(term));
		if (PoseidonConstants.FINANCEPRODUCT_TIMETYPE_DAY.equals(termType)) {
			return tmp.divide(new BigDecimal(36500), 2, BigDecimal.ROUND_FLOOR);
		} else if (PoseidonConstants.FINANCEPRODUCT_TIMETYPE_MONTH.equals(termType)) {
			return tmp.divide(new BigDecimal(1200), 2, BigDecimal.ROUND_FLOOR);
		} else {
			throw new IllegalArgumentException("没有匹配的期限类型（" + termType + "）。");
		}
	}

	/**
	 * 计算融资管理费 - 保留两位小数
	 * 
	 * @author gongdaowen
	 */
	public static final BigDecimal manage(BigDecimal amt, Integer term, String termType, BigDecimal rate) {
		if (rate == null)
			return BigDecimal.ZERO;
		BigDecimal tmp = Arith.mul(Arith.mul(amt, rate), new BigDecimal(term));
		// 带百分号的费率
		if (PoseidonConstants.FINANCEPRODUCT_TIMETYPE_DAY.equals(termType)) {
			return tmp.divide(new BigDecimal(36500), 2, BigDecimal.ROUND_FLOOR);
		} else if (PoseidonConstants.FINANCEPRODUCT_TIMETYPE_MONTH.equals(termType)) {
			return tmp.divide(new BigDecimal(1200), 2, BigDecimal.ROUND_FLOOR);
		} else {
			throw new IllegalArgumentException("没有匹配的期限类型（" + termType + "）。");
		}
	}

	/**
	 * 计算融资交易费 - 保留两位小数
	 * 
	 * @author gongdaowen
	 */
	public static final BigDecimal trade(BigDecimal amt, BigDecimal rate) {
		if (rate == null)
			return BigDecimal.ZERO;
		return Arith.mul(amt, rate).divide(new BigDecimal(100), 2, BigDecimal.ROUND_FLOOR);
	}
}

package com.pose.po.ph.util.string;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class UnknownUtils {
	private static DateFormat format = new SimpleDateFormat("yyMMdd");

	/**
	 * 生成资产编号
	 */
	public static String createAssetCode(int num) {
		return format.format(new Date()) + StringUtils.leftPad(String.valueOf(num), 4, "0");
	}

	/**
	 * 生成客户序列号
	 */
	public static String createCustomerSerialNum(Long num) {
		if (num == null) {
			num = 5000l;
		} else {
			num += 1;
		}
		// 不足7位的前面补0
		return StringUtils.leftPad(String.valueOf(num), 7, "0");
	}
}

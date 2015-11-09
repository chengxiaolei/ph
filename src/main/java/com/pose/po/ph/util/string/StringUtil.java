package com.pose.po.ph.util.string;


public class StringUtil {

	public static String formatForPrint(String hexString) {
		StringBuffer strLog = new StringBuffer();
		strLog.append("\t");
		for (int i = 0; i < hexString.length(); i += 2) {
			String strTemp = hexString.substring(i, i + 2);
			strLog.append(strTemp + " ");
			if (((i + 2) % 32 == 0) && (i != 0)) {
				strLog.append("\n");
				strLog.append("\t");
			}
		}
		return strLog.toString();
	}

	public static boolean isEmpty(String value) {
		return (value == null) || (value.equals(""));
	}

	public static String addZoreBefore(int value, int length) {
		return addZoreBefore(String.valueOf(value), length);
	}

	public static String addZoreBefore(String value, int length) {
		if (value.length() >= length) {
			return value;
		}
		StringBuilder result = new StringBuilder(value);
		int count = length - value.length();
		for (int i = 0; i < count; i++) {
			result.insert(0, "0");
		}
		return result.toString();
	}

}

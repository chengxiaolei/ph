package com.pose.po.ph.util.string;

import java.util.Date;
import java.util.Map;

import com.pose.po.ph.constants.PoseidonConstants;


public class MessageFormatUtils {

	public static String format(String pattern, Map<String, Object> arguments) {
		String formatedStr = pattern;
		for (String key : arguments.keySet()) {
			Object value = arguments.get(key);
			if (value instanceof Date) {
				if (key.endsWith("Time"))
					value = PoseidonConstants.df1.format(value);
				else
					value = PoseidonConstants.df.format(value);
			}
			formatedStr = formatedStr.replaceAll("\\{" + key + "\\}", value.toString());
		}
		return formatedStr;

	}
}

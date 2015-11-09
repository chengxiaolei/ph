package com.pose.po.ph.util.coll;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;


public class MapToBeanUtil {

	/**
	 * 将一个 Map 对象转化为一个 JavaBean
	 * 
	 * @param type
	 *            要转化的类型
	 * @param map
	 *            包含属性值的 map
	 * @return 转化出来的 JavaBean 对象
	 * @throws IntrospectionException
	 *             如果分析类属性失败
	 * @throws IllegalAccessException
	 *             如果实例化 JavaBean 失败
	 * @throws InstantiationException
	 *             如果实例化 JavaBean 失败
	 * @throws InvocationTargetException
	 *             如果调用属性的 setter 方法失败
	 */

	public static Object convertMap(Class<?> type, Map<String, ? extends Object> map) {
		Object obj;
		try {
			obj = type.newInstance();
			BeanUtils.populate(obj, map);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return obj;
	}
	
	

}
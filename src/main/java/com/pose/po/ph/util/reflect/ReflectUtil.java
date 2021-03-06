package com.pose.po.ph.util.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pose.po.ph.model.User;

public class ReflectUtil {
	/**
	 * 
	 *@description: 根据属性名获取属性值
	 *@author: wujinsong
	 * @param fieldName
	 * @param o
	 * @return
	 */
    public static Object getFieldValueByName(String fieldName, Object o) {
        try {  
            String firstLetter = fieldName.substring(0, 1).toUpperCase();  
            String getter = "get" + firstLetter + fieldName.substring(1);  
            Method method = o.getClass().getMethod(getter, new Class[] {});  
            Object value = method.invoke(o, new Object[] {});  
            return value;  
        } catch (Exception e) {  
            return null;  
        }  
    } 
    
    /**
     * 
     *@description: 获取属性名数组
     *@author: wujinsong
     * @param o
     * @return
     */
    public static String[] getFiledName(Object o){
    	Field[] fields=o.getClass().getDeclaredFields();
       	String[] fieldNames=new String[fields.length];
    	for(int i=0;i<fields.length;i++){
    		System.out.println(fields[i].getType());
    		fieldNames[i]=fields[i].getName();
    	}
    	return fieldNames;
    }
    
    /**
     * 
     *@description: 获取属性类型(type)，属性名(name)，属性值(value)的map组成的list
     *@author: wujinsong
     * @param o
     * @return
     */
    @SuppressWarnings({ "unchecked", "unused", "rawtypes" })
    public static List getFiledsInfo(Object o){
    	Field[] fields=o.getClass().getDeclaredFields();
       	String[] fieldNames=new String[fields.length];
       	List list = new ArrayList();
       	Map infoMap=null;
    	for(int i=0;i<fields.length;i++){
    		infoMap = new HashMap();
    		infoMap.put("type", fields[i].getType().toString());
    		infoMap.put("name", fields[i].getName());
    		infoMap.put("value", getFieldValueByName(fields[i].getName(), o));
    		list.add(infoMap);
    	}
    	return list;
    }
    
    /**
     * 
     *@description: 获取对象的所有属性值，返回一个对象数组
     *@author: wujinsong
     * @param o
     * @return
     */
    public static Object[] getFiledValues(Object o){
    	String[] fieldNames=getFiledName(o);
    	Object[] value=new Object[fieldNames.length];
    	for(int i=0;i<fieldNames.length;i++){
    		value[i]=getFieldValueByName(fieldNames[i], o);
    	}
    	return value;
    }	
    public static void main(String[] args) {
		
    	Object objArr=getFieldValueByName("name",User.class);
    	//for(Object obj:objArr){
    		System.out.println(objArr.toString());
    	//}
    	
	}
}

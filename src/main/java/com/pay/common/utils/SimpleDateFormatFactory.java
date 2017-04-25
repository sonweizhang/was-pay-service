package com.pay.common.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @Title: SimpleDateFormatFactory.java 
 * @Description: 日期格式化工厂类  
 * @author qiyasen  
 * @Modified qiyasen      
 * @date 2015-5-19 上午9:48:04   
 * @version V1.0
 */
public class SimpleDateFormatFactory {

	
	private static SimpleDateFormatFactory simpleDateFormatFactory ;
	
	private static String format;
	
	private SimpleDateFormatFactory(){
		
	}
	public static SimpleDateFormatFactory getInstance(String pattern){
		format=pattern;
		simpleDateFormatFactory=new SimpleDateFormatFactory();
		return simpleDateFormatFactory;
	}
	
	public String parse(String dateString){
		SimpleDateFormat df = new SimpleDateFormat(format);
		Timestamp ts = new Timestamp(System.currentTimeMillis());  
        String returnValue ="";
		Date date = new Date();  
        try {  
            date = ts;
            returnValue=df.format(date);
            System.out.println(date);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return returnValue;
	}
	
}

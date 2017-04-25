package com.pay.common.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtil {

	 private int year = 0;

	    private int month = 0;

	    private int day = 0; 

	    private int hour = 0;

	    private int minute = 0; 

	    private int second = 0;

	    public static final String FULL_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss"; 

	    /**
	     * @author: lvhongwei
	     * @create: 2004-6-15
	     * 
	     *  
	     */
	    public DateUtil() {
	        Calendar now = Calendar.getInstance();
	        setDatetime(now);
	    }

	    public DateUtil(String s) throws NumberFormatException {
	        this();
	        try {
	            if (s.length() > 1) {
	                this.year = Integer.parseInt(s.substring(0, 4));
	                this.month = Integer.parseInt(s.substring(5, 7));
	                this.day = Integer.parseInt(s.substring(8, 10));
	            }
	            if (s.length() > 10) {
	                this.hour = Integer.parseInt(s.substring(11, 13));
	                this.minute = Integer.parseInt(s.substring(14, 16));
	                this.second = Integer.parseInt(s.substring(17, 19));
	            } else {
	                this.hour = 0;
	                this.minute = 0;
	                this.second = 0;
	            }
	        } catch (Exception e) {

	        }
	        check();
	    }

	    public DateUtil(Calendar cale) {
	        setDatetime(cale);
	    }

	    private void setDatetime(Calendar calendar) {
	        this.year = calendar.get(Calendar.YEAR);
	        this.month = calendar.get(Calendar.MONTH) + 1;
	        this.day = calendar.get(Calendar.DAY_OF_MONTH);
	        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
	        this.minute = calendar.get(Calendar.MINUTE);
	        this.second = calendar.get(Calendar.SECOND);
	    }

	    public DateUtil(Date d) {
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(d);
	        setDatetime(calendar);
	    }

	    public DateTime addDays(int days) {
	        return manipulate(Calendar.DATE, days);

	    }

	    public DateTime addHours(int hours) {
	        return manipulate(Calendar.HOUR_OF_DAY, hours);
	    }

	    public DateTime addMinutes(int minutes) {
	        return manipulate(Calendar.MINUTE, minutes);
	    }

	    public DateTime addMonths(int months) {
	        return manipulate(Calendar.MONTH, months);
	    }

	    public DateTime addYears(int years) {
	        return manipulate(Calendar.YEAR, years);
	    }

	    private void check() {
	        if (this.year < 1 || this.year > 2500)
	            System.out.println("year is wrong");
	        if (this.month < 1 || this.month > 12)
	            System.out.println("month is wrong");
	        int flag = 0;
	        if ((this.year % 4) == 0) {
	            flag = 1;
	            if (((this.year % 100) == 0) && ((this.year % 400) != 0))
	                flag = 0;
	            else
	                flag = 1;
	        }
	        if (this.day < 1)
	            System.out.println("day is wrong");
	        if (this.month == 2)
	            if (flag == 0 && this.day > 28)
	                System.out.println("day is wrong");
	            else if (flag == 1 && this.day > 29)
	                System.out.println("day is wrong");
	            else if (this.day > 28)
	                System.out.println("day is wrong");
	        if (this.hour < 0 || this.hour > 23)
	            System.out.println("hour is wrong");
	        if (this.minute < 0 || this.minute > 59)
	            System.out.println("minute is wrong");
	        if (this.second < 0 || this.second > 59)
	            System.out.println("second is wrong");
	    }

	    private String convert(int i) {
	        if (i < 10)
	            return "0" + String.valueOf(i);
	        else
	            return String.valueOf(i);
	    }

	    public static Date getCurrentDateByDate() {
	        Calendar calendar = Calendar.getInstance();
	        return calendar.getTime();
	    }

	    public static String getCurrentDateByString() {
	        String datetime = new Timestamp(System.currentTimeMillis()).toString();
	        return datetime.substring(0, 11);
	    }

	    public static String getCurrentDatetimeByString() {
	        String datetime = new Timestamp(System.currentTimeMillis()).toString();
	        return datetime.substring(0, 19);
	    }

	    public String getDate() {
	        StringBuffer sb = new StringBuffer();
	        sb.append(convert(this.year));
	        sb.append("-");
	        sb.append(convert(this.month));
	        sb.append("-");
	        sb.append(convert(this.day));
	        return sb.toString();
	    }

	    public int getDateInt() {

	        StringBuffer sb = new StringBuffer();
	        sb.append(convert(this.year));
	        sb.append(convert(this.month));
	        sb.append(convert(this.day));
	        return Integer.valueOf(sb.toString()).intValue();
	    }

	    public long getDateLong() {
	        StringBuffer sb = new StringBuffer();
	        sb.append(convert(this.year));
	        sb.append(convert(this.month));
	        sb.append(convert(this.day));
	        return Long.valueOf(sb.toString()).longValue();

	    }

	    public static Date getDateFromString(String s) {
	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat(FULL_TIME_FORMAT);
	            return sdf.parse(s);
	        } catch (ParseException e) {
	            System.out.println("Date Parse Error:" + e.getMessage());
	            return null;
	        }
	    }

	    public int getDay() {
	        return this.day;
	    }

	    public int getDayOfWeek() {
	        Calendar cale = this.toCalendar();
	        return cale.get(Calendar.DAY_OF_WEEK);
	    }

	    public int getFirstDayOfWeek() {
	        Calendar cale = this.toCalendar();
	        return cale.getFirstDayOfWeek();
	    }

	    /**
	     * 
	     * @return
	     */
	    public int getHour() {
	        return this.hour;
	    }

	    /**
	     * 
	     * @return
	     */
	    public int getMinute() {
	        return this.minute;
	    }

	    /**
	     * 
	     * @return
	     */
	    public int getMonth() {
	        return this.month;
	    }

	    /**
	     * 
	     * @return
	     */
	    public String getNoDeliCurrentDate() {
	        StringBuffer sb = new StringBuffer();
	        sb.append(convert(this.year));
	        sb.append(convert(this.month));
	        sb.append(convert(this.day));
	        return sb.toString();
	    }

	    /**
	     * 
	     * @return
	     */
	    public int getSeasonOfYear() {
	        if (this.month > 0 && this.month < 4)
	            return 1;
	        if (this.month > 3 && this.month < 7)
	            return 2;
	        if (this.month > 6 && this.month < 10)
	            return 3;
	        if (this.month > 9 && this.month <= 12)
	            return 4;
	        return 0;
	    }

	    /**
	     * 
	     * @return
	     */
	    public int getSecond() {
	        return this.second;
	    }

	    /**
	     * 
	     * @param d
	     * @return
	     */
	    public static String getStringFromDate(Date d) {
	        SimpleDateFormat sdf = new SimpleDateFormat(FULL_TIME_FORMAT);
	        return sdf.format(d);
	    }
	    /**
	     * 
	     * @param d
	     * @return
	     */
	    public static String convertDateToString(Date d,String format) {
	    	SimpleDateFormat sdf = new SimpleDateFormat(format);
	    	return sdf.format(d);
	    }

	    public int getWeekOfMonth() {
	        Calendar cale = this.toCalendar();
	        return cale.get(Calendar.WEEK_OF_MONTH);
	    }

	    public int getWeekOfYear() {
	        Calendar cale = this.toCalendar();
	        return cale.get(Calendar.WEEK_OF_YEAR);
	    }

	    /**
	     * 
	     * @return
	     */
	    public int getYear() {
	        return this.year;
	    }

	    private DateTime manipulate(int type, int interval) {
	        check();
	        Calendar cale = Calendar.getInstance();
	        cale.set(this.year, this.month - 1, this.day, this.hour, this.minute);
	        cale.add(type, interval);
	        return new DateTime(cale);
	    }

	    /**
	     * 
	     * @param i
	     */
	    public void setDay(int i) {
	        this.day = i;
	    }

	    /**
	     * 
	     * @param i
	     */
	    public void setHour(int i) {
	        this.hour = i;
	    }

	    /**
	     * 
	     * @param i
	     */
	    public void setMinute(int i) {
	        this.minute = i;
	    }

	    /**
	     * 
	     * @param i
	     */
	    public void setMonth(int i) {
	        this.month = i;
	    }

	    /**
	     * 
	     * @param i
	     */
	    public void setSecond(int i) {
	        this.second = i;
	    }

	    /**
	     * 
	     * @param i
	     */
	    public void setYear(int i) {
	        this.year = i;
	    }

	    public Calendar toCalendar() {
	        check();
	        Calendar cale = Calendar.getInstance();
	        cale.set(this.year, this.month - 1, this.day, this.hour, this.minute);
	        return cale;
	    }

	    public Date toDate() {
	        String s = toString();
	        return getDateFromString(s);
	    }

		/** 
		 * formatDateToString(将日期格式化为指定的格式，并返回该日期的字符串表示) 
		 * (这里描述这个方法适用条件 – 可选) 
		 * @param date
		 * @param format
		 * @return  
		 * String 
		 * @exception  
		 * @since  1.0
		*/
		public static String formatDateToString(Date date, String format)
		{
			SimpleDateFormat sdf = new SimpleDateFormat(format);
	        String sd = sdf.format(date);
	        return sd;
		}
		
		/** 
		 * formatDateToString(把字符串表示的日期，按照指定格式，格式化为日期对象) 
		 * (这里描述这个方法适用条件 – 可选) 
		 * @param date
		 * @param format
		 * @return  
		 * String 
		 * @exception  
		 * @since  1.0
		*/
		public static Date parseStringToDate(String date, String format)
		{
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Date d = null;
	        try {
	        	d = sdf.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
	        return d;
		}
	    public String toString() {
	        StringBuffer sb = new StringBuffer(19);
	        check();
	        sb.append(convert(this.year));
	        sb.append("-");
	        sb.append(convert(this.month));
	        sb.append("-");
	        sb.append(convert(this.day));
	        sb.append(" ");
	        sb.append(convert(this.hour));
	        sb.append(":");
	        sb.append(convert(this.minute));
	        sb.append(":");
	        sb.append(convert(this.second));
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        DateTime dt = new DateTime();
	        System.out.println(dt.getYear());
	        System.out.println(dt.getMonth());
	        System.out.println(dt.getDate());
	        System.out.println(dt.getDateInt());
	        System.out.println(dt.getDateLong());
	        System.out.println(dt.getDay());
	        System.out.println(dt.getDayOfWeek());
	        System.out.println(dt.getFirstDayOfWeek());
	        System.out.println(dt.getHour());
	        System.out.println(dt.getMinute());
	        System.out.println(dt.getMonth());
	        System.out.println(dt.getNoDeliCurrentDate());
	        System.out.println(dt.getSeasonOfYear());
	        System.out.println(dt.getSecond());
	        System.out.println(dt.getWeekOfMonth());
	        System.out.println(dt.getWeekOfYear());
	        System.out.println(DateTime.getCurrentDateByDate());
	        System.out.println(DateTime.getCurrentDateByString());
	        System.out.println(DateTime.getCurrentDatetimeByString());

	        System.out.println("********************");
	        System.out.println(dt.addMinutes(30));
	        System.out.println(dt);

	    }
	
}

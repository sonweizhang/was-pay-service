/*     */ package com.pay.common.utils;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.sql.Timestamp;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DateTime
/*     */ {
/*  23 */   private int year = 0;
/*     */   
/*  25 */   private int month = 0;
/*     */   
/*  27 */   private int day = 0;
/*     */   
/*  29 */   private int hour = 0;
/*     */   
/*  31 */   private int minute = 0;
/*     */   
/*  33 */   private int second = 0;
/*     */   
/*     */ 
/*     */ 
/*     */   public static final String datetimeFormat = "yyyy-MM-dd HH:mm:ss";
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public DateTime()
/*     */   {
/*  44 */     Calendar now = Calendar.getInstance();
/*  45 */     setDatetime(now);
/*     */   }
/*     */   
/*     */   public DateTime(String s) throws NumberFormatException {
/*  49 */     this();
/*     */     try {
/*  51 */       if (s.length() > 1) {
/*  52 */         this.year = Integer.parseInt(s.substring(0, 4));
/*  53 */         this.month = Integer.parseInt(s.substring(5, 7));
/*  54 */         this.day = Integer.parseInt(s.substring(8, 10));
/*     */       }
/*  56 */       if (s.length() > 10) {
/*  57 */         this.hour = Integer.parseInt(s.substring(11, 13));
/*  58 */         this.minute = Integer.parseInt(s.substring(14, 16));
/*  59 */         this.second = Integer.parseInt(s.substring(17, 19));
/*     */       } else {
/*  61 */         this.hour = 0;
/*  62 */         this.minute = 0;
/*  63 */         this.second = 0;
/*     */       }
/*     */     }
/*     */     catch (Exception e) {}
/*     */     
/*  68 */     check();
/*     */   }
/*     */   
/*     */   public DateTime(Calendar cale) {
/*  72 */     setDatetime(cale);
/*     */   }
/*     */   
/*     */   private void setDatetime(Calendar calendar) {
/*  76 */     this.year = calendar.get(1);
/*  77 */     this.month = (calendar.get(2) + 1);
/*  78 */     this.day = calendar.get(5);
/*  79 */     this.hour = calendar.get(11);
/*  80 */     this.minute = calendar.get(12);
/*  81 */     this.second = calendar.get(13);
/*     */   }
/*     */   
/*     */   public DateTime(Date d) {
/*  85 */     Calendar calendar = Calendar.getInstance();
/*  86 */     calendar.setTime(d);
/*  87 */     setDatetime(calendar);
/*     */   }
/*     */   
/*     */   public DateTime addDays(int days) {
/*  91 */     return manipulate(5, days);
/*     */   }
/*     */   
/*     */   public DateTime addHours(int hours)
/*     */   {
/*  96 */     return manipulate(11, hours);
/*     */   }
/*     */   
/*     */   public DateTime addMinutes(int minutes) {
/* 100 */     return manipulate(12, minutes);
/*     */   }
/*     */   
/*     */   public DateTime addMonths(int months) {
/* 104 */     return manipulate(2, months);
/*     */   }
/*     */   
/*     */   public DateTime addYears(int years) {
/* 108 */     return manipulate(1, years);
/*     */   }
/*     */   
/*     */   private void check() {
/* 112 */     if ((this.year < 1) || (this.year > 2500))
/* 113 */       System.out.println("year is wrong");
/* 114 */     if ((this.month < 1) || (this.month > 12))
/* 115 */       System.out.println("month is wrong");
/* 116 */     int flag = 0;
/* 117 */     if (this.year % 4 == 0) {
/* 118 */       flag = 1;
/* 119 */       if ((this.year % 100 == 0) && (this.year % 400 != 0)) {
/* 120 */         flag = 0;
/*     */       } else
/* 122 */         flag = 1;
/*     */     }
/* 124 */     if (this.day < 1)
/* 125 */       System.out.println("day is wrong");
/* 126 */     if (this.month == 2)
/* 127 */       if ((flag == 0) && (this.day > 28)) {
/* 128 */         System.out.println("day is wrong");
/* 129 */       } else if ((flag == 1) && (this.day > 29)) {
/* 130 */         System.out.println("day is wrong");
/* 131 */       } else if (this.day > 28)
/* 132 */         System.out.println("day is wrong");
/* 133 */     if ((this.hour < 0) || (this.hour > 23))
/* 134 */       System.out.println("hour is wrong");
/* 135 */     if ((this.minute < 0) || (this.minute > 59))
/* 136 */       System.out.println("minute is wrong");
/* 137 */     if ((this.second < 0) || (this.second > 59))
/* 138 */       System.out.println("second is wrong");
/*     */   }
/*     */   
/*     */   private String convert(int i) {
/* 142 */     if (i < 10) {
/* 143 */       return "0" + String.valueOf(i);
/*     */     }
/* 145 */     return String.valueOf(i);
/*     */   }
/*     */   
/*     */   public static Date getCurrentDateByDate() {
/* 149 */     Calendar calendar = Calendar.getInstance();
/* 150 */     return calendar.getTime();
/*     */   }
/*     */   
/*     */   public static String getCurrentDateByString() {
/* 154 */     String datetime = new Timestamp(System.currentTimeMillis()).toString();
/* 155 */     return datetime.substring(0, 11);
/*     */   }
/*     */   
/*     */   public static String getCurrentDatetimeByString() {
/* 159 */     String datetime = new Timestamp(System.currentTimeMillis()).toString();
/* 160 */     return datetime.substring(0, 19);
/*     */   }
/*     */   
/*     */   public String getDate() {
/* 164 */     StringBuffer sb = new StringBuffer();
/* 165 */     sb.append(convert(this.year));
/* 166 */     sb.append("-");
/* 167 */     sb.append(convert(this.month));
/* 168 */     sb.append("-");
/* 169 */     sb.append(convert(this.day));
/* 170 */     return sb.toString();
/*     */   }
/*     */   
/*     */   public int getDateInt()
/*     */   {
/* 175 */     StringBuffer sb = new StringBuffer();
/* 176 */     sb.append(convert(this.year));
/* 177 */     sb.append(convert(this.month));
/* 178 */     sb.append(convert(this.day));
/* 179 */     return Integer.valueOf(sb.toString()).intValue();
/*     */   }
/*     */   
/*     */   public long getDateLong() {
/* 183 */     StringBuffer sb = new StringBuffer();
/* 184 */     sb.append(convert(this.year));
/* 185 */     sb.append(convert(this.month));
/* 186 */     sb.append(convert(this.day));
/* 187 */     return Long.valueOf(sb.toString()).longValue();
/*     */   }
/*     */   
/*     */   public static Date getDateFromString(String s)
/*     */   {
/*     */     try {
/* 193 */       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 194 */       return sdf.parse(s);
/*     */     } catch (ParseException e) {
/* 196 */       System.out.println("Date Parse Error:" + e.getMessage()); }
/* 197 */     return null;
/*     */   }
/*     */   
/*     */   public int getDay()
/*     */   {
/* 202 */     return this.day;
/*     */   }
/*     */   
/*     */   public int getDayOfWeek() {
/* 206 */     Calendar cale = toCalendar();
/* 207 */     return cale.get(7);
/*     */   }
/*     */   
/*     */   public int getFirstDayOfWeek() {
/* 211 */     Calendar cale = toCalendar();
/* 212 */     return cale.getFirstDayOfWeek();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getHour()
/*     */   {
/* 220 */     return this.hour;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getMinute()
/*     */   {
/* 228 */     return this.minute;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getMonth()
/*     */   {
/* 236 */     return this.month;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getNoDeliCurrentDate()
/*     */   {
/* 244 */     StringBuffer sb = new StringBuffer();
/* 245 */     sb.append(convert(this.year));
/* 246 */     sb.append(convert(this.month));
/* 247 */     sb.append(convert(this.day));
/* 248 */     return sb.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getSeasonOfYear()
/*     */   {
/* 256 */     if ((this.month > 0) && (this.month < 4))
/* 257 */       return 1;
/* 258 */     if ((this.month > 3) && (this.month < 7))
/* 259 */       return 2;
/* 260 */     if ((this.month > 6) && (this.month < 10))
/* 261 */       return 3;
/* 262 */     if ((this.month > 9) && (this.month <= 12))
/* 263 */       return 4;
/* 264 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getSecond()
/*     */   {
/* 272 */     return this.second;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String getStringFromDate(Date d)
/*     */   {
/* 281 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 282 */     return sdf.format(d);
/*     */   }
/*     */   
/*     */   public int getWeekOfMonth() {
/* 286 */     Calendar cale = toCalendar();
/* 287 */     return cale.get(4);
/*     */   }
/*     */   
/*     */   public int getWeekOfYear() {
/* 291 */     Calendar cale = toCalendar();
/* 292 */     return cale.get(3);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getYear()
/*     */   {
/* 300 */     return this.year;
/*     */   }
/*     */   
/*     */   private DateTime manipulate(int type, int interval) {
/* 304 */     check();
/* 305 */     Calendar cale = Calendar.getInstance();
/* 306 */     cale.set(this.year, this.month - 1, this.day, this.hour, this.minute);
/* 307 */     cale.add(type, interval);
/* 308 */     return new DateTime(cale);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDay(int i)
/*     */   {
/* 316 */     this.day = i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHour(int i)
/*     */   {
/* 324 */     this.hour = i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMinute(int i)
/*     */   {
/* 332 */     this.minute = i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMonth(int i)
/*     */   {
/* 340 */     this.month = i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecond(int i)
/*     */   {
/* 348 */     this.second = i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setYear(int i)
/*     */   {
/* 356 */     this.year = i;
/*     */   }
/*     */   
/*     */   public Calendar toCalendar() {
/* 360 */     check();
/* 361 */     Calendar cale = Calendar.getInstance();
/* 362 */     cale.set(this.year, this.month - 1, this.day, this.hour, this.minute);
/* 363 */     return cale;
/*     */   }
/*     */   
/*     */   public Date toDate() {
/* 367 */     String s = toString();
/* 368 */     return getDateFromString(s);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String formatDateToString(Date date, String format)
/*     */   {
/* 383 */     SimpleDateFormat sdf = new SimpleDateFormat(format);
/* 384 */     String sd = sdf.format(date);
/* 385 */     return sd;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Date parseStringToDate(String date, String format)
/*     */   {
/* 400 */     SimpleDateFormat sdf = new SimpleDateFormat(format);
/* 401 */     Date d = null;
/*     */     try {
/* 403 */       d = sdf.parse(date);
/*     */     } catch (ParseException e) {
/* 405 */       e.printStackTrace();
/*     */     }
/* 407 */     return d;
/*     */   }
/*     */   
/* 410 */   public String toString() { StringBuffer sb = new StringBuffer(19);
/* 411 */     check();
/* 412 */     sb.append(convert(this.year));
/* 413 */     sb.append("-");
/* 414 */     sb.append(convert(this.month));
/* 415 */     sb.append("-");
/* 416 */     sb.append(convert(this.day));
/* 417 */     sb.append(" ");
/* 418 */     sb.append(convert(this.hour));
/* 419 */     sb.append(":");
/* 420 */     sb.append(convert(this.minute));
/* 421 */     sb.append(":");
/* 422 */     sb.append(convert(this.second));
/* 423 */     return sb.toString();
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/* 427 */     DateTime dt = new DateTime();
/* 428 */     System.out.println(dt.getYear());
/* 429 */     System.out.println(dt.getMonth());
/* 430 */     System.out.println(dt.getDate());
/* 431 */     System.out.println(dt.getDateInt());
/* 432 */     System.out.println(dt.getDateLong());
/* 433 */     System.out.println(dt.getDay());
/* 434 */     System.out.println(dt.getDayOfWeek());
/* 435 */     System.out.println(dt.getFirstDayOfWeek());
/* 436 */     System.out.println(dt.getHour());
/* 437 */     System.out.println(dt.getMinute());
/* 438 */     System.out.println(dt.getMonth());
/* 439 */     System.out.println(dt.getNoDeliCurrentDate());
/* 440 */     System.out.println(dt.getSeasonOfYear());
/* 441 */     System.out.println(dt.getSecond());
/* 442 */     System.out.println(dt.getWeekOfMonth());
/* 443 */     System.out.println(dt.getWeekOfYear());
/* 444 */     System.out.println(getCurrentDateByDate());
/* 445 */     System.out.println(getCurrentDateByString());
/* 446 */     System.out.println(getCurrentDatetimeByString());
/*     */     
/* 448 */     System.out.println("********************");
/* 449 */     System.out.println(dt.addMinutes(30));
/* 450 */     System.out.println(dt);
/*     */   }
/*     */ }

/* Location:           E:\repository\com\wangku\wjf\common\wjf-common\2.1.2-SNAPSHOT\wjf-common-2.1.2-SNAPSHOT.jar
 * Qualified Name:     com.wangku.wjf.common.utils.date.DateTime
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */
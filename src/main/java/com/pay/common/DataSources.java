package com.pay.common;
/**
 * 数据源
 * @Title: DataSources.java 
 * @Description: TODO  
 * @author zhaoxiangqian
 * @Modified zhaoxiangqian      
 * @date 2013-5-29 下午04:57:25   
 * @version V1.0     
*/
public interface DataSources {

	/**
	 * 会员读数据库
	 */
	public static final String READ_MEMBER_DATASOURCE = "readWasDruidMemberDataSource"; 
	/**
	 * 会员写数据库
	 */
	public static final String WRITE_MEMBER_DATASOURCE = "writeWasDruidMemberDataSource";
}

package com.pay.coin.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Copyright 北京网库互联信息技术有限公司 
 * @Title:MemberTradingInfo.java  
 * @Description:交易实体
 * @param 
 * @author：chenwenning 
 * @Modified chenwenning 
 * @date 2015-5-20 下午3:34:58   
 * @version V1.0
 */
public class MemberTradInfo implements Serializable{//ing

	/**
	*  serialVersionUID : 
	*/ 
	public static final long serialVersionUID = 1L;
	public static final int PAY_TYPE_NOCHECK_STATUS=0;//用户未选择支付方式
	public static final int PAY_TYPE_ALIPAY_STATUS=1;//1 去选择支付页面
	public static final int PAY_TYPE_COIN_STATUS=2;//2 库币
	/*@SuppressWarnings("unused")
	private static final int PAY_TYPE_CUP_STATUS=3;//3 银联
	 */	
	public static final int TRADING_COIN_TYPE = 1;// 1 库币商城
	public static final int TRADING_DPT_TYPE = 2;// 2 购买单品通
	public static final int TRADING_400_TYPE = 3;// 2 购买400电话
	public static final int TRADING_ADVERTISE_TYPE = 4;// 4 购买广告
	
	public static final int TRADE_SATTUS_PAY=0;//0 待付款
	public static final int TRADE_SATTUS_COMPLETE=1;// 1 已付款
	public static final int TRADE_SATTUS_CLOES=2;//2 付款失败
	
	private long id;
	
	private String orderNum;//订单号
	
	private String tradNum;//交易号
	
	private long memberId;//会员id
	
	private String productName;//商品名称
	
	private String productUrl;//商品url
	
	private String productDescription;//商品描述
	
	private BigDecimal productMoney;//商品金额
	
	private int payType = 0;// 0:未选择支付方式  1 支付宝  2 库币
	
	private String tradAccount;//交易帐号
	
	private int tradStatus;//交易状态 0 待付款 1 已付款 2 付款失败
	
	private int tradType;//交易类别(请求来源) 1 库币商城  2 购买单品通 3 购买400电话 4 购买广告
	
	private String tradFlag;//交易标志(MD5的加密字符串)
	
	private Date addTime;//添加时间
	
	private Date updateTime;//修改时间

	private Date tradSuccessTime;//交易成功时间
	
	private String notifyUrl;//服务器异步通知页面路径
	
	private String returnUrl;//页面跳转同步通知页面路径
	
	private String ip;//客户端的IP地址

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getTradNum() {
		return tradNum;
	}

	public void setTradNum(String tradNum) {
		this.tradNum = tradNum;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public BigDecimal getProductMoney() {
		return productMoney;
	}

	public void setProductMoney(BigDecimal productMoney) {
		this.productMoney = productMoney;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public String getTradAccount() {
		return tradAccount;
	}

	public void setTradAccount(String tradAccount) {
		this.tradAccount = tradAccount;
	}

	public int getTradStatus() {
		return tradStatus;
	}

	public void setTradStatus(int tradStatus) {
		this.tradStatus = tradStatus;
	}

	public int getTradType() {
		return tradType;
	}

	public void setTradType(int tradType) {
		this.tradType = tradType;
	}

	public String getTradFlag() {
		return tradFlag;
	}

	public void setTradFlag(String tradFlag) {
		this.tradFlag = tradFlag;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getTradSuccessTime() {
		return tradSuccessTime;
	}

	public void setTradSuccessTime(Date tradSuccessTime) {
		this.tradSuccessTime = tradSuccessTime;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	
}

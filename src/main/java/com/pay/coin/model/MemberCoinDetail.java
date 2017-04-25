package com.pay.coin.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Copyright 北京网库互联信息技术有限公司
 * @Description: 库币记录  
 * @author zhaolibin
 * @Modified zhaolibin   
 * @date 2014-5-26 下午6:11:44   
 * @version V1.0
 */
public class MemberCoinDetail implements Serializable {
	
	public static final int Detail_TYPE_RECHARGE= 1;//充值
	public static final int Detail_TYPE_CONSUME= 2;//消费
	public static final int Detail_TYPE_ACTIVITY= 3;//活动
    
	public static final int PAY_ADD= 1;//收入
	public static final int PAY_CONSUME= 2;//支出
	
	public static final int Detail_MODE_ONLINE= 1;//在线充值
	public static final int Detail_MODE_RECHARGE= 2;//客服代充
	public static final int Detail_MODE_FORM= 3;//提单充值
	public static final int Detail_MODE_BUY= 4;//购买服务
	public static final int Detail_MODE_CONSUME= 5;//客服代扣
	public static final int Detail_MODE_ACTIVITY= 6;//活动
	public static final int Detail_MODE_PINGTAI= 7;//平台活动
	
	public static final String MODE_ONLINE= "在线充值";//在线充值
	public static final String MODE_RECHARGE= "客服代充";//客服代充
	public static final String MODE_FORM= "提单充值";//提单充值
	public static final String MODE_BUY= "购买服务";//购买服务
	public static final String MODE_CONSUME= "客服代扣";//客服代扣
	public static final String MODE_ACTIVITY= "活动赠送";//活动赠送
	public static final String MODE_PINGTAI= "平台活动赠送";//平台活动
    
	
    private static final long serialVersionUID = 1L;
    private long id;    //主键
    private long memberId;  //会员id
    private int coinDetailType; //记录方式  充值 消费 活动
    private long coinDetailMode;//方式
    private String modeName;//方式名称
    private BigDecimal coinAmount;//记录金额
    private String detail;//详细
    private BigDecimal coinBalance;//余额
    private BigDecimal lastBalance;//上次用户余额
    private String orderNo;//订单号
    private int balOfPay;//收支状态   1收2支
    private Date addTime;//添加时间
    private String lastOperator;//操作人
    
    public MemberCoinDetail() {
        super();
    }

    public MemberCoinDetail(long id, long memberId, int coinDetailType,
            long coinDetailMode, String modeName, BigDecimal coinAmount,
            String detail, BigDecimal coinBalance, BigDecimal lastBalance,
            String orderNo, int balOfPay) {
        super();
        this.id = id;
        this.memberId = memberId;
        this.coinDetailType = coinDetailType;
        this.coinDetailMode = coinDetailMode;
        this.modeName = modeName;
        this.coinAmount = coinAmount;
        this.detail = detail;
        this.coinBalance = coinBalance;
        this.lastBalance = lastBalance;
        this.orderNo = orderNo;
        this.balOfPay = balOfPay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public int getCoinDetailType() {
        return coinDetailType;
    }

    public void setCoinDetailType(int coinDetailType) {
        this.coinDetailType = coinDetailType;
    }

    public long getCoinDetailMode() {
        return coinDetailMode;
    }

    public void setCoinDetailMode(long coinDetailMode) {
        this.coinDetailMode = coinDetailMode;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public BigDecimal getCoinAmount() {
        return coinAmount;
    }

    public void setCoinAmount(BigDecimal coinAmount) {
        this.coinAmount = coinAmount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getCoinBalance() {
        return coinBalance;
    }

    public void setCoinBalance(BigDecimal coinBalance) {
        this.coinBalance = coinBalance;
    }

    public BigDecimal getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(BigDecimal lastBalance) {
        this.lastBalance = lastBalance;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getBalOfPay() {
        return balOfPay;
    }

    public void setBalOfPay(int balOfPay) {
        this.balOfPay = balOfPay;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

	public String getLastOperator() {
		return lastOperator;
	}

	public void setLastOperator(String lastOperator) {
		this.lastOperator = lastOperator;
	}
	
	public String getDetailModeString(){
		if(coinDetailMode==1){
			return MODE_ONLINE;
		}else if(coinDetailMode==2){
			return MODE_RECHARGE;
		}else if(coinDetailMode==3){
			return MODE_FORM;
		}else if(coinDetailMode==4){
			return MODE_BUY;
		}else if(coinDetailMode==5){
			return MODE_CONSUME;
		}else if(coinDetailMode==6){
			return MODE_ACTIVITY;
		}else if(coinDetailMode==7){
			return MODE_PINGTAI;
		}else{
			return MODE_ONLINE;
		}
	}
}

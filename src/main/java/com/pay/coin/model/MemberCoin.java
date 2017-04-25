package com.pay.coin.model;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @Copyright 北京网库互联信息技术有限公司
 * @Description: 库币余额表
 * @author zhaolibin
 * @Modified zhaolibin   
 * @date 2014-5-26 下午2:39:10   
 * @version V1.0
 */
public class MemberCoin  implements java.io.Serializable  {
    
	private static final long serialVersionUID = 1L;
	
	public static final int STATUS_OPEN= 0;//打开  
	public static final int STATUS_CLOSE= 1;//关闭
	public static final int COIN_PRICE = 7200;//单品通价格
	
	private long memberId;//会员id
	private BigDecimal coinBalance;//余额
	private int status;//状态
	private BigDecimal consumeCoin;//可消费金额
	private BigDecimal freezingCoin;//冻结金额
	private Date addTime;//添加时间
	private Date updateTime;//修改时间
	private String lastOperator;//最后操作者
	private Date operatorTime;//操作时间
	
	public MemberCoin() {
	    super();
    }

    public MemberCoin(long memberId, BigDecimal coinBalance, int status,
            BigDecimal consumeCoin, BigDecimal freezingCoin, Date addTime,
            Date updateTime, String lastOperator, Date operatorTime) {
        super();
        this.memberId = memberId;
        this.coinBalance = coinBalance;
        this.status = status;
        this.consumeCoin = consumeCoin;
        this.freezingCoin = freezingCoin;
        this.addTime = addTime;
        this.updateTime = updateTime;
        this.lastOperator = lastOperator;
        this.operatorTime = operatorTime;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public BigDecimal getCoinBalance() {
        return coinBalance;
    }

    public void setCoinBalance(BigDecimal coinBalance) {
        this.coinBalance = coinBalance;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BigDecimal getConsumeCoin() {
        return consumeCoin;
    }

    public void setConsumeCoin(BigDecimal consumeCoin) {
        this.consumeCoin = consumeCoin;
    }

    public BigDecimal getFreezingCoin() {
        return freezingCoin;
    }

    public void setFreezingCoin(BigDecimal freezingCoin) {
        this.freezingCoin = freezingCoin;
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

    public String getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}

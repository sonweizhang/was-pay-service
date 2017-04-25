package com.pay.coin.model;

import java.util.Date;

/**
 * MemberTransactionLog:{退款记录表} 
 * date: 2015-10-16 上午11:00:49
 * @author LiuJiangTao
 * @version
 */
public class MemberAlipayRefundLog {
	/**退款成功*/
	public static final int REFUND_SUCCESS_TYPE = 1;
	
	private long id;// 计数列
	private String batchno;// 批次号
	private int batchnum;// 退款笔数
	private String detaildata;// 订单信息
	private String reason;// 退款理由
	private String sign;//加密字符串
	private int state;// 退款状态0:带退款  1:失败  2:成功
	private String resultdate;//处理结果
	private String notifyUrl;// 回调地址
	private Date refundTime;// 申请时间
	private Date modifyTime;// 修改时间   时间戳自动更新
	private String operator;// 操作人

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBatchno() {
		return batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public int getBatchnum() {
		return batchnum;
	}

	public void setBatchnum(int batchnum) {
		this.batchnum = batchnum;
	}

	public String getDetaildata() {
		return detaildata;
	}

	public void setDetaildata(String detaildata) {
		this.detaildata = detaildata;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public Date getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getResultdate() {
		return resultdate;
	}

	public void setResultdate(String resultdate) {
		this.resultdate = resultdate;
	}

	public MemberAlipayRefundLog() {

	}

	public MemberAlipayRefundLog(String reason, String notifyUrl, String operator,
			String batchno, String detaildata, int batchnum,Date refundTime,String sign) {
		super();
		this.operator = operator;
		this.reason = reason;
		this.notifyUrl = notifyUrl;
		this.batchno = batchno;
		this.batchnum = batchnum;
		this.detaildata = detaildata;
		this.refundTime = refundTime;
		this.sign = sign;
	}
}

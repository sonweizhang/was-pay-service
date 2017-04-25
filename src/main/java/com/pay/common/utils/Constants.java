package com.pay.common.utils;


/**
 * 
 * Constants:{静态类}
 * date: 2015-5-25 上午10:22:37 
 * @author LiuJiangTao
 * @version
 */
public class Constants {

	/** 正在支付订单 */
	public static final String PAY_KEY = "onPay";
	/** 支付成功回调地址*/
	public static final String ALIPAY_NOTIFY_URL = PropertiesUtil.getKey("alipay.notify.url");
	/** 支付失败回调地址*/
	public static final String ALIPAY_RETURN_URL = PropertiesUtil.getKey("alipay.return.url");
	/** 退款异步回调接口*/
	public static final String REFUND_NOTIFY_URL = PropertiesUtil.getKey("refund.notify.url");
	/** 新支付成功回调地址*/
	public static final String PAY_NOTIFY_URL = PropertiesUtil.getKey("pay.notify.url");
	/** 新支付失败回调地址*/
	public static final String PAY_RETURN_URL = PropertiesUtil.getKey("pay.return.url");
}

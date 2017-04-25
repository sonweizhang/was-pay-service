package com.pay.coin.service;

import org.osgi.framework.ServiceException;

import com.pay.coin.model.MemberAlipayReturn;

public interface IMemberAlipayReturnService {
	/**
	 * 
	  * saveMemberAlipayReturn 
	  * (保存支付宝回执信息)  
	  * @return void
	  * @throws ServiceException 
	  * @author zhaoyuchong 
	  * @since  1.0
	 */
	public boolean saveMemberAlipayReturn(MemberAlipayReturn memberAlipayReturn) throws ServiceException;
	
	
	/**
	 * 
	 * getAlipayReturnByOrderNo:(根据订单号查询支付状态).
	 * @author LiuJiangTao
	 * @param orderNo 订单号
	 * @param tradNo 支付宝交易号
	 * @return
	 */
	public MemberAlipayReturn getAlipayReturnByOrderNo(String orderNo,String tradNo);
}

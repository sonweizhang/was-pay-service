package com.pay.coin.service;

import org.osgi.framework.ServiceException;

import com.pay.coin.model.MemberTradInfo;

public interface IMemberTradInfoService{
	/**
	 * 
	 * save:(添加一条请求记录).
	 * @author LiuJiangTao
	 * @param memberTradInfo
	 * @return
	 */
	public long save(MemberTradInfo memberTradInfo) throws ServiceException;
	
	/**
	 * getTradInfoByOrderNo:(根据原始订单信息获取请求信息).
	 * @author LiuJiangTao
	 * @param orderNo
	 * @return
	 */
	public MemberTradInfo getTradInfoByOrderNo(String orderNo,String tradNo) throws ServiceException;
	
	
	/**
	 * update:(更新指定请求信息).
	 * @author LiuJiangTao
	 * @param memberTradInfo
	 * @return
	 */
	public boolean update(MemberTradInfo memberTradInfo) throws ServiceException;
	
	/**
	 * getTradInfoById:(根据ID查询).
	 * @author LiuJiangTao
	 * @param id
	 * @return
	 * @throws ServiceException
	 */
	public MemberTradInfo getTradInfoById(long id) throws ServiceException;

}

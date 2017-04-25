package com.pay.refund.service;

import org.osgi.framework.ServiceException;

import com.pay.coin.model.MemberAlipayRefundLog;

/**
 * IMemberRefundService:{退款记录操作接口类} 
 * date: 2015-10-16 下午7:23:01
 * @author LiuJiangTao
 * @version
 */
public interface IMemberAlipayRefundLogService {

	/**
	 * save:(添加更新一条记录).
	 * @author LiuJiangTao
	 * @param memberRefundLog
	 * @return true成功 false失败
	 * @throws ServiceException
	 */
	public void save(MemberAlipayRefundLog memberRefundLog) 
			throws ServiceException;

	/**
	 * searchByBatchNo:(根据退款批次号查询).
	 * @author LiuJiangTao
	 * @param batchno 批次号
	 * @return
	 * @throws ServiceException
	 */
	public MemberAlipayRefundLog searchByBatchNo(String batchno)
			throws ServiceException;
	
	/**
	 * update:(更新一条记录).
	 * @author LiuJiangTao
	 * @param memberRefundLog
	 * @throws ServiceException
	 */
	public void update(MemberAlipayRefundLog memberRefundLog)
			throws ServiceException;
}

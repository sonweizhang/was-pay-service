package com.pay.refund.service.impl;

import org.osgi.framework.ServiceException;
import org.springframework.stereotype.Service;

import com.pay.coin.model.MemberAlipayRefundLog;
import com.pay.refund.service.IMemberAlipayRefundLogService;

@Service
public class MemberAlipayRefundLogServiceImpl implements IMemberAlipayRefundLogService {

	public void save(MemberAlipayRefundLog memberRefundLog)
			throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	public MemberAlipayRefundLog searchByBatchNo(String batchno)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(MemberAlipayRefundLog memberRefundLog)
			throws ServiceException {
		// TODO Auto-generated method stub
		
	}
	
}

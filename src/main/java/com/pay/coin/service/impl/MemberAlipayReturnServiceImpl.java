package com.pay.coin.service.impl;

import org.osgi.framework.ServiceException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pay.coin.model.MemberAlipayReturn;
import com.pay.coin.service.IMemberAlipayReturnService;
import com.pay.common.DataSources;


@Service("memberAlipayReturnService")
public class MemberAlipayReturnServiceImpl implements IMemberAlipayReturnService{

	public boolean saveMemberAlipayReturn(MemberAlipayReturn memberAlipayReturn)
			throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	public MemberAlipayReturn getAlipayReturnByOrderNo(String orderNo,
			String tradNo) {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.pay.coin.service.impl;

import org.osgi.framework.ServiceException;
import org.springframework.stereotype.Service;

import com.pay.coin.model.MemberTradInfo;
import com.pay.coin.service.IMemberTradInfoService;

@Service("iMemberTradInfoService")
public class MemberTradInfoServiceImpl implements IMemberTradInfoService {

	public long save(MemberTradInfo memberTradInfo) throws ServiceException {
		// TODO Auto-generated method stub
		return 0;
	}

	public MemberTradInfo getTradInfoByOrderNo(String orderNo, String tradNo)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(MemberTradInfo memberTradInfo)
			throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	public MemberTradInfo getTradInfoById(long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
}

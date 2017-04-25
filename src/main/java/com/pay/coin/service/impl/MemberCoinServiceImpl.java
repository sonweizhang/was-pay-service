package com.pay.coin.service.impl;

import java.math.BigDecimal;

import org.osgi.framework.ServiceException;
import org.springframework.stereotype.Service;

import com.pay.coin.model.MemberAlipayReturn;
import com.pay.coin.model.MemberCoin;
import com.pay.coin.service.IMemberCoinService;

/**
 * @Copyright 北京网库互联信息技术有限公司
 * @Description: 库币余额  
 * @author zhaolibin
 * @Modified zhaolibin   
 * @date 2014-5-26 下午2:28:45   
 * @version V1.0
 */
@Service("memberCoinService")
public class MemberCoinServiceImpl implements IMemberCoinService {

	public MemberCoin getMemberCoinById(long memberId) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateMemberCoin(MemberCoin memberCoin)
			throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveMemberCoin(MemberCoin memberCoin)
			throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	public void recharge(long memberId, BigDecimal amount, String userName,
			String detail, int detailMode, int detailType)
			throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	public void reduceCoin(long memberId, BigDecimal amount, String userName,
			String detail, int detailMode, int detailType)
			throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	public void recharge(long memberId, BigDecimal amount, String userName,
			String detail, String orderNo, MemberAlipayReturn memberAlipayReturn)
			throws ServiceException {
		// TODO Auto-generated method stub
		
	}}

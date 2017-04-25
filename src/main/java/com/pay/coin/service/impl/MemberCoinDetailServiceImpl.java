package com.pay.coin.service.impl;

import java.util.List;
import java.util.Map;

import org.osgi.framework.ServiceException;
import org.springframework.stereotype.Service;

import com.pay.coin.model.MemberCoinDetail;
import com.pay.coin.service.IMemberCoinDetailService;
/**
 * @Copyright 北京网库互联信息技术有限公司
 * @Description: 库币记录  
 * @author zhaolibin
 * @Modified zhaolibin   
 * @date 2014-5-26 下午2:42:28   
 * @version V1.0
 */
@Service("memberCoinDetailService")
public class MemberCoinDetailServiceImpl implements IMemberCoinDetailService {

	public List<Map<String, Object>> getCoinDetailPager(int type, long memberId)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(MemberCoinDetail memberCoinDetail)
			throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	public long getCoinDetailSUMCoin(long memberId) throws ServiceException {
		// TODO Auto-generated method stub
		return 0;
	}}

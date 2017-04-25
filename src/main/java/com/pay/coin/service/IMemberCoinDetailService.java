package com.pay.coin.service;

import java.util.List;
import java.util.Map;

import org.osgi.framework.ServiceException;

import com.pay.coin.model.MemberCoinDetail;

/**
 * @Copyright 库币消费记录
 * @Description: TODO  
 * @author zhaolibin
 * @Modified zhaolibin   
 * @date 2014-5-26 下午2:27:28   
 * @version V1.0
 */
public interface IMemberCoinDetailService {

    /**
     * getCoinDetailPager(查询库币记录) 
     * (这里描述这个方法适用条件 – 可选) 
     * @param type
     * @return
     * @throws ServiceException  
     * @author zhaolibin
     * List<Map<String,Object>> 
     * @param memberId 
     * @exception  
     * @since  1.0
     */
    public List<Map<String, Object>> getCoinDetailPager(int type, long memberId) throws ServiceException;
    
    
	/**
	 *save(保存)
	 * @param memberCoinDetail
	 * @throws ServiceException
	 * @return 
	 * @exception ServiceException
	 * @since v1.0
	 */
	
	public boolean save(MemberCoinDetail memberCoinDetail)throws ServiceException;
	
	
	public long getCoinDetailSUMCoin(long memberId) throws ServiceException;
}

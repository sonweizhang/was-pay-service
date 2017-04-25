package com.pay.coin.service;

import java.math.BigDecimal;

import org.osgi.framework.ServiceException;

import com.pay.coin.model.MemberAlipayReturn;
import com.pay.coin.model.MemberCoin;

/**
 * @Copyright 库币消费记录
 * @Description: TODO  
 * @author zhaolibin
 * @Modified zhaolibin   
 * @date 2014-5-26 下午2:27:28   
 * @version V1.0
 */
public interface IMemberCoinService {

    /**
     * getMemberCoinById(根据会员id查询库币余额) 
     * (这里描述这个方法适用条件 – 可选) 
     * @param memberId
     * @return  
     * @author zhaolibin
     * MemberCoin 
     * @exception  
     * @since  1.0
     */
    public MemberCoin getMemberCoinById(long memberId) throws ServiceException;
    
    public boolean updateMemberCoin(MemberCoin memberCoin) throws ServiceException ;
    
    public boolean saveMemberCoin(MemberCoin memberCoin) throws ServiceException;
    /**
     * 
      * recharge 
      * (库币充值) 
      * @return void
      * @throws   
      * @author zhaoyuchong 
      * @since  1.0
     */
    public void recharge(long memberId,BigDecimal amount,String userName,String detail,int detailMode,int detailType) throws ServiceException;
    
    /**
     * 
      * reduceCoin 
      * (扣库币) 
      * @return void
      * @throws   
      * @author liuyali 
      * @since  1.0
     */
    public void reduceCoin(long memberId,BigDecimal amount,String userName,String detail,int detailMode,int detailType) throws ServiceException;
    
    /**
     * 
      * recharge 
      * (库币充值) 
      * @return void
      * @throws   
      * @author zhaoyuchong 
      * @since  1.0
     */
    public void recharge(long memberId,BigDecimal amount,String userName,String detail,String orderNo,MemberAlipayReturn memberAlipayReturn) throws ServiceException;
	
   
}

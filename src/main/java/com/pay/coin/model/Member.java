package com.pay.coin.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Transient;

/**
 * @Title: Member.java 
 * @Description: 会员账号登录表
 * @author qiyasen  
 * @Modified qiyasen      
 * @date 2013-5-8 下午2:13:46   
 * @version V1.0
 */
public class Member implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static final String MEMBER_ID="memberId";//会员ID
	public static final String ACCOUNT="account";//帐户名称
	public static final String PASSWORD="password";//密码
	public static final String ADD_TIME="addTime";//添加时间
	public static final String MODIFY_TIME="modifyTime";//修改时间
	public static final String REG_IP="regIp"; //注册IP
	public static final String LOGIN_IP="loginIp"; //登录Ip
	public static final String TOTAL_LOGIN="totalLogin";  //登录次数
	public static final String STATUS="status";  //状态
	public static final String EMAIL="email";//邮箱
	public static final String MOBILE="mobile";//手机
	public static final String CHANNELS_TYPE="channelsType";//开通类型
	public static final String BIND_TYPE="bindType";//绑定类型
	public static final String SITE_ID="siteId";//网点ID
	public static final String POSITION="position";//联系人职位
	public static final String DEPARTMENT="department";//联系人部门
	public static final String POSTCODE="postCode";//邮编
	public static final String TELEPHONE="telephone";//电话
	public static final String QQ="qq";//QQ号
	public static final String SEX="sex";//性别
	public static final String HEAD_PORTRAIT="headPortrait";//个人头像
	public static final String LINKMAN="linkMan";//联系人姓名
	public static final String NICK_NAME="nickname";//昵称
	public static final String AREA_CODE="areaCode";//地区编码
	public static final String ADDRESS="address";//详细地址
	public static final String PARENT_ID="parentId";//主账户Id
	public static final String ROLE_ID="roleId";//角色
	public static final String MEMBER_TYPE="memberType";//会员类型
	public static final String ACCREDIT_STATUS="accreditStatus";//授权状态1; //未授权 2; //授权成功 3; //申请授权 4; //拒绝授权 
	public static final String FROM_UI="fromUi";//会员注册来源
	public static final String EXPIR_TIME="expirTime";//过期时间
	public static final String VALID_DAY="validDay";//会员过期天数
	public static final String BEGIN_TIME="beginTime";//会员开始时间
	public static final String FAX="fax";//传真

	private long memberId; //用户ID

    private String account; //帐户名称

    private String password; //密码

    private Date addTime;//添加时间

    private Date modifyTime; //修改时间

    private String regIp; //注册IP

    private String loginIp; //登录Ip

    private int totalLogin; //登录次数

    private int status; //状态
    
    private String email;//邮箱
    
    private String mobile;//手机
    
    private int channelsType;//开通类型
    
    private int bindType;//绑定类型
    
    private int siteId;//网点ID

    private String position;//联系人职位

    private String department;//联系人部门

    private String postCode;//邮编

    private String telephone;//电话

    private String qq;//QQ号

    private String sex;//性别

    private String headPortrait;//个人头像

    private String linkMan;//联系人姓名

    private String nickname;//昵称
    
    private String areaCode;//区位地址

    private String address;//详细地址

    private long parentId;//主账户Id

    private int roleId;//角色

    private String memberType;//会员类型

    private int accreditStatus;//授权状态

    private String fromUi;//会员注册来源1代表平台2代表老数据平台4代表手机8代表数据抓取16代表代码导入32代表江西网接口64后台管理员注册128自动化营销

    private Date expirTime;//过期时间

    private int validDay;//会员过期天数
    
    private Date beginTime;//会员开始时间
    
    private String fax;//传号
    @Transient
    private String accountRandom;//账号会员id
    
    public Member() {
		super();
	}




	public Member(long memberId, String account, String password, Date addTime,
			Date modifyTime, String regIp, String loginIp, int totalLogin,
			int status, String email, String mobile, int channelsType,
			int bindType, int siteId, String position, String department,
			String postCode, String telephone, String qq, String sex,
			String headPortrait, String linkMan, String nickname,
			String areaCode, String address, long parentId, int roleId,
			String memberType, int accreditStatus, String fromUi,
			Date expirTime, int validDay, Date beginTime, String fax,
			String accountRandom) {
		super();
		this.memberId = memberId;
		this.account = account;
		this.password = password;
		this.addTime = addTime;
		this.modifyTime = modifyTime;
		this.regIp = regIp;
		this.loginIp = loginIp;
		this.totalLogin = totalLogin;
		this.status = status;
		this.email = email;
		this.mobile = mobile;
		this.channelsType = channelsType;
		this.bindType = bindType;
		this.siteId = siteId;
		this.position = position;
		this.department = department;
		this.postCode = postCode;
		this.telephone = telephone;
		this.qq = qq;
		this.sex = sex;
		this.headPortrait = headPortrait;
		this.linkMan = linkMan;
		this.nickname = nickname;
		this.areaCode = areaCode;
		this.address = address;
		this.parentId = parentId;
		this.roleId = roleId;
		this.memberType = memberType;
		this.accreditStatus = accreditStatus;
		this.fromUi = fromUi;
		this.expirTime = expirTime;
		this.validDay = validDay;
		this.beginTime = beginTime;
		this.fax = fax;
		this.accountRandom = accountRandom;
	}



    public long getMemberId() {
		return memberId;
	}



	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}



	public String getAccount() {
		return account;
	}



	public void setAccount(String account) {
		this.account = account;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Date getAddTime() {
		return addTime;
	}



	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}



	public Date getModifyTime() {
		return modifyTime;
	}



	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}



	public String getRegIp() {
		return regIp;
	}



	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}



	public String getLoginIp() {
		return loginIp;
	}



	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}



	public int getTotalLogin() {
		return totalLogin;
	}



	public void setTotalLogin(int totalLogin) {
		this.totalLogin = totalLogin;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public int getChannelsType() {
		return channelsType;
	}



	public void setChannelsType(int channelsType) {
		this.channelsType = channelsType;
	}



	public int getBindType() {
		return bindType;
	}



	public void setBindType(int bindType) {
		this.bindType = bindType;
	}



	public int getSiteId() {
		return siteId;
	}



	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getPostCode() {
		return postCode;
	}



	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getQq() {
		return qq;
	}



	public void setQq(String qq) {
		this.qq = qq;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getHeadPortrait() {
		return headPortrait;
	}



	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}



	public String getLinkMan() {
		return linkMan;
	}



	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}



	public String getNickname() {
		return nickname;
	}



	public void setNickname(String nickname) {
		this.nickname = nickname;
	}



	public String getAreaCode() {
		return areaCode;
	}


	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}


	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public long getParentId() {
		return parentId;
	}



	public void setParentId(long parentId) {
		this.parentId = parentId;
	}



	public int getRoleId() {
		return roleId;
	}



	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}



	public String getMemberType() {
		return memberType;
	}



	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}



	public int getAccreditStatus() {
		return accreditStatus;
	}



	public void setAccreditStatus(int accreditStatus) {
		this.accreditStatus = accreditStatus;
	}



	public String getFromUi() {
		return fromUi;
	}



	public void setFromUi(String fromUi) {
		this.fromUi = fromUi;
	}



	public Date getExpirTime() {
		return expirTime;
	}



	public void setExpirTime(Date expirTime) {
		this.expirTime = expirTime;
	}



	public int getValidDay() {
		return validDay;
	}



	public void setValidDay(int validDay) {
		this.validDay = validDay;
	}


	public Date getBeginTime() {
		return beginTime;
	}



	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}







	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getAccountRandom() {
		return accountRandom;
	}




	public void setAccountRandom(String accountRandom) {
		this.accountRandom = accountRandom;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (memberId ^ (memberId >>> 32));
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (memberId != other.memberId)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", account=" + account
				+ ", password=" + password + ", addTime=" + addTime
				+ ", modifyTime=" + modifyTime + ", regIp=" + regIp
				+ ", loginIp=" + loginIp + ", totalLogin=" + totalLogin
				+ ", status=" + status + ", email=" + email + ", mobile="
				+ mobile + ", channelsType=" + channelsType + ", bindType="
				+ bindType + ", siteId=" + siteId + ", position=" + position
				+ ", department=" + department + ", postCode=" + postCode
				+ ", telephone=" + telephone + ", qq=" + qq + ", sex=" + sex
				+ ", headPortrait=" + headPortrait + ", linkMan=" + linkMan
				+ ", nickname=" + nickname + ", areaCode=" + areaCode
				+ ", address=" + address + ", parentId=" + parentId
				+ ", roleId=" + roleId + ", memberType=" + memberType
				+ ", accreditStatus=" + accreditStatus + ", fromUi=" + fromUi
				+ ", expirTime=" + expirTime + ", validDay=" + validDay
				+ ", fax=" + fax 
				+ "]";
	}

    
    
}
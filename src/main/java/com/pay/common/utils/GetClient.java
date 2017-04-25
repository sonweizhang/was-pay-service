package com.pay.common.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * GetClient:{获取客户端请求信息} 
 * date: 2015-8-23 下午09:58:57
 * @author LiuJiangTao
 * @version
 */
public class GetClient {

	/**
	 * IpAddr:(获取客户端IP信息).
	 * @author LiuJiangTao
	 * @param request
	 * @return
	 */
	public static String IpAddr(HttpServletRequest request) {
		String ipAddress = null;
		ipAddress = request.getHeader("x-forwarded-for");
		if (ipAddress == null || ipAddress.length() == 0
				|| "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0
				|| "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0
				|| "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getRemoteAddr();
		}

		if (ipAddress != null && ipAddress.length() > 15) {
			if (ipAddress.indexOf(",") > 0) {
				ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
			}
		}
		return ipAddress;
	}
}
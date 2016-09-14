package com.forsrc.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.wicket.request.cycle.RequestCycle;

/**
 * 
 * @ClassName: WicketUtils
 * @Description: Wicket Utils
 * 
 */
public class WicketUtils {

	/**
	 * 
	 * @Title: getHttpServletRequest
	 * @Description: get Http ServletRequest
	 * @return HttpServletRequest
	 * @throws
	 */
	public static HttpServletRequest getHttpServletRequest() {
		RequestCycle requestCycle = RequestCycle.get();
		HttpServletRequest request = (HttpServletRequest) requestCycle
				.getRequest().getContainerRequest();
		return request;
	}

}

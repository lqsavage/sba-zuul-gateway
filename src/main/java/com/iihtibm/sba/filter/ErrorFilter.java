package com.iihtibm.sba.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @author savagelee
 */
public class ErrorFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "error";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		return null;
	}

}
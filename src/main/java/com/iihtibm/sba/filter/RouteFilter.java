package com.iihtibm.sba.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @author savagelee
 */
public class RouteFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "route";
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
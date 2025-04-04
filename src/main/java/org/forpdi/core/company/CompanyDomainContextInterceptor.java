package org.forpdi.core.company;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CompanyDomainContextInterceptor implements HandlerInterceptor {

	@Autowired
	private CompanyBS companyBS;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		CompanyDomain domain = companyBS.currentDomain();
		CompanyDomainContext.setCurrentDomain(domain);
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		CompanyDomainContext.setCurrentDomain(null);
	}
}

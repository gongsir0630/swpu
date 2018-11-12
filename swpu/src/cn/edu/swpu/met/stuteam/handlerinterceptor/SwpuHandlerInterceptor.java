package cn.edu.swpu.met.stuteam.handlerinterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.swpu.met.stuteam.pojo.Manage;


/**
 * @ClassName: HandlerInterceptor
 * @Description: TODO
 * @author: 朱军
 * @date:2018年1月3日 下午2:03:39
 * @version :1.0
 * 
 */
public class SwpuHandlerInterceptor implements HandlerInterceptor {
	// controller执行后且视图返回后调用此方法
	// 这里可得到执行controller时的异常信息
	// 这里可记录操作日志

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	// controller执行后但未返回视图前调用此方法
	// 这里可在返回用户前对模型数据进行加工处理，比如这里加入公用信息以便页面显示

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}
	// Controller执行前调用此方法
	// 返回true表示继续执行，返回false中止执行
	// 这里可以加入登录校验、权限拦截等

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();
		if (!uri.contains("login") && !uri.contains("check")) {//不是登陆的请求
			Manage user = (Manage) request.getSession().getAttribute("user");
			if (user != null) {
				return true;
			}else {
				response.getWriter().write("<script>alert('登陆超时或者未登陆')</script>");
				response.sendRedirect(request.getContextPath() + "/login.jsp");
				return false;
			}
		}else {
			return true;
		}
	}

}

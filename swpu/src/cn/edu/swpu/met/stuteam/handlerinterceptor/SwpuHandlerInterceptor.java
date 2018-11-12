package cn.edu.swpu.met.stuteam.handlerinterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.swpu.met.stuteam.pojo.Manage;


/**
 * @ClassName: HandlerInterceptor
 * @Description: TODO
 * @author: ���
 * @date:2018��1��3�� ����2:03:39
 * @version :1.0
 * 
 */
public class SwpuHandlerInterceptor implements HandlerInterceptor {
	// controllerִ�к�����ͼ���غ���ô˷���
	// ����ɵõ�ִ��controllerʱ���쳣��Ϣ
	// ����ɼ�¼������־

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	// controllerִ�к�δ������ͼǰ���ô˷���
	// ������ڷ����û�ǰ��ģ�����ݽ��мӹ���������������빫����Ϣ�Ա�ҳ����ʾ

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}
	// Controllerִ��ǰ���ô˷���
	// ����true��ʾ����ִ�У�����false��ִֹ��
	// ������Լ����¼У�顢Ȩ�����ص�

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();
		if (!uri.contains("login") && !uri.contains("check")) {//���ǵ�½������
			Manage user = (Manage) request.getSession().getAttribute("user");
			if (user != null) {
				return true;
			}else {
				response.getWriter().write("<script>alert('��½��ʱ����δ��½')</script>");
				response.sendRedirect(request.getContextPath() + "/login.jsp");
				return false;
			}
		}else {
			return true;
		}
	}

}

package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class FIrstInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("第一个拦截器，在调用下一个拦截器，或action前");
		String result = arg0.invoke();//调用下一个拦截器
		System.out.println("第一个拦截器，在调用下一个拦截器，或action后");
		
		return result;
	}

}

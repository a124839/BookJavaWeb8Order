package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SecondInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("��2�����������ڵ�����һ������������actionǰ");
		String result = arg0.invoke();//������һ��������
		System.out.println("��2�����������ڵ�����һ������������action��");		
		return result;
	}
	
}

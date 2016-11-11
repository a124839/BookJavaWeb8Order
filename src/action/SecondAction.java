package action;

import com.opensymphony.xwork2.ActionSupport;

public class SecondAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("SecondAction");
		return SUCCESS;
	}
	
	
}

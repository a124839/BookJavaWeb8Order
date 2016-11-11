package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author k570
 * À¹½ØÆ÷µÄÖ´ÐÐË³Ðò
 *
 */
public class FirstAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("FirstAction");
		return SUCCESS;
	}
	
	
}

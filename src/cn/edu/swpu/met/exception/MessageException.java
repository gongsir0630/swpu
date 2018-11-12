package cn.edu.swpu.met.exception;
/**
 * @ClassName: MessageException
 * @Description: �Զ����쳣�࣬�����׳���֪�쳣
 * @author: ���
 * @date:2017��12��27�� ����9:07:19
 * @version :1.0
 * 
 */
public class MessageException extends Exception {

	/** 
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public MessageException() {
		super();
	}
	public MessageException(String message) {
		super();
		this.message = message;
	}
	

}

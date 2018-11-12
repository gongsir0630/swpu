package cn.edu.swpu.met.exception;
/**
 * @ClassName: MessageException
 * @Description: 自定义异常类，用于抛出已知异常
 * @author: 朱军
 * @date:2017年12月27日 上午9:07:19
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

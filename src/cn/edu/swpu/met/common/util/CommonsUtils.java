package cn.edu.swpu.met.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName: CommonsUtils
 * @Description: TODO
 * @author: 朱军
 * @date:2017年11月22日 下午8:29:19
 * @version :1.0
 * 
 */
public class CommonsUtils {
	/**
	 * 
	 * @Title: getUserId 
	 * @Description: 获取一个随机的ID
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	public static String  getUserId(){
		return UUID.randomUUID().toString();
	}
	
	public static int getRandom(int start, int end) {
		return (int) (start - 1 +(end - start + 2) * Math.random());	
	}
	public static void main(String[] args) {
		int[] a = getIntRandom(0, 100, 100);
		for (int i = 0; i < a.length; i++) {
			System.out.print("-"+a[i]);
		}
	}
	
	
	/**
	 * 生成一定数目、一定区间的不重复整形随机数
	 * @Title: getRandom 
	 * @Description: TODO 
	 * @param @param start 数据的开端
	 * @param @param end 数据的末尾
	 * @param @param num 需要的数据的数目
	 * @param @return   
	 * @return int[]    
	 * @throws
	 */
	public static int[] getIntRandom(int start, int end, int num){
		int[] number = new int[num];
		int longNum = number.length;
		if ((end-start) < num ) {
			try {
				throw new Exception("数据总数的值大于数据区间所有数的总和");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
  loop1:for (int i = 0; i < longNum; i++) {
			//获取该区间的一个随机数
			int a = (int) (start - 1 +(end - start + 2) * Math.random());
			if (i == 0) {
				number[i] = a;
			}else {
				for (int j = 0; j < i; j++) {
					if (number[j] == a) {//如果数组中已有改值
						i --;
						continue loop1;
					}else {
						number[i] = a;
					}
				}
			}
		}
		return number;
	}
	
	
	/**
	 * 生成订单号 时间字符串+userID
	 * @Title: getTimeString 
	 * @Description: TODO 
	 * @param @param userId
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	public static String getTimeString(int userId ){
		Date date = new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss"); 
		String dateString = df.format(date)+userId;
		return dateString;
	}
	
	
	/**
	 * 生成签到表的编号
	 * @Title: getSignTableId 
	 * @Description: 生成格式为yyyymmdd0+班次序号
	 * @param @param banci
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	public static String getSignTableId(Date createDate, String banci){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd"); 
		String dateString = df.format(createDate)+0+banci;
		return dateString;
	}
	
	/**
	 * 计算两个时间相差的时间   输出格式为天小时分钟
	 * @Title: getDateDifferent 
	 * @Description: TODO 
	 * @param @param startDate
	 * @param @param endDate
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	public static String  getDateDifferent(Date startDate, Date endDate) {
		//获得两个时间相差的秒数
		Long interval = (startDate.getTime() - endDate.getTime())/1000;
		//相差天数
		int days = (int) (interval/(60 * 60 * 24)); 
		//相差小时
		int hours = (int) ((interval%(60 * 60 * 24))/( 60 * 60));  
		//相差分钟
		int minutes = (int) (((interval%(60 * 60 * 24))%( 60 * 60))/60);  
		String diff = days+"天"+hours+"小时"+minutes+"分钟";
		return diff;
		
	}
}

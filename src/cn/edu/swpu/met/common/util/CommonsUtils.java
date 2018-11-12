package cn.edu.swpu.met.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName: CommonsUtils
 * @Description: TODO
 * @author: ���
 * @date:2017��11��22�� ����8:29:19
 * @version :1.0
 * 
 */
public class CommonsUtils {
	/**
	 * 
	 * @Title: getUserId 
	 * @Description: ��ȡһ�������ID
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
	 * ����һ����Ŀ��һ������Ĳ��ظ����������
	 * @Title: getRandom 
	 * @Description: TODO 
	 * @param @param start ���ݵĿ���
	 * @param @param end ���ݵ�ĩβ
	 * @param @param num ��Ҫ�����ݵ���Ŀ
	 * @param @return   
	 * @return int[]    
	 * @throws
	 */
	public static int[] getIntRandom(int start, int end, int num){
		int[] number = new int[num];
		int longNum = number.length;
		if ((end-start) < num ) {
			try {
				throw new Exception("����������ֵ���������������������ܺ�");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
  loop1:for (int i = 0; i < longNum; i++) {
			//��ȡ�������һ�������
			int a = (int) (start - 1 +(end - start + 2) * Math.random());
			if (i == 0) {
				number[i] = a;
			}else {
				for (int j = 0; j < i; j++) {
					if (number[j] == a) {//������������и�ֵ
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
	 * ���ɶ����� ʱ���ַ���+userID
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
	 * ����ǩ����ı��
	 * @Title: getSignTableId 
	 * @Description: ���ɸ�ʽΪyyyymmdd0+������
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
	 * ��������ʱ������ʱ��   �����ʽΪ��Сʱ����
	 * @Title: getDateDifferent 
	 * @Description: TODO 
	 * @param @param startDate
	 * @param @param endDate
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	public static String  getDateDifferent(Date startDate, Date endDate) {
		//�������ʱ����������
		Long interval = (startDate.getTime() - endDate.getTime())/1000;
		//�������
		int days = (int) (interval/(60 * 60 * 24)); 
		//���Сʱ
		int hours = (int) ((interval%(60 * 60 * 24))/( 60 * 60));  
		//������
		int minutes = (int) (((interval%(60 * 60 * 24))%( 60 * 60))/60);  
		String diff = days+"��"+hours+"Сʱ"+minutes+"����";
		return diff;
		
	}
}

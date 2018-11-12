package cn.edu.swpu.met.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

/**
 * ת���������͵����� ����string����ת��ΪDate����
 * S : ҳ�洫�ݹ���������
 * T �� ת���������
 * @author lx
 *
 */
public class DateTimeConveter implements Converter<String, Date>{

	public Date convert(String source) {
		// TODO Auto-generated method stub
		try {
			if(null != source){
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
				
				return df.parse(source);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}


}

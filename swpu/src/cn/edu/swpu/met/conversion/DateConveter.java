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
public class DateConveter implements Converter<String, Date>{

	public Date convert(String source) {
		// TODO Auto-generated method stub
		try {
			if(null != source){//2016:11-05 11_43-50
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				return df.parse(source);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}

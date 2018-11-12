package cn.edu.swpu.met.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

/**
 * 转换日期类型的数据 ，将string类型转换为Date类型
 * S : 页面传递过来的类型
 * T ： 转换后的类型
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

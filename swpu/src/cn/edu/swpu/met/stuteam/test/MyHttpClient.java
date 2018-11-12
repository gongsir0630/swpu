package cn.edu.swpu.met.stuteam.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @ClassName: MyHttpClient
 * @Description: TODO
 * @author: 朱军
 * @date:2018年1月5日 上午9:36:20
 * @version :1.0
 * 
 */
public class MyHttpClient {
	public static void main(String[] args) throws ParseException, IOException {
		String targetUrl = "http://172.16.253.72";
	     
	    // 1.建立HttpClient对象
	    CloseableHttpClient client = HttpClients.createDefault();
	 
	    // 2.建立Get请求
	    HttpGet get = new HttpGet(targetUrl);
	 
	    // 3.发送Get请求
	    CloseableHttpResponse res = client.execute(get);
	 
	    // 4.处理请求结果
	    if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
	      HttpEntity entity = res.getEntity();
	      ContentType contentType = ContentType.getOrDefault(entity);
	      Charset charset = contentType.getCharset();
	      String mimeType = contentType.getMimeType();
	      // 获取字节数组
	      byte[] content = EntityUtils.toByteArray(entity);
	      if (charset == null) {
	        // 默认编码转成字符串
	        String temp = new String(content);
	        String regEx = "(?=<meta).*?(?<=charset=[\\'|\\\"]?)([[a-z]|[A-Z]|[0-9]|-]*)";
	        Pattern p = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
	        Matcher m = p.matcher(temp);
	        if (m.find() && m.groupCount() == 1) {
	          charset = Charset.forName(m.group(1));
	        } else {
	          charset = Charset.forName("UTF-8");
	        }
	      }
	      System.out.println(new String(content, charset));
	}

	
	/*以下是模拟登陆程序*/
    /*输入你的用户名及密码 ，这里输入*/
/*   private static String userName = "13032820513";  
   private static String password = "543216";  
   // Don't change the following URL  
   private static String renRenLoginURL = "http://www.renren.com/PLogin.do";  
   // The HttpClient is used in one session  
   private HttpResponse response;  
   private DefaultHttpClient httpclient = new DefaultHttpClient();  
   输入抓包的参数，即传递的参数
   private boolean login() {  
       HttpPost httpost = new HttpPost(renRenLoginURL);  
       // All the parameters post to the web site
      //建立一个NameValuePair数组，用于存储欲传送的参数，添加相关参数，见上图中的参数
       List<NameValuePair> nvps = new ArrayList<NameValuePair>(); 
       nvps.add(new BasicNameValuePair("domain", "renren.com"));  
       nvps.add(new BasicNameValuePair("isplogin", "true"));  
       nvps.add(new BasicNameValuePair("submit", "登录"));  
       nvps.add(new BasicNameValuePair("email", userName));  
       nvps.add(new BasicNameValuePair("password", password));  
       try {  
           登陆成功，获取返回的数据，即html文件
           httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));  
           response = httpclient.execute(httpost);  
       } catch (Exception e) {  
           e.printStackTrace();  
           return false;  
       } finally {  
           httpost.abort();  
       }  
       return true;  
   }  

   private String getRedirectLocation() { 
       获取响应的头 url 
       Header locationHeader = response.getFirstHeader("Location");  
       if (locationHeader == null) {  
           return null;  
       }  
       return locationHeader.getValue();  
   }  
    获取html文本 
   private String getText(String redirectLocation) {  
       HttpGet httpget = new HttpGet(redirectLocation);  
       // Create a response handler  
       ResponseHandler<String> responseHandler = new BasicResponseHandler();  
       String responseBody = "";  
       try {  
           responseBody = httpclient.execute(httpget, responseHandler);  
       } catch (Exception e) {  
           e.printStackTrace();  
           responseBody = null;  
       } finally {  
           httpget.abort();  
           httpclient.getConnectionManager().shutdown();  
       }  
       return responseBody;  
   }  

   public void printText() {
       如果注册成功了，输入相应后的html   
       if (login()) {  
           String redirectLocation = getRedirectLocation();  
           if (redirectLocation != null) {  
               System.out.println(getText(redirectLocation));  
           }  
       }  
   }  
   main方法
   public static void main(String[] args) {  
       MyHttpClient renRen = new MyHttpClient();  
       renRen.printText();  
   }  */
	}
}
   
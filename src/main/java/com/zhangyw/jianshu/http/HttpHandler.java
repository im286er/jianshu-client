package com.zhangyw.jianshu.http;

import java.io.IOException;
import java.net.URI;
import java.util.Date;
import java.util.Map;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.protocol.Protocol;

public class HttpHandler {
	public static GetMethod doGet(String url){
		Protocol https = new Protocol("https", new HTTPSSecureProtocolSocketFactory(), 443);
		Protocol.registerProtocol("https", https);
		GetMethod get = new GetMethod(url);
		addChromHeader(get);
		HttpClient client = new HttpClient();
		try {
			client.executeMethod(get);
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return get;
	}
	public static PostMethod doPost(String url,Map params){
		Protocol https = new Protocol("https", new HTTPSSecureProtocolSocketFactory(), 443);
		Protocol.registerProtocol("https", https);
		PostMethod post = new PostMethod(url);
		post.setParams(getParams(params));
		HttpClient client = new HttpClient();
		try {
			client.executeMethod(post);
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return post;
	}
	
	private static void addChromHeader(HttpMethod method){
		method.addRequestHeader("Accept", "application/json, text/javascript, */*; q=0.01");
		method.addRequestHeader("Accept-Language", "zh-CN,zh;q=0.8");
		method.addRequestHeader("Connection", "keep-alive");
		method.addRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36");
		method.addRequestHeader("X-Requested-With", "XMLHttpRequest");
		method.addRequestHeader("Date", new Date().toString());
	}
	private static HttpMethodParams getParams(Map map){
		HttpMethodParams params = new HttpMethodParams();
		for(Object key:map.keySet()){
			params.setParameter(key.toString(), map.get(key).toString());
		}
		return params;
	}
}

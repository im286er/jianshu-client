package com.zhangyw.jianshu.http;

import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.httpclient.methods.GetMethod;

public class HttpTest {
	public static void main(String[] args) throws IOException {
		GetMethod get = HttpHandler.doGet("http://www.jianshu.com/search/do?q=%E6%84%88%E5%A7%91%E5%A8%98&page=1&type=users");
		System.out.println(Arrays.toString(get.getRequestHeaders()));
		System.out.println(get.getStatusCode());
		System.out.println(get.getResponseBodyAsString());
	}
}

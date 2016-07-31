package com.zhangyw.jianshu.http;

import java.io.IOException;
import java.util.Arrays;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.methods.GetMethod;

import com.zhangyw.superhttp.http.Http;

public class HttpTest {
	public static void main(String[] args) throws IOException {
		GetMethod get = Http.getIS().get("http://www.jianshu.com/search/do?q=%E6%84%88%E5%A7%91%E5%A8%98&page=1&type=users",Http.CLIENT_TYPE_BOWSER);
		String result = get.getResponseBodyAsString();
		JSONObject json = JSONObject.fromObject(result);
		System.out.println(json.getJSONArray("entries"));
	}
}

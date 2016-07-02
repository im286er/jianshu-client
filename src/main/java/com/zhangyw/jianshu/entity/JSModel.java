package com.zhangyw.jianshu.entity;

public class JSModel {
	private JSHead jsHead;
	private JSEntity jsEntity;
	public JSModel(){
		
	}
	public JSModel(JSHead jsHead, JSEntity jsEntity) {
		super();
		this.jsHead = jsHead;
		this.jsEntity = jsEntity;
	}
	public JSHead getJsHead() {
		return jsHead;
	}
	public void setJsHead(JSHead jsHead) {
		this.jsHead = jsHead;
	}
	public JSEntity getJsEntity() {
		return jsEntity;
	}
	public void setJsEntity(JSEntity jsEntity) {
		this.jsEntity = jsEntity;
	}
	@Override
	public String toString() {
		return "JSModel [jsHead=" + jsHead + ", jsEntity=" + jsEntity + "]";
	}
}

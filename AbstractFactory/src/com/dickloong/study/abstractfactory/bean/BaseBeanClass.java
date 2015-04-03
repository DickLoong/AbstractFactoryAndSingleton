package com.dickloong.study.abstractfactory.bean;

public abstract class BaseBeanClass {
	private String classParameter="This instance extends from BassBeanClass";
	protected String instanceParameter="This is an instance of "+this.getClass().toString();
	public String method(){
		System.out.println(this.classParameter);
		return "This is an instance of "+this.getClass().toString();
	}
	
	public String subMethod(){
		this.instanceParameter="This is an instance of "+this.getClass().toString();
		return this.instanceParameter;
	}
}

package com.dickloong.study.abstractfactory.bean;

public class BeanTwo extends BaseBeanClass {


	@Override
	public String subMethod(){
		this.instanceParameter="This is an instance of "+this.getClass().toString();
		return this.instanceParameter;
	}
}

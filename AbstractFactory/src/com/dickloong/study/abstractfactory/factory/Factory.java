package com.dickloong.study.abstractfactory.factory;

import com.dickloong.study.abstractfactory.bean.BaseBeanClass;

public class Factory implements IAbstractFactory {
	private BaseBeanClass beans;
	@Override
	public BaseBeanClass product(String name,int modecode) {
		// TODO Auto-generated method stub
		try{
			ClassLoader cls=Thread.currentThread().getContextClassLoader();
			Class targetClass=cls.loadClass(name);
			return (BaseBeanClass)targetClass.newInstance();
		}
		catch(Exception ex){
			ex.getStackTrace();
		}
		return null;
	}
	@Override
	public boolean disregister(String name) {
		// TODO Auto-generated method stub
		return false;
	}


}

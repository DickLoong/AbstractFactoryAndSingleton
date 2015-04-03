package com.dickloong.study.abstractfactory.factory;

public interface IAbstractFactory {
	public Object product(String name,int modecode);
	public boolean disregister(String name);
}

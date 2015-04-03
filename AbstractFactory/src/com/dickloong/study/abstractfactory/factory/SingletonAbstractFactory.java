package com.dickloong.study.abstractfactory.factory;

public abstract class SingletonAbstractFactory {
	private static String factoryType;
	private static class FactoryHolder{
		private static IAbstractFactory singletonFactory;
			static{
				ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
				try{
					Class factoryClass=classLoader.loadClass(factoryType);
					singletonFactory=(IAbstractFactory)factoryClass.newInstance();
					
				}
				catch(Exception ex){
					ex.getStackTrace();
				}
		}
	}
	
	private SingletonAbstractFactory(){
		;
	}
	
	
	public static IAbstractFactory getFactory(String factoryType){
		SingletonAbstractFactory.factoryType=factoryType;
		return FactoryHolder.singletonFactory;
	}

	
}

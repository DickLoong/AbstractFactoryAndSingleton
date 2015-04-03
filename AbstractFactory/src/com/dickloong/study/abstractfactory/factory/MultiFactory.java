package com.dickloong.study.abstractfactory.factory;

import java.util.Hashtable;
import java.util.Map;

public class MultiFactory implements IAbstractFactory {

	Map classMap = new Hashtable<String, Object>();
	ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

	@Override
	public Object product(String name, int modecode) {
		// TODO Auto-generated method stub
		switch (modecode) {
		case 0: {
			if (classMap.containsKey(name))
				return classMap.get(name);
			else {
				try {
					Class cls = classLoader.loadClass(name);
					classMap.put(name, cls.newInstance());
					return classMap.get(name);
				} catch (Exception ex) {
					ex.getStackTrace();
				}
			}
		}
			return null;
		case 1: {
			try {
				Class cls = classLoader.loadClass(name);
				return cls.newInstance();
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		}
		}
		return null;
	}

	@Override
	public boolean disregister(String name) {
		// TODO Auto-generated method stub
		if (this.classMap.containsKey(name)) {
			this.classMap.remove(name);
			return true;
		} else {
			return false;
		}
	}

}

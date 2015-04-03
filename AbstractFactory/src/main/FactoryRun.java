package main;

import com.dickloong.study.abstractfactory.bean.BaseBeanClass;
import com.dickloong.study.abstractfactory.factory.IAbstractFactory;
import com.dickloong.study.abstractfactory.factory.MultiFactory;

public class FactoryRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IAbstractFactory factory=new MultiFactory();
		BaseBeanClass one=(BaseBeanClass) factory.product("com.dickloong.study.abstractfactory.bean.BeanOne",1);
		BaseBeanClass two=(BaseBeanClass)factory.product("com.dickloong.study.abstractfactory.bean.BeanTwo",1);
		System.out.println(one.method()+"\n"+two.method()+"\n");
		System.out.println(one.subMethod()+"\n"+two.subMethod()+"\n");
		BaseBeanClass three=(BaseBeanClass) factory.product("com.dickloong.study.abstractfactory.bean.BeanOne",0);
		BaseBeanClass four=(BaseBeanClass) factory.product("com.dickloong.study.abstractfactory.bean.BeanOne",0);
		System.out.println(three.method()+"\n"+four.method()+"\n");
		System.out.println(three.subMethod()+"\n"+four.subMethod()+"\n");
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
		System.out.println(four.hashCode());
	}

}

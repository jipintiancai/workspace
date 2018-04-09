

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import annocation.A;

public class TestCase {

	@Test
	public void test1(){
		
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("ioc.xml");
		
		A a = aac.getBean("a1", A.class);
		a.executeA();
		
	}
	
	@Test
	public void test2(){
		
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("ioc.xml");
		
//		A a = aac.getBean("a2", A.class);
		C c = aac.getBean("c2",C.class);
		System.out.println(c);
		
	}
	
	@Test
	public void test3(){
		
		//读取配置文件内容
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("config.properties");
		System.out.println(aac.getBean("configBean"));
	}
	
	@Test
	public void test4(){
		
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("ioc.xml");
		CopyOfC cc = aac.getBean("Cc",CopyOfC.class);
		System.out.println(cc);
	}
	
	@Test
	public void test5(){
		
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("annocation.xml");
		A a = aac.getBean("a",A.class) ;
		
		aac.close();
		System.out.println(a);
	}
}

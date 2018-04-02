package first;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {

	public static void main(String[] args) {

		//启动spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获得对象
		Student st = ac.getBean("stu1", Student.class);
		System.out.println(st);
		Date date1 = ac.getBean("date1", Date.class);
		System.out.println("Date: " + date1); 
		Calendar cal = ac.getBean("cal1", Calendar.class);
		System.out.println(cal);
		Date date2 = ac.getBean("date2", Date.class);
		System.out.println(date2);
		
		//启动spring容器
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获得对象
		Student stu1 = aac.getBean("stu2",Student.class);
		Student	stu2 = aac.getBean("stu2",Student.class);
		System.out.println("stu1==stu2:" + (stu1==stu2)); //判断是否为单实例
		
		CopyOfStudent cps = aac.getBean("cstu1",CopyOfStudent.class);
		aac.destroy();
	}

	@Test
	public void test1(){
		
		//启动spring容器
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获得对象
		Student stu1 = aac.getBean("stu2",Student.class);
		Student	stu2 = aac.getBean("stu2",Student.class);
		System.out.println("stu1==stu2:" + (stu1==stu2)); //判断是否为单实例
		
		CopyOfStudent cps = aac.getBean("cstu1",CopyOfStudent.class);
		aac.close();
	}
}

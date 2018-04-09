package mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import entity.Emp;

public class TestCase {

	private SqlSession session;
	@Before
	public void init(){
		
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(TestCase.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		session = ssf.openSession();
	}
	@Test
	public void test1(){
		
		Emp emp = new Emp();
		emp.setAge(11L);
		emp.setName("mexi");
		session.insert("test.save", emp);
		session.commit();
		session.close();
	}
	
	/**
	 * 
	 */
	@Test
	public void test2(){
		
		List<Emp> emplist = session.selectList("test.findAll");
		System.out.println(emplist);
		session.close();
	}
	
	@Test
	public void test3(){
		
		Emp emp = session.selectOne("test.findById", 11);
		
		emp.setAge(emp.getAge() + 11L);
		session.update("test.update", emp);
		session.commit();
		session.close();
	}
	
	@Test
	public void test4(){
		
		session.delete("test.delete", 11);
		session.commit();
		session.close();
	}
	
	@Test
	public void test5(){
		
		Map data = session.selectOne("test.findById2", 11);
		System.out.println(data);
		session.close();
	}
}

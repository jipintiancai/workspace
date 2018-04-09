package mybatis;

import java.util.List;
import java.util.Map;

import mapper.EmpDao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import entity.Emp;
import entity.Emp2;

public class TestCase2 {

	private SqlSession session;
	@Before
	public void init(){
		
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(TestCase2.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		session = ssf.openSession();
	}
	
	@Test
	public void test(){
		
		/*
		 * getMapper方法返回一个符合Mapper映射器（EmpDao）要求的对象
		 */
		EmpDao dao = session.getMapper(EmpDao.class);
		Emp emp = new Emp();
		emp.setAge(11L);
		emp.setName("sfds");
		
		dao.save(emp);
		session.commit();
		session.close();
	}
	
	@Test
	public void test2(){
		
		EmpDao dao = session.getMapper(EmpDao.class);
		List<Emp> empList = dao.findAll();
		System.out.println(empList);
		
		session.close();
	}
	
	@Test
	public void test3(){
		
		EmpDao dao = session.getMapper(EmpDao.class);
		Map data = dao.findById2(11);
		System.out.println(data);
		session.close();
	}
	
	@Test
	public void test4(){
		
		EmpDao dao = session.getMapper(EmpDao.class);
		Emp2 emp2 = dao.findById3(23);
		System.out.println(emp2);
		session.close();
	}
}

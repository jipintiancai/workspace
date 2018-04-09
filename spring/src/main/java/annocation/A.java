package annocation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy(true)
public class A {

//	@Autowired
//	@Qualifier("bb")
	private BB bb;//可以无set方法 由反射实现
	
	@Value("娃哈哈")
	private String name;
	private Long age;
	
	/**
	 * @param age the age to set
	 */
	@Value("22")
	public void setAge(Long age) {
		this.age = age;
	}

	/**
	 * @param bb the bb to set
	 */
	@Autowired
	public void setBb(@Qualifier("bb")BB bb) {
		System.out.println("setBb()");
		this.bb = bb;
	}
	
	@Resource(name = "bb")
	public void setBbByResource(BB bb){
		System.out.println("setBbByResource()");
		this.bb=bb;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "A [bb=" + bb + ", name=" + name + ", age=" + age + "]";
	}

	public A(){
		System.out.println("A()");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init()");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy()");
	}
	
	
}

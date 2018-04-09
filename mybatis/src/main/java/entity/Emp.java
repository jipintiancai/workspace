package entity;

public class Emp {
	
	private String name;
	private Long age;
	private Integer id;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Long getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Long age) {
		this.age = age;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
}

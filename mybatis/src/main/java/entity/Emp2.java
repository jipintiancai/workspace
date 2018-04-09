package entity;

public class Emp2 {
	
	private String empName;
	private Long empAge;
	private Integer id;
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empAge
	 */
	public Long getEmpAge() {
		return empAge;
	}
	/**
	 * @param empAge the empAge to set
	 */
	public void setEmpAge(Long empAge) {
		this.empAge = empAge;
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
		return "Emp2 [empName=" + empName + ", empAge=" + empAge + ", id=" + id
				+ "]";
	}
	
	
}

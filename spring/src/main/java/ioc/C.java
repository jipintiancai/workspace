package ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class C {

	private String name;
	private int age;
	private List<String> interest;
	private Set<String> interests;
	private Map<String,Double> scores;
	private Properties db;
	
	public C() {
		System.out.println("C()");
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(List<String> interest) {
		this.interest = interest;
	}

	/**
	 * @param interests the interests to set
	 */
	public void setInterests(Set<String> interests) {
		this.interests = interests;
	}

	/**
	 * @param scores the scores to set
	 */
	public void setScores(Map<String, Double> scores) {
		this.scores = scores;
	}

	/**
	 * @param db the db to set
	 */
	public void setDb(Properties db) {
		this.db = db;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the interest
	 */
	public List<String> getInterest() {
		return interest;
	}

	/**
	 * @return the interests
	 */
	public Set<String> getInterests() {
		return interests;
	}

	/**
	 * @return the scores
	 */
	public Map<String, Double> getScores() {
		return scores;
	}

	/**
	 * @return the db
	 */
	public Properties getDb() {
		return db;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "C [name=" + name + ", age=" + age + ", interest=" + interest
				+ ", interests=" + interests + ", scores=" + scores + ", db="
				+ db + "]";
	}
	
	
	
}

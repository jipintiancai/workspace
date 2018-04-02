package ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CopyOfC {

	private String name;
	private int age;
	private String interest;
	private String interests;
	private Double scores;
	private Double score;
	private Properties db;
	private String passWord;

	public CopyOfC() {
		System.out.println("C()");
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(Double score) {
		this.score = score;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param interest
	 *            the interest to set
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}

	/**
	 * @param interests
	 *            the interests to set
	 */
	public void setInterests(String interests) {
		this.interests = interests;
	}

	/**
	 * @param scores
	 *            the scores to set
	 */
	public void setScores(Double scores) {
		this.scores = scores;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @param db
	 *            the db to set
	 */
	public void setDb(Properties db) {
		this.db = db;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CopyOfC [name=" + name + ", age=" + age + ", interest="
				+ interest + ", interests=" + interests + ", scores=" + scores
				+ ", score=" + score + ", db=" + db + "]";
	}

}

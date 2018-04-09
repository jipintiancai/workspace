package mapper;

import java.util.List;
import java.util.Map;

import entity.Emp;
import entity.Emp2;

public interface EmpDao {

	public void save(Emp emp);
	public List<Emp> findAll();
	public Map findById2(Integer id);
	public Emp2 findById3(Integer id);
}

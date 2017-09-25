package semanticanalysis.service;
import semanticanalysis.domain.repository.User;


public interface IUserService {
	public User getUserById(int userId); 
	public int deleteByPrimaryKey(int id);
}

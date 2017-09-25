package semanticanalysis.dao;
import semanticanalysis.domain.repository.User;

public interface IUserDao {
	 int deleteByPrimaryKey(Integer id);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);
}

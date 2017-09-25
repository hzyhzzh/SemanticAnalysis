package semanticanalysis.service.impl;
import javax.annotation.Resource;  

import org.springframework.stereotype.Service;  
import semanticanalysis.dao.IUserDao;
import semanticanalysis.domain.repository.User;
import semanticanalysis.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService{
	@Resource  
    private IUserDao userDao;  
	
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
    public int deleteByPrimaryKey(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.deleteByPrimaryKey(userId);  
    } 
    
}

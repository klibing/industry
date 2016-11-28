package shj.industry.service.bean;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import shj.industry.IDao.UserMapper;
import shj.industry.model.User;
import shj.industry.service.IUserService;

@Service("userService")
public class UserServiceBean implements IUserService {

	@Resource(name="userMapper")
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Integer id) {
		return userMapper.findUserById(id);
	}

}

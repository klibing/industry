package shj.industry.service;

import shj.industry.model.User;

public interface IUserService {
	/**
	 * 根据主键获取用户信息
	 * @param id
	 * @return
	 */
	public User getUserById(Integer id);
}

package com.cn.ctsi.respository;

import org.springframework.data.repository.CrudRepository;

import com.cn.ctsi.domain.User;
import com.sun.xml.internal.bind.v2.model.core.ID;

public interface UserRespository extends CrudRepository<User, ID>{

//	void someCustomMethod(User user);
	
}

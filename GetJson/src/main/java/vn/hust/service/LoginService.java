package vn.hust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.model.User;
import vn.hust.repository.UserRepository;
@Service
public class LoginService {
	@Autowired
	private UserRepository repository;
	
	public boolean checkLogin(User user) {
		return repository.checkLogin(user);
	}

}

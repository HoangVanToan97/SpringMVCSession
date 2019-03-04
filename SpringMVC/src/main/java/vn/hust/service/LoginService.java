package vn.hust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.model.User;
import vn.hust.repository.UserRepository;

@Service
public class LoginService {
	@Autowired
	private UserRepository userRepository;

	public boolean checkLogin(User user) {
		return userRepository.checkLogin(user);
	}

}

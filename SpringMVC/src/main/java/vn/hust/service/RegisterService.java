package vn.hust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.model.User;
import vn.hust.repository.UserRepository;

@Service
public class RegisterService {
	@Autowired
	private UserRepository userRepository;

	public boolean checkRegister(User user) {
		if(user.getPassword().contains(user.getRePassword())) {
			if(userRepository.checkUser(user)) {
				return false;
			}else {
				if(userRepository.addUser(user)) {
					return true;
				}
			}
		}
		return false;

	}
}

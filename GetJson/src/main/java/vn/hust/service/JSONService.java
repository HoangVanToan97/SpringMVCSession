package vn.hust.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.model.User;
import vn.hust.repository.UserRepository;
@Service
public class JSONService {
	@Autowired
	private UserRepository repository;
	
	public ArrayList<User> outputList(){
		return repository.outputList();
	}

}

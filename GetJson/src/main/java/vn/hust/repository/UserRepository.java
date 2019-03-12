package vn.hust.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import vn.hust.common.SqlQuery;
import vn.hust.database.ConnectDatabase;
import vn.hust.model.User;
@Repository
public class UserRepository {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	public ArrayList<User> outputList(){
		ArrayList<User> list = new ArrayList<User>();
		connection = ConnectDatabase.getConnection();
		try {
			preparedStatement = connection.prepareStatement(SqlQuery.OUTPUT_DATA);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				list.add(new User(resultSet.getString(1), resultSet.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally {
			ConnectDatabase.closeConnection(connection);
		}
		return list;
	}
	
	public boolean checkLogin(User user){
		connection = ConnectDatabase.getConnection();
		try {
			preparedStatement = connection.prepareStatement(SqlQuery.CHECK_LOGIN);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				if(resultSet.getString(1) != null) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally {
			ConnectDatabase.closeConnection(connection);
		}
		return false;
	}

}

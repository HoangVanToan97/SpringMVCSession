package vn.hust.common;

public class SqlQuery {
	public static final String CHECK_LOGIN = "select * from user where username = ? and password = ? ";
	public static final String CHECK_USER = "select * from user where username = ?";
	public static final String ADD_USER = "insert into `user`(`username`, `password`)values(?,?)";
	public static final String OUTPUT_LIST = "select * from user";

}

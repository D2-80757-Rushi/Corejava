package com.Rushi.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable{
	private Connection con;
	private PreparedStatement findAll;
	private PreparedStatement deleteByID;
	private PreparedStatement updateByID;
	private PreparedStatement addNew;
	
	public UserDao() {
		con=DbUtil.getConnection();
		try {
		addNew=con.prepareStatement("INSERT into users values(default,?,?,?,?,?,?,?)");
		findAll=con.prepareStatement("SELECT * from users");
		deleteByID=con.prepareStatement("DELETE from users where id=?");
		updateByID=con.prepareStatement("UPDATE users SET first_name=?,last_name=?,email=?,password=?,dob=?,status=?,role=? where id=?");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public int addNew(User u)
	{
		//INSERT into users values(default,1,2,3,4,5,6,7)
		int count=0;
		try {
			addNew.setString(1, u.getFirst_name());
			addNew.setString(2, u.getLast_name());
			addNew.setString(3, u.getEmail());
			addNew.setString(4, u.getPassword());
			
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");//new SimpleDateFormat 
	        java.util.Date uDate=sdf.parse(u.getDob());				//String to utilDate
	        java.sql.Date sDate=new java.sql.Date(uDate.getTime());	//utilDate to sqlDate
	        
	        addNew.setDate(5,sDate);
	        addNew.setInt(6,u.getStatus());
	        addNew.setString(7, u.getRole());
	        count=addNew.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	public List<User> findAllUsers()
	{
		List <User> list=new ArrayList<User>();
		try(ResultSet rs=findAll.executeQuery())
		{
			while(rs.next())
			{
				int id=rs.getInt("id");
				String first_name=rs.getString("first_name");
				String last_name=rs.getString("last_name");
				String email=rs.getString("email");
				String password=rs.getString("password");
				String dob=rs.getDate("dob").toString();
				int status=rs.getInt("status");
				String role=rs.getString("role");
				list.add(new User(id,first_name,last_name,email,password,dob,status,role));
			}
			return list;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	public int deleteById(int id)
	{
		int count=0;
		try{
			deleteByID.setInt(1, id);
			count=deleteByID.executeUpdate();
		}
			catch(Exception e) {
				e.printStackTrace();
		}
		return count;
	}
	public int updateByID(User u)
	{
		int count=0;
		try {
			updateByID.setString(1, u.getFirst_name());
			updateByID.setString(2, u.getLast_name());
			updateByID.setString(3, u.getEmail());
			updateByID.setString(4, u.getPassword());
			
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");//new SimpleDateFormat 
	        java.util.Date uDate=sdf.parse(u.getDob());				//String to utilDate
	        java.sql.Date sDate=new java.sql.Date(uDate.getTime());	//utilDate to sqlDate
	        
	        updateByID.setDate(5,sDate);
	        updateByID.setInt(6,u.getStatus());
	        updateByID.setString(7, u.getRole());
	        updateByID.setInt(8, u.getId());
	        count=updateByID.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public void close() throws Exception {
		if(addNew!=null)
			addNew.close();
		if(findAll!=null)
			findAll.close();
		if(deleteByID!=null)
			deleteByID.close();
		if(updateByID!=null)
			updateByID.close();
		if(con!=null)
			con.close();
	}

}

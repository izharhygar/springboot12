package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;


@Service
public class userService {
	
	private User[] users = new User[4];
	{
		users[0] = new User("1","abc","dfdfd");
		users[1] = new User("2","dfg","sdffd");
		users[2] = new User("3","dsf","dfsdf");
		users[3] = new User("4","hhjjj","sdsdf");
		}
		

	public User[] getUsers() {
		return users;
	}
	public void addUser(User user)
	{
		
	}
	public User getOneUser(String id)
	{   
		
		for (User user : users)
		{     String Id = user.getId();
		System.out.print(Id);
		     if( Id.contentEquals(id) )
		    {       
			        return user;
		    }
		 
		 }
		return null;
		
	}

	public void setUsers(User[] users) {
		this.users = users;
	}
	
	

}

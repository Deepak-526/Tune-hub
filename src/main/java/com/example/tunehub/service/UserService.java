package com.example.tunehub.service;

import com.example.tunehub.entites.Users;

public interface UserService {

	public String addUser(Users user);

	public boolean emailExists(String email);


	public boolean validateUser(String email, String password);

	public String getRole(String email);

	public Users getUser(String email);

	public void updateUser(Users user);

	

}

package com.ecom.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ecom.model.UserDtls;

public interface UserService {
	
	public UserDtls saveUser(UserDtls user);

	public Boolean existsEmail(String email);
	
	public UserDtls getUserByEmail(String email);
	
	public List<UserDtls> getUsers(String role);

	public Boolean updateAccountStatus(Integer id, Boolean status);

	public void updateUserResetToken(String email, String resetToken);
	
	public UserDtls getUserByToken(String token);

	public UserDtls updateUser(UserDtls user);

	public UserDtls updateUserProfile(UserDtls user, MultipartFile img);


	public UserDtls saveAdmin(UserDtls user);



	
	

}

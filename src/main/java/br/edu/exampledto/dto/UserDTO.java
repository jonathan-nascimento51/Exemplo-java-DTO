package br.edu.exampledto.dto;

import br.edu.exampledto.entity.User;
import lombok.Getter;

@Getter
public class UserDTO {
	
	private String name;
	private String email;
	private String password;
	
	public User transformsToObject(){
	    return new User(name, email, password);
	}

}

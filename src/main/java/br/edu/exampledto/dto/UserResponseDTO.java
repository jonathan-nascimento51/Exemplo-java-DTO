package br.edu.exampledto.dto;

import br.edu.exampledto.entity.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE) //contrutor privado com todos atributos
public class UserResponseDTO {

	private Long id;
	private String name;
	private String emai;
	private Boolean admin;
	
	
	public static UserResponseDTO transformIntoDTO(User user) {
	    return new UserResponseDTO(user.getId(), user.getName(), user.getEmail(), user.getAdmin());
	}
}

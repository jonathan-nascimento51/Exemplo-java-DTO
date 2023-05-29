package br.edu.exampledto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.exampledto.dto.UserDTO;
import br.edu.exampledto.dto.UserResponseDTO;
import br.edu.exampledto.entity.User;
import br.edu.exampledto.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> salvar(@RequestBody UserDTO userDTO) {
        User user= userService.saveUser(userDTO.transformsToObject());
        return new ResponseEntity<>(UserResponseDTO.transformIntoDTO(user), HttpStatus.CREATED);
    }
}

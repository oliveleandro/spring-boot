package com.br.oliveleandro.resource;

import com.br.oliveleandro.model.Users;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class Logon {
	
	@RequestMapping(value = "/complete-users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Users getNameUsers(){
		var user = new Users();
		user.setName("Leandro");
		user.setSobrenome("Camargo");
		
		return user;
	}

}

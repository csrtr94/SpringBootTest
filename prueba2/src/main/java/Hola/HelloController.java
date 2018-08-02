package Hola;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String saludo() {
		return "Hola Cesar";
	}
	
	@RequestMapping("/saludo")
	public String hola() {
		return "Saludosss";
	}
}

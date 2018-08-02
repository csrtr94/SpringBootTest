package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
	
	
	@RequestMapping("/")
	public String saludo() {
		return "Saludos desde spring boot";
				
	}

}

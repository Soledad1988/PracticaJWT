package pruebasToken.login;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PruebaController {

	@PostMapping
	public String prueba() {
		return "SE LOGRA CONEXIÓN";
	}
}

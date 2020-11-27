package at.candir.springelk;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@SpringBootApplication
public class SpringElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringElkApplication.class, args);
	}


	@SuppressWarnings("unused")
	@GetMapping("/log/{message}")
	public String greeting(@PathVariable(name="message")String message) {
		log.error(String.format("Got a new message! Message=%s", message));
		return "Message Logged";
	}
}

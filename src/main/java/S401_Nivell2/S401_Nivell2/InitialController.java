package S401_Nivell2.S401_Nivell2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {
	
	 @GetMapping("/")
	    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	    return String.format("Hello %s!", name);
	    }
	
	
	

}

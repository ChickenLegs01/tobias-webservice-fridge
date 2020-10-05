package nl.home.freddy.fridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

	private final static Logger LOG = LoggerFactory.getLogger(Controller.class);

	@Autowired
    private SimpleService service;

	@RequestMapping(method=RequestMethod.GET, value="/getText")
	public String getText() {
		return service.processGet();
	}

	@RequestMapping(method=RequestMethod.POST, value="/postText", consumes = MediaType.TEXT_PLAIN_VALUE)
	public String postText(@RequestBody String text) {
		service.processPost(text);
		return "done"; // this return is actually irrelvant.
	}

}

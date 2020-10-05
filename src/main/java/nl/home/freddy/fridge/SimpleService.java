package nl.home.freddy.fridge;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

	String text="";
	public void processPost(String text) {
		// do something with the text. for now stick it in a variable
		this.text = text;
	}

	public String processGet() {
		return this.text;
	}
}

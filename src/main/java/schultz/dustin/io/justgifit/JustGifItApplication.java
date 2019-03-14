package schultz.dustin.io.justgifit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JustGifItApplication {


	//curl -F file=test.mp4 -F start=0 -F end=0 -F speed=1 -F repeat=0 localhost:8080/upload
	public static void main(String[] args) {
		SpringApplication.run(JustGifItApplication.class, args);
	}

}

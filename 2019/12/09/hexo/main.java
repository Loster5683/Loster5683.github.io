@RestController
@EnableAutoConfiguration
public class Main{
	@RequestMapping("/")
	String home() {
		return "Hello World!";
​	}
​	public static void main(String[] args) {
​		SpringApplication.run(Example.class, args);
​	}
}
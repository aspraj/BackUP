
package springannotationcompletesolution;

import org.springframework.stereotype.Component;


/**
 * @author ROI
 *
 * @Component is an annotation that allows Spring to automatically detect our
 * custom beans. In other words, without having to write any explicit code,
 * Spring will: Scan our application for classes annotated with @Component.
 * Instantiate them and inject any specified dependencies into them
 */
@Component
public class AmarilloVisitor implements Visitor {
	private String name;
	private String greeting;
	
	public AmarilloVisitor(){
		System.out.println("created Amarillo visitor");
		this.name = "Joe Bob";
		this.greeting = "Howdy";
	}
	
	public String getGreeting() {
		return greeting;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
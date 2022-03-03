
package springannotationcompletesolution;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class PopupGreeter implements Greeter {
	private Visitor visitor;
	
	public Visitor getVisitor() {
		return visitor;
	}

	/*
	 * The Spring framework enables automatic dependency injection. In other words,
	 * by declaring all the bean dependencies in a Spring configuration file, Spring
	 * container can autowire relationships between collaborating beans. This is
	 * called Spring bean autowiring.
	 */
	@Autowired
	@Qualifier("jerseyVisitor") //This is used for setter based DI
	public void setVisitor(Visitor visitor) {
		System.out.println("visitor set to " + visitor);
		this.visitor = visitor;
	}

	public void greet() {
		JOptionPane.showMessageDialog(null, visitor.getGreeting() + "," + visitor.getName());
	}

}
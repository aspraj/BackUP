
package day7.functinalinterface;

// A functional interface can extends another interface only when it does not have any abstract method
@FunctionalInterface
public interface VisualizeInfo extends VisualInformation {
	public void visualInfo();
}
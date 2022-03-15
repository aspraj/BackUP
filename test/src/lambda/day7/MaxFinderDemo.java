package lambda.day7;

public class MaxFinderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxFinder m = new MaxFinderImpl();
		int result = m.maximum(20, 10);
		System.out.println(result);
		
		MaxFinder ma = (num2,num1)->num1>num2?num1:num2;
		int lambda = ma.maximum(20, 10);
		System.out.println(lambda);
		
	}

}

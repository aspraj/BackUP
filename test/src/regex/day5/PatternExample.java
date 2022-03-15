package regex.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

	public PatternExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Pattern p =Pattern.compile(".a");
//		Matcher m = p.matcher("pa");
//		boolean matches =m.matches();
//		System.out.println(matches);
//		
//		boolean pattern = Pattern.compile(".a").matcher("sp").matches();
//		System.out.println(pattern);
//		
//		boolean pattern1 = Pattern.compile("..a").matcher("spa").matches();
//		System.out.println(pattern1);
//		
//		Pattern pa =Pattern.compile("..a");
//		Matcher ma = pa.matcher("pad");
//		boolean matches1 =ma.matches();
//		System.out.println(matches1);
		
		Pattern pq = Pattern.compile("pq*?");
		Matcher mat = pq.matcher("pq");
		Matcher mp=pq.matcher("p");
		Matcher mpq=pq.matcher("pq");
		Matcher mpqq=pq.matcher("pqq");
		Matcher mpqr=pq.matcher("pqr");
		Matcher mprr=pq.matcher("prr");
		System.out.println(mat.matches());
		System.out.println("*********************");
		System.out.println(mp.matches());
		System.out.println(mpq.matches());
		System.out.println(mpqq.matches());
		System.out.println(mpqr.matches());
		System.out.println(mprr.matches());
		System.out.println("*********************");
		System.out.println(pq.matcher("pigeon").matches());
		
		
		System.out.println(Pattern.compile("[a-zA-Z0-9]").matcher("ASBDS123").matches());
	}
}

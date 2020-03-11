import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("[a-z]+");
		Matcher matcher1 = pattern.matcher("awefs");
		Matcher matcher2 = pattern.matcher("23342");
		Matcher matcher3 = pattern.matcher("sdfasa23423sdfa50023");

		System.out.println("matches(): " + matcher1.matches() + ", " + matcher2.matches() + ", " + matcher3.matches());
		System.out.println("lookingAt(): " + matcher1.lookingAt() + ", " + matcher2.lookingAt() + ", " + matcher3.lookingAt() + "\n");
		matcher3.reset();

		System.out.println( 
			"matcher3.find(): " + matcher3.find() + "\n"
			+ "matcher3.toMatchResult(): " + matcher3.toMatchResult() + "\n"
			+ "matcher3.find(): " + matcher3.find() + "\n"
			+ "matcher3.toMatchResult(): " + matcher3.toMatchResult() + "\n");
		matcher3.reset();

		while(matcher3.find()) {
			System.out.println("matcher3.group(): " + matcher3.group() + "\n"
				+ "matcher3.start(): " + matcher3.start() + "\n"
				+ "matcher3.end(): " + matcher3.end() + "\n");
		}
	}
}

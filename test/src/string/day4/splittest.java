package string.day4;

public class splittest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paragraph = "Hello Everyone, today is very wonderful sunny day. We are learning String concepts. Here we are learning now about paragraph.";
		System.out.println(paragraph.split("[.]"));
//		String[] splittedParagraph = paragraph.split("[.]");
//		String[] splittedParagraph = paragraph.split("[a]");
		String[] splittedParagraph = paragraph.split("[ ]");

		for (String sentence : splittedParagraph) {
			System.out.println(sentence);
		}
	}

}

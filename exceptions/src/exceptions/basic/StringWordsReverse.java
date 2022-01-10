package exceptions.basic;

public class StringWordsReverse {

	public static String reverseStringWords(String s) {
		// String[] stringWords = s.split();
		char[] stringWords = s.toCharArray();
		int noOfWords = stringWords.length;
		System.out.println(noOfWords);
		StringBuilder resultBuffer = new StringBuilder();

//		[0,1,2]
//		H,o,w
		for (int i = noOfWords - 1; i >= 0; i--) {
			resultBuffer.append(stringWords[i]);
			resultBuffer.append("");
		}
		return resultBuffer.toString().trim();
	}

	public static void main(String[] args) {
		System.out.println(reverseStringWords("How"));
	}

}

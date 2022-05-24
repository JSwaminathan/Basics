package programming.ds;

import java.util.Stack;

public class CheckBracketsEnclosing {

	public static boolean checkClosing(String str) {
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == '{' || ch1 == '[' || ch1 == '(') {
				st.push(ch1);
				continue;

			} 
			else if (ch1 == '}' || ch1 == ']' || ch1 == ')') {
				if (st.empty()) {
					return false;
				}
				char ch2 = st.pop();
				switch (ch1) {
				case '}':
					if (ch2 != '{') {
						return false;
					}
					break;
				case ']':
					if (ch2 != '[') {
						return false;
					}
					break;
				case ')':
					if (ch2 != '(') {
						return false;
					}
					break;

				}
			} else {

				throw new RuntimeException("Invalid input" + str);
			}
		}
		if (st.empty()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {
		String val = "[{}]";
		boolean val1 = checkClosing(val);
		if (val1 == true) {
			System.out.println("balanced");
		} else
			System.out.println(" Not balanced");

	}

}

package pack;

import org.apache.oro.text.perl.Perl5Util;

public class Demo03 {

	public static void main(String[] args) {
		String s = "1111\\n2222\\n3333-\\n4444-4444";

		Perl5Util pu = new Perl5Util();

		/**
		 * 1 perl5���������д��/.../֮��
		 */
		String reg = "/\\d{4}(?(?=-)-\\d{4})/";// Ƕ������ java��֧��

		System.out.println(reg);
		if (pu.match(reg, s)) {

			String mathched = pu.group(0);

			int from = pu.beginOffset(0);

			int to = pu.endOffset(0);

			System.out.println(mathched);

		} else {

			System.out.println("didn't match");

		}

	}

}

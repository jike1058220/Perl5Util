package pack;

import org.apache.oro.text.perl.Perl5Util;

public class Demo {

	public static void main(String[] args) {
		String s = "<td><span class='STYLE2'>one</span></td>";

		Perl5Util pu = new Perl5Util();

		/**
		 * 1 perl5���������д��/.../֮��
		 */
		if (pu.match("/<.*?>/", s)) {

			String mathched = pu.group(0);// �������Է���

			int from = pu.beginOffset(0);

			int to = pu.endOffset(0);

			System.out.println(mathched);

		} else {

			System.out.println("didn't match");

		}

	}

}

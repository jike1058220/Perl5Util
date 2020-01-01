package pack;

import org.apache.oro.text.perl.Perl5Util;

public class Demo {

	public static void main(String[] args) {
		String s = "<td><span class='STYLE2'>one</span></td>";

		Perl5Util pu = new Perl5Util();

		/**
		 * 1 perl5的正则必须写在/.../之间
		 */
		if (pu.match("/<.*?>/", s)) {

			String mathched = pu.group(0);// 看来可以分组

			int from = pu.beginOffset(0);

			int to = pu.endOffset(0);

			System.out.println(mathched);

		} else {

			System.out.println("didn't match");

		}

	}

}

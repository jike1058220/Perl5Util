package pack;

import org.apache.oro.text.perl.Perl5Util;

public class Demo04 {

	public static void main(String[] args) {
		String s = "td><span class='STYLE2'>one</span></td>";

		Perl5Util pu = new Perl5Util();

		/**
		 * 1 perl5的正则必须写在/.../之间
		 */
		String reg = "/<([^<>]+)\\s+.*</\\1>/";// \1需要转义为\\1,表示第一个括号中的表达式 可以实现回溯引用 \1也可以是?(1)
		// 技巧:1.技巧,2.分组表达,括号外空格

		System.out.println(reg);
		if (pu.match(reg, s)) {

			String mathched = pu.group(0);// 看来可以分组

			int from = pu.beginOffset(0);

			int to = pu.endOffset(0);

			System.out.println(mathched);

		} else {

			System.out.println("didn't match");

		}

	}

}

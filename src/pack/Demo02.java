package pack;

import org.apache.oro.text.perl.Perl5Util;
import org.apache.oro.text.regex.MatchResult;

public class Demo02 {

	public static void main(String[] args) {
		String s = "<td><span class='STYLE2'>one</span></td>";

		Perl5Util p5u = new Perl5Util();

		int offset = 0;

		// ѭ��ƥ��
		while (p5u.match("/<.*?>/", s)) {

			int from = p5u.beginOffset(0);

			int to = p5u.endOffset(0);

			int len = from - to;// Ŀ�곤��

			System.out.println((offset + from) + "-" + (offset + to - 1));// offset ��Ҫ����
			MatchResult r = p5u.getMatch();

			String m = r.group(0);
			System.out.println(m);
			s = p5u.postMatch();// ���Ѿ�ƥ��Ľ�ȡ����
			//			System.out.println(s);

			offset = offset + to;
		}

	}

}

package pack;

import org.apache.oro.text.perl.Perl5Util;

public class Demo04 {

	public static void main(String[] args) {
		String s = "td><span class='STYLE2'>one</span></td>";

		Perl5Util pu = new Perl5Util();

		/**
		 * 1 perl5���������д��/.../֮��
		 */
		String reg = "/<([^<>]+)\\s+.*</\\1>/";// \1��Ҫת��Ϊ\\1,��ʾ��һ�������еı��ʽ ����ʵ�ֻ������� \1Ҳ������?(1)
		// ����:1.����,2.������,������ո�

		System.out.println(reg);
		if (pu.match(reg, s)) {

			String mathched = pu.group(0);// �������Է���

			int from = pu.beginOffset(0);

			int to = pu.endOffset(0);

			System.out.println(mathched);

		} else {

			System.out.println("didn't match");

		}

	}

}

package study;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	// ���K�\���ɂ��Ă̕׋�
	public static void main(String[] args) {

		String postcode;

		System.out.println("�X�֔ԍ�����͂��Ă�������");

		// �n�C�t�����萳�K�\��
		// Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");

		// �n�C�t���Ȃ����K�\��
		Pattern pattern = Pattern.compile("^[0-9]{7}$");

		Scanner in = new Scanner(System.in);
		postcode = in.next();

		Matcher matcher = pattern.matcher(postcode);
		if (matcher.find()) {
			System.out.println("���K�\���Ƀ}�b�`���܂����B");
		} else {
			System.out.println("�}�b�`���܂���ł����B");

		}

		in.next();
	}
}

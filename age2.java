package study;

import java.time.LocalDateTime;
import java.util.Scanner;

//�G���[������ǉ�
//�����Ƃ��܂�ɉ����ߋ��̓��͂��Ȃ�

public class age2 {

	public static void main(String[] args) {
		int getThisYear = getThisYear();
		int getBirthYear = getBirthYear();
		int calcAge = calcAge(getThisYear, getBirthYear);

		showResult(getThisYear, getBirthYear, calcAge);

	}

	// ���݂̓������\�b�h
	public static int getThisYear() {
		LocalDateTime today = LocalDateTime.now();
		return today.getYear();
	}

	// ���N��������
	public static int getBirthYear() {

		Scanner birth = new Scanner(System.in);
		int born;

		while (true) {
			try {
				System.out.println("���Ȃ��̐��܂ꂽ����̓��͂��Ă�������");
				born = birth.nextInt();
				if (born > getThisYear() || born < 1900) {
					System.out.println("�����1990�N���獡�N�܂ł͈̔͂œ��͂��Ă�������");
					continue;
				} else {
					break;
				}
				//�����ȊO�̃G���[����
			} catch (Exception e) {
				System.out.println("����͐����œ��͂��ĉ�����");
				// ���̓o�b�t�@�̃N���A(�c���Ă��鐮���ȊO�̃f�[�^�̏���)
				birth.next();
			}
		}
		return born;
	}

	// �v�Z���\�b�h
	public static int calcAge(int getThisYear, int getBirthYear) {
		return getThisYear - getBirthYear;
	}

	public static void showResult(int getThisYear, int getBirthYear, int calcAge) {
		System.out.println("���݁A" + getThisYear + "�N�ŁA����" + getBirthYear + "�N���܂�̂��Ȃ��̔N���" + calcAge + "�΂ł�");
	}

}

package study;

import java.time.LocalDateTime;
import java.util.Scanner;

public class age1 {
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
	//�ǋL�R�~�b�g�m�Faaa
	public static int getBirthYear() {

		System.out.println("���Ȃ��̐��܂ꂽ����̓���");
		Scanner birth = new Scanner(System.in);
		return birth.nextInt();
	}

	// �v�Z���\�b�h
	public static int calcAge(int getThisYear, int getBirthYear) {
		return getThisYear - getBirthYear;
	}

	public static void showResult(int getThisYear, int getBirthYear, int calcAge) {
		System.out.println("���݁A" + getThisYear + "�N�ŁA����" + getBirthYear + "�N���܂�̂��Ȃ��̔N���" + calcAge + "�΂ł�");
	}

}

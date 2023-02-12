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

	// 現在の日時メソッド
	public static int getThisYear() {
		LocalDateTime today = LocalDateTime.now();
		return today.getYear();
	}

	// 生年月日入力
	//追記コミット確認aaa
	public static int getBirthYear() {

		System.out.println("あなたの生まれた西暦の入力");
		Scanner birth = new Scanner(System.in);
		return birth.nextInt();
	}

	// 計算メソッド
	public static int calcAge(int getThisYear, int getBirthYear) {
		return getThisYear - getBirthYear;
	}

	public static void showResult(int getThisYear, int getBirthYear, int calcAge) {
		System.out.println("現在、" + getThisYear + "年で、西暦" + getBirthYear + "年生まれのあなたの年齢は" + calcAge + "歳です");
	}

}

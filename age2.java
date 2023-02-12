package study;

import java.time.LocalDateTime;
import java.util.Scanner;

//エラー処理を追加
//未来とあまりに遠い過去の入力を省く

public class age2 {

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
	public static int getBirthYear() {

		Scanner birth = new Scanner(System.in);
		int born;

		while (true) {
			try {
				System.out.println("あなたの生まれた西暦の入力してください");
				born = birth.nextInt();
				if (born > getThisYear() || born < 1900) {
					System.out.println("西暦は1990年から今年までの範囲で入力してください");
					continue;
				} else {
					break;
				}
				//整数以外のエラー処理
			} catch (Exception e) {
				System.out.println("西暦は整数で入力して下さい");
				// 入力バッファのクリア(残っている整数以外のデータの除去)
				birth.next();
			}
		}
		return born;
	}

	// 計算メソッド
	public static int calcAge(int getThisYear, int getBirthYear) {
		return getThisYear - getBirthYear;
	}

	public static void showResult(int getThisYear, int getBirthYear, int calcAge) {
		System.out.println("現在、" + getThisYear + "年で、西暦" + getBirthYear + "年生まれのあなたの年齢は" + calcAge + "歳です");
	}

}

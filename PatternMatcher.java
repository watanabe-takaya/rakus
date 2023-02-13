package study;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	// 正規表現についての勉強
	public static void main(String[] args) {

		String postcode;

		System.out.println("郵便番号を入力してください");

		// ハイフンあり正規表現
		// Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");

		// ハイフンなし正規表現
		Pattern pattern = Pattern.compile("^[0-9]{7}$");

		Scanner in = new Scanner(System.in);
		postcode = in.next();

		Matcher matcher = pattern.matcher(postcode);
		if (matcher.find()) {
			System.out.println("正規表現にマッチしました。");
		} else {
			System.out.println("マッチしませんでした。");

		}

		in.next();
	}
}

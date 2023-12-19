package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("nhap n: ");
		int n4 = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();/* cau a */
		int[] mang = { n1, n2, n3, n4 };
		sapxeptangdan(mang);
		for (int i = 0; i < mang.length; i++) {
			System.out.println(mang[i] + " ");

		}
	}

	static void sapxeptangdan(int[] mang) {
		/* hoac sapxepgiamdan neu nguoc lai */
		int n = mang.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (mang[i] < mang[j]) {
					/* doi dau < thanh > de doi chieu tu be den lon */
					int temp = mang[i];
					mang[i] = mang[j];
					mang[j] = temp;
				}
			}
		}
	}
}

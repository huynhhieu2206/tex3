package basic.dev;

import java.util.Scanner;

public class MainApp3 {
	// A
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Ham dem so luong so nguyen to co trong mang
	static int countPrimes(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (isPrime(num)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhap so phan tu cua mang
		System.out.print("Nhập số lượng phần tử của mảng: ");
		int n = scanner.nextInt();

		int[] array = new int[n];

		// Nhap cac phan tu cua mang
		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.print("Phần tử thứ " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		// dem so nguyen to co trong mang
		int primeCount = countPrimes(array);
		System.out.println("Số lượng số nguyên tố trong mảng là: " + primeCount);
	}

}
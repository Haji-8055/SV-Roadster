package com.xworkz.string.things;

public class StringMethods {

	public static void main(String[] args) {

		int count = 0;
		int digicount = 0;
		String reverse = "";

		String tripleRide = "Triple pop mom Riding is a moom Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";

		/////////////////// 1
		System.out.println("=========Split all by space =========");

		String[] arrayOfWords = tripleRide.split(" ");
		System.out.println("length of array using split by space : " + arrayOfWords.length);

		for (int i = 0; i < arrayOfWords.length; i++) {
			System.out.println(arrayOfWords[i]);
		}

		/////////////////// 2
		System.out.println("=======to find no of 'R' in above sentence=======");

		char[] arrayOfChar = tripleRide.toCharArray();

		for (int i = 0; i < arrayOfChar.length; i++) {

			if (arrayOfChar[i] == 'R' || arrayOfChar[i] == 'r') {
				count++;
			}
		}

		/////////////////// 3
		System.out.println("The frequence of R in given String : " + count);

		System.out.println("==========digits in above string=========");

		for (int i = 0; i < arrayOfChar.length; i++) {

			if (arrayOfChar[i] >= '0' && arrayOfChar[i] <= '9') {

				digicount++;
			}

		}
		System.out.println("The number of digits in given String : " + digicount);

		/////////////////// 4
		System.out.println("==============Split by , ===============");

		String[] arrayOfWords1 = tripleRide.split(",");
		System.out.println("length of array using split by coma : " + arrayOfWords1.length);

		for (int i = 0; i < arrayOfWords1.length; i++) {
			System.out.println(arrayOfWords1[i]);

		}

		/////////////////// 5
		System.out.println("========Converting above string to char []=========");

		char[] arrayOfChar2 = tripleRide.toCharArray();

		for (int i = 0; i < arrayOfChar.length; i++) {

			System.out.print("   " + arrayOfChar2[i]);
		}
		System.out.println("");

		/////////////////// 6(1)
		System.out.println("========reversing above string by each letter=========");

		for (int i = arrayOfChar2.length - 1; i >= 0; i--) {

			System.out.print(arrayOfChar2[i]);
		}
		System.out.println("");

		/////////////////// 6(2)
		System.out.println("========reversing above string by each words =========");
		for (int i = arrayOfWords.length - 1; i >= 0; i--) {

			System.out.print(" " + arrayOfWords[i]);
		}
		System.out.println("");

		/////////////////// 7
		System.out.println("========Converting to upper case =========");

		System.out.println(tripleRide.toUpperCase());

		/////////////////// 8
		System.out.println("========Converting to lower case =========");

		System.out.println(tripleRide.toLowerCase());

		/////////////////// 9
		System.out.println("========Printing all duplicate Characters  =========");

		for (int i = 0; i < arrayOfChar.length; i++) {

			for (int j = 1; j < arrayOfChar.length; j++) {

				if (arrayOfChar[i] == arrayOfChar[j]) {
					if (arrayOfChar[i] == ' ') {
						break;
					}
					System.out.println(arrayOfChar[j]);
				}

			}

		}

		/////////////////// 10
		System.out.println("========checking for palindrome =========");

		for (int i = 0; i < arrayOfWords.length; i++) {

			char[] wordToCharArray = arrayOfWords[i].toCharArray();

			for (int j = wordToCharArray.length - 1; j >= 0; j--) {

				reverse = reverse + wordToCharArray[j];
			}

			if (reverse.equals(arrayOfWords[i]) == true) {

				System.out.println("the word " + arrayOfWords[i] + " is a palindrome ");
			}

			reverse = "";
		}
		System.out.println("there is no other palindrome word expect these");

	}

}

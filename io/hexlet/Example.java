package io.hexlet;

import org.apache.commons.lang3.StringUtils;

public class Example {
	public static void main(String[] args) {
		var capitalizedWord = StringUtils.capitalize("hexlet");
		var reversedWord = StringUtils.reverse(capitalizedWord);
		System.out.println(reversedWord);
	}
}


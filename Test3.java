package com.test;

public class Test3 {

	private enum Side {
		DARK, LIGHT;

		{
			System.out.println("1");
		}

		static {
			System.out.println("2");
		}

		Side() {
			System.out.println("3");
		}
	}

	public static void main(String... args) {
		Side dark = Side.DARK;
		System.out.println("4");
	}
}

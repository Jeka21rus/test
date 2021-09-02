package com.test.initialization;

public class Test0 {
	private static class Class {
		{
			System.out.println("1");
		}

		static {
			System.out.println("2");
		}

		Class() {
			System.out.println("3");
		}
	}

	public static void main(String[] args) {
		new Class();
	}
}

package com.test.initialization;

public class Test3 {
	private enum Side {
		DARK(1), LIGHT(2);
		private int i;

		{
			System.out.println(i);
		}

		static {
			System.out.println(LIGHT.i);
		}

		Side(int i) {
			this.i = i;
			System.out.println(i);
		}
	}

	public static void main(String... args) {
		System.out.println(Side.DARK.i);
	}
}

package com.lxmindustries;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shapes shapes = new Shapes();

		System.out.print("Input a limit to make a triangle => ");
		shapes.triangle(sc.nextInt());
		sc.close();
	}
}

package com.dateandtimeprogram;

import java.time.LocalDate;

public class DateandTimeProgram {
	public static void date() {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		int dd = ld.getDayOfMonth();
		int mm = ld.getMonthValue();
		int yyyy = ld.getYear();
		System.out.println(dd + "--" + mm + "--" + yyyy);

	}

	public static void main(String[] args) {

	}

}

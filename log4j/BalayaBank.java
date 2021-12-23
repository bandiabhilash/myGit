package com.te;

import org.apache.log4j.Logger;
//import java.util.logging.Logger;

public class BalayaBank {

	private String name;
	private double balance;
	private String username;
	private String password;

	private static Logger logger = Logger.getLogger(BalayaBank.class.getName());

	public BalayaBank(String name, double balance, String username, String password) {

		this.name = name;
		this.balance = balance;
		this.username = username;
		this.password = password;
	}

	public void deposite(String username, String password, double amount) {
		logger.info("Enter into try block of deposite");

		if (username.equals(this.username) && password.equals(this.password)) {
			this.balance += amount;
			System.out.println(
					"INR" + amount + "has been deposited.Total balance avaliable in your account is:" + this.balance);

		} else {
			System.out.println("Invalid credentials");
			logger.fatal("invalid credentials");
		}

	}

	public void withdraw(String username, String password, double amount) {

		logger.info("Enter into try block l");
		if (username.equals(this.username) && password.equals(this.password)) {
			if (amount < this.balance) {
				this.balance -= amount;

				System.out.println("Amount withdrawal is" + amount + ".Remaining balance is" + this.balance);
			} else {
				logger.warn("Insufficent balance");
			}
		} else {
			System.out.println("Ivalid credentials");
		}
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}

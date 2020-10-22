package com.method;

public class AccountMain { 
	public static void main(String[] args) {
					AccountMng a = new AccountMng();
				a.insert(2345, "Ankit", 1000);
				a.display();
				a.checkBalance();
				a.deposit(7990);
				a.checkBalance();
				a.withdraw(15000);
				a.checkBalance();
			}
		}
	


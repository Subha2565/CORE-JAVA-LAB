package com.ans3;

public class withdrawing implements Runnable {

	private BankAccount acc = new BankAccount();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		withdrawing a1 = new withdrawing();
		Thread t1 = new Thread(a1, "John");
		Thread t2 = new Thread(a1, "Sujoy");

		t1.start();
		t2.start();

	}

	synchronized void makeWithdrawal(int amt) {
		if (acc.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + "  is going to withdraw " + amt);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + "  has withdrawn " + amt);
		} else {
			System.out.println(Thread.currentThread().getName() + "  is not having enough balance to withdraw " + amt);
			System.out.println("The balance is" + acc.getBalance());
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		makeWithdrawal(400);
		if (acc.getBalance() < 0) {
			System.out.println("Amount is overdrawn");
		}

	}
}

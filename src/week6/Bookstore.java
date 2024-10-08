package week6;


import java.util.Scanner;

public class Bookstore extends  Mananger implements Factory{
	Scanner scan = new Scanner(System.in);
	void mymain() {
		// TODO Auto-generated method stub
		readAll("book4.txt", this);
		printAll();
		search(scan);
	}

	@Override
	public Manageable create(Scanner filein){
		Manageable b = null;
		int type = filein.nextInt();
		switch (type){
			case 1: b = new Book(); break;
			case 2: b = new EBook(); break;
			case 3: b = new ABook(); break;
			case 4: b = new Pen(); break;
			case 5: b = new Tissue(); break;
			default: break;
		}
		return b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bookstore store = new Bookstore();
		store.mymain();
	}
}

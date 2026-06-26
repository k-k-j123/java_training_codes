class Table{ //print
	synchronized void printcal(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
	}
}

class Five extends Thread{ //Multithreading
	Table F;
	Five(Table f){
		F = f;
	}
	public void run() {
		F.printcal(5);
	}
}
class Seven extends Thread{ //Multithreading
	Table S;
	Seven(Table s){
		S = s;
	}
	public void run() {
		S.printcal(7);
	}
}

public class MultiThreading3{
    public static void main(String args[]){
        Table t = new Table();

        Five f = new Five(t);
        Seven s = new Seven(t);

        f.start();
        s.start();

    }
}
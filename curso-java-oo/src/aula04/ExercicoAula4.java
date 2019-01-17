package aula04;

public class ExercicoAula4 {
	
	
	public void tabuada(int x) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " * " + x + " = " + 1*x);
			
		}
	}
	
	public static void main(String[] args) {
		ExercicoAula4 ex = new ExercicoAula4();
		ex.tabuada(5);
	}
}

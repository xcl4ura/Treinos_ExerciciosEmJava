package treino;

public class CalculadoraExercicio {

	static int soma(int x, int y) {
		
		return x + y;
		
	}
	
	static int subt(int x, int y) {
		
		return x - y;
		
	}
		static int multi(int x, int y) {
		
		return x * y;
		
	}
		static int div(int x, int y) {
			
			return x / y;
			
		}

	public static void main(String[]args) {
		
		System.out.println("A soma � igual a: "+soma(5,10));
		
		System.out.println("A subtra��o � igual a: "+subt(10,5));
		
		System.out.println("A multiplica��o � igual a: "+multi(5,10));
		
		System.out.println("A divis�o � igual a: "+div(10,5));
	}
}
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
		
		System.out.println("A soma é igual a: "+soma(5,10));
		
		System.out.println("A subtração é igual a: "+subt(10,5));
		
		System.out.println("A multiplicação é igual a: "+multi(5,10));
		
		System.out.println("A divisão é igual a: "+div(10,5));
	}
}
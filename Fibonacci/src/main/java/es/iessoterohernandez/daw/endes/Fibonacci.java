package es.iessoterohernandez.daw.endes;
public class Fibonacci{
	
	public static void metodo() {
		
		int serie = 100;
		int res = 1;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("El número incial es " +num1+ " y el siguiente " +num2);
		
		for (int n = 1; n<serie; n++)
			System.out.println(res);
			res = num1 + num2;
			num1 = num2;
			num2 = res;
			
	}
}


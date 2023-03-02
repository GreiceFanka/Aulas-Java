package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (acum,n) -> acum + n;
		
		Integer total1 = nums.stream().reduce(soma).get(); //Sem passar valor inicial para o reduce
		System.out.println(total1);
		
		Integer total2 = nums.stream().reduce(100, soma); // Passando valor inicial para o reduce
		System.out.println(total2);
	}
}

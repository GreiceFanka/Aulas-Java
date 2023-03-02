package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lisp ", "Ruby "); //Primeira maneira de criar strems
		
		langs.forEach(print);
		
		String [] maisLangs = {"C ", "PHP ", "Javascript ", "Go "};
		
		Stream.of(maisLangs).forEach(print); //Segunda forma de criar streams
		
		//Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("Kotlin", "Python", "Perl");
		outrasLangs.stream().forEach(print); //Terceira forma de criar strems
		//outrasLangs.parallelStream().forEach(print);//Stream paralela
		
	}
}

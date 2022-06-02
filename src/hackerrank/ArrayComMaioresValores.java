package hackerrank;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author edsonbj
 * Classe onde estamos comparando cada indice do array para encontrar qual o maior valor
 * ao encontrar o maior valor identificamos de qual array pertence o valor
 * e damos um ponto a esse array
 * no final o array que tiver a maior pontuação é quem ganha o jogo
 * 
 * 
 */
public class ArrayComMaioresValores {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>();
		a.add(25);
		a.add(10);
		a.add(1);

		List<Integer> b = new ArrayList<>();
		b.add(10);
		b.add(14);
		b.add(11);

		int[] alice = a.stream().mapToInt(Integer::intValue).toArray();
		int[] bob = b.stream().mapToInt(Integer::intValue).toArray();

		int scoreAlice = 0;
		int scoreBob = 0;
		int[] scoreResult = new int[2];
		
		for(int i = 0; i < 3; i++) {
			if(alice[i] < bob[i]) {
				scoreBob += 1;
				scoreResult[0] = scoreAlice;
				scoreResult[1] = scoreBob;
			} else if(alice[i] > bob[i]) {
				scoreAlice += 1;
				scoreResult[0] = scoreAlice;
				scoreResult[1] = scoreBob;
			} else {
				scoreResult[0] = 0;
				scoreResult[1] = 0;
			}
		}
		

		List<Integer> finalResult = new ArrayList<>(scoreResult.length);

		for (int s : scoreResult) {
			finalResult.add(s);
		}

		for (Integer f : finalResult) {
			System.out.println(f);
		}
	}

}

import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		int[][] numbers = {
			{2,3,4},
			{4,1,4,5},
			{8,3}
		};

		System.out.printf("{%n");
		for(int i=0 ; i<numbers.length ; i++){
			System.out.printf("\t{");
			for(int j=0 ; j<numbers[i].length ; j++){
				System.out.printf("%d,",numbers[i][j]);
			}
			System.out.printf("},%n");
		}
		System.out.printf("}%n");
	}
}

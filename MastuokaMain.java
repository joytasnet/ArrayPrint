import java.util.*;
public class MastuokaMain{
	public static void main(String[] args){
		int[][] data={
			{2,3,4},
			{4,1,4,5},
			{8,3},
		};

		System.out.println("{");
		for(int i=0;i<data.length;i++){
			System.out.print("\t{");
			for(int j=0;j<data[i].length;j++){
				System.out.printf("%d,",data[i][j]);
			}
			System.out.printf("},%n");
		}
		System.out.println("}");
	}
}

import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		int[][] nums={
			{2,3,4},
			{4,1,4,5},
			{8,3},
		};

		System.out.println("{");
		for(int i=0; i<nums.length;i++){
			System.out.print("\t{");
			for(int j=0;j<nums[i].length;j++){
				System.out.print(nums[i][j]);
				System.out.print(",");
			}
			System.out.println("},");
		}
		System.out.println("}");
	}
}


import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		int[][] nums= new int[3][];
		nums[0] = new int[]{2,3,4};
		nums[1] = new int[]{4,1,4,5};
		nums[2] = new int[]{8,3};
		System.out.println("{");
		for(int i=0;i<nums.length;i++){
			System.out.printf("\t{");
			for(int j=0;j<nums[i].length;j++){
				System.out.print(nums[i][j]+",");
			}
			System.out.println("},");
		}
		System.out.println("}");
	}
}

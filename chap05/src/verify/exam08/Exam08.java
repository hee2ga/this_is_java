package verify.exam08;

public class Exam08 {
	public static void main(String[] args) {
		int[][] array= {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int totalStudent=0;
		int totalSum=0;
		for(int i=0;i<array.length;i++) {
			totalStudent+=array[i].length;
			for(int k=0;k<array[i].length;k++) {
				totalSum+=array[i][k];
			}
		}
		double avg=(double)totalSum/totalStudent;
		System.out.println("총합 : "+totalSum);
		System.out.println("평균 : "+avg);
	}
}

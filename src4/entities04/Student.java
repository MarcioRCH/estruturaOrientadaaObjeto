package entities04;

public class Student {
	public String name;
	public double score1;
	public double score2;
	public double score3;
	
	public double finalGrade() {
		return score1 + score2 + score3;
	}
	public double missingPoints() {
		if (finalGrade() < 60.00) {
			return 60.00 - finalGrade();
		}else {
			return finalGrade();
		}
	}
}

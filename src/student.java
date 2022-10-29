public class student {
	private double pointTotal;
	private double assignment;
	private double earnedPoint;
	private double totalWeightedGrade;
	
	public void setPointTotal(double pointTotal) {
		this.pointTotal = pointTotal;
	}

	public void setAssignment(double assignment) {
		this.assignment = assignment;
	}

	public void setEarnedPoint(double earnedPoint) {
		this.earnedPoint = earnedPoint;
	}

	public void setTotalWeightedGrade() {
		this.totalWeightedGrade = (100 * earnedPoint)/pointTotal * (0.01 * assignment);
	}

	public double getPointTotal() {
		return pointTotal;
	}

	public double getAssignment() {
		return assignment;
	}

	public double getEarnedPoint() {
		return earnedPoint;
	}

	public double getTotalWeightedGrade() {
		return totalWeightedGrade;
	}
}



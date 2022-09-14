package com.yash.first;

public class StudentResult {

	int mathMarks;
	int scienceMarks;
	int englishMarks;
	int chemistryMarks;

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public StudentResult(int mathMarks, int scienceMarks, int englishMarks, int chemistryMarks) {
		super();
		this.mathMarks = mathMarks;
		this.scienceMarks = scienceMarks;
		this.englishMarks = englishMarks;
		this.chemistryMarks = chemistryMarks;
	}

	@Override
	public String toString() {
		return "StudentResult [mathMarks=" + mathMarks + ", scienceMarks=" + scienceMarks + ", englishMarks="
				+ englishMarks + ", chemistryMarks=" + chemistryMarks + "]";
	}

}

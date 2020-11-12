package com.jaa.schoolmgmt;

public class Marks {

	private float eng;
	public float getEng() {
		return eng;
	}

	public void setEng(float eng) {
		this.eng = eng;
	}

	private float biology;
	private float physics;
	private float english;
	private float maths;
	private float chemistry;

	public float getBiology() {
		return biology;
	}

	public void setBiology(float biology) {
		this.biology = biology;
	}

	public float getPhysics() {
		return physics;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}

	public float getEnglish() {
		return english;
	}

	public void setEnglish(float english) {
		this.english = english;
	}

	public float getMaths() {
		return maths;
	}

	public void setMaths(float maths) {
		this.maths = maths;
	}

	public float getChemistry() {
		return chemistry;
	}

	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}

	public String toString() {
		String marks = 
				"English: " + english + " :: " + 
				"Maths: " + maths + " :: " + 
				"Physics: " + physics + " :: " + 
				"Chemistry: " + chemistry + " :: " + 
				"Biology: " + biology ;
		return (marks);
 	}
}

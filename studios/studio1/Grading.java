package studio1;

import cse131.ArgsProcessor;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("What is your name?");
		
		int participation = ap.nextInt("Participation?");
		int quiz = ap.nextInt("Quiz Scores?");
		int studio = ap.nextInt("Studio points?");
		int lab = ap.nextInt("Lab points?");
		int extension = ap.nextInt("Extension points?");
		int e1 = ap.nextInt("What did you get on exam 1?");
		int e2 = ap.nextInt("What did you get on exam 2?");
		int e3 = ap.nextInt("What did you get on exam 3?");
		int project = ap.nextInt("Final Project grade?");
		double totalScore = (participation*0.03 
				+ quiz*0.03 
				+ studio*0.07 
				+ lab*0.25 
				+ extension*0.25 
				+ ((e1 + e2 + e3)/3)*0.3 
				+ project*0.07);
		int weightedAverage = (int) totalScore;
		
		double remainder = totalScore % 10;
		boolean plus = remainder > 7;
		boolean minus = remainder < 3;
		
		System.out.println("name: " + name + "\n" 
		+ "Total score: " + totalScore + "\n" 
		+ "Grade for this course: " + weightedAverage + "\n" 
		+ "Final grade has a... " + "\n" 
		+ "Plus: " + plus + "\n" 
		+ "Minus: " + minus);		

	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symbolic_exceuction;

import java.util.*;
/**
 *
 * @author IAlsmadi
 */
public class Student implements Comparable<Student>{
//public class Student {
	private String name;
	private double gpa;
	private boolean graduate;
 public int Compute(int x) {
 return Math.abs(10 / (x + x));
 }
 public int displayLastMsg(int nToPrint, int msgCounter, int lastMsg, ArrayList messageBuffer, int SIZE  ) { //A
 int np = 0; //A
 System.out.println("A");
 if ((msgCounter > 0) && (nToPrint > 0)) { //A
 System.out.println("B");
 for (int j = lastMsg; (( j != 0) && (np < nToPrint)); --j) { //B
 System.out.println("C");
 System.out.println(messageBuffer.get(j)); //C
 System.out.println("D");
 ++np; //D
 System.out.println("E");
 } //E
 System.out.println("F");
 if (np < nToPrint) { //F
 System.out.println("G");
 for (int j = SIZE; ((j != 0) && (np < nToPrint)); --j) { //G
 System.out.println("H");
 System.out.println(messageBuffer.get(j)); //H
 System.out.println("I");
 ++np; //I
 System.out.println("J");
 } //J
 System.out.println("K");
 } //K
 System.out.println("L");
 } //L
 return np;
}
 public Student(){
     
 }
	public Student(String lastName, String gradePoint, String graduate){
		name = lastName;
		
		if(graduate.equalsIgnoreCase("G")){
			this.graduate = true;
                        this.gpa= setGPA(gradePoint, true);
		}
                else{
			this.graduate = false;
                        this.gpa= setGPA(gradePoint, false);
                }
	}

	public double setGPA(String letterGrade, boolean Graduate){
           double gradePoints=0.0;
           if(Graduate){ // start of graduate case
		if( letterGrade == "A+")
      {
          gradePoints = 4.0;
      }
      else if ( letterGrade == "A")
      {
          gradePoints = 3.75;
      }
      else if( letterGrade == "A-")
      {
          gradePoints = 3.67; 
      }
      else if ( letterGrade == "B+")
      {
          gradePoints = 3.33;
      }
      else if( letterGrade == "B")
      {
          gradePoints = 3.0; 
      }
      else if ( letterGrade == "B-")
      {
          gradePoints = 2.67;
      }
      else if( letterGrade == "C+")
      {
          gradePoints = 2.33; 
      }
      else if ( letterGrade == "C")
      {
          gradePoints = 2.0;
      }
      else if( letterGrade == "F")
      {
          gradePoints = 0.0; 
      }
      else
      {
        System.out.println("Error, you did not enter the correct information");
      }} // // end of graduate case
           else{ // start of undegraduate case
               	if( letterGrade == "A+")
      {
          gradePoints = 4.0;
      }
      else if ( letterGrade == "A")
      {
          gradePoints = 3.75;
      }
      else if( letterGrade == "A-")
      {
          gradePoints = 3.7; 
      }
      else if ( letterGrade == "B+")
      {
          gradePoints = 3.6;
      }
      else if( letterGrade == "B")
      {
          gradePoints = 3.5; 
      }
      else if ( letterGrade == "B-")
      {
          gradePoints = 3.4;
      }
      else if( letterGrade == "C+")
      {
          gradePoints = 3.2; 
      }
      else if ( letterGrade == "C")
      {
          gradePoints = 3;
      }
      else if( letterGrade == "D+")
      {
          gradePoints = 2.5; 
      }
      else if ( letterGrade == "D")
      {
          gradePoints = 2;
      }
      else if( letterGrade == "F")
      {
          gradePoints = 0.0; 
      }
      } // end of undegraduate case
               
           
                return gradePoints;
	}

	public boolean getGraduate(){
		return graduate;
	}

	public String getName(){
		return name;
	}

	public double getGPA(){
		return gpa;
	}


	public String toString(){
		String output = "Name: " + name + " GPA: " + gpa;
		if(graduate){
			output += "  Graduate Student";
		}
		else
			output += "  Undergraduate Student";
		return output;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * returns -1 if this student should be ordered before o
	 * returns 1 if this student should be ordered after o
	 * returns 0 if this student and o have no defined relative ordering
	 */
	public int compareTo(Student o) {
		//compare graduate vs. undergraduate
		if(this.graduate != o.getGraduate()){
			if(this.graduate == false){
				return -1;
			} else {
				return 1;
			}
		//compare GPA
		} else if(this.gpa != o.getGPA()){
			if(this.gpa < o.getGPA()){
				return 1;
			} else {
				return -1;
			}
		//compare name
		} else {
			return this.name.compareTo(o.getName());
		}
	}
}
package Sudha;

public class StringSample {
	public static void main(String[] args) {
		
		String student="Riyansh Tirumalasetti";
		System.out.println("Student name is "+student);
		
		String school="Oakridge";
		System.out.println("School name is "+school);
		
		int length=student.length();
		System.out.print("Length="+length);{

		
		String studentinfo=student.concat(school);
		System.out.println("Student info "+studentinfo);
		
		String student1="Riyansh";
		String student2="         Prahas Tirumalasetti";
		String student3="Riyansh";
		
		System.out.println(student1.replace('i','e'));
		System.out.println(student2.replace(student2, school));
		
		System.out.println(student2.trim());
		
		
		boolean result1=student1.equals(student2);
		System.out.println("Is the student1 name and student2 are same "+result1);
		
		boolean result2=student1.equalsIgnoreCase(student3);
		System.out.println("Is the student1 name and student3 aresame   "+result2);
		
		int result3=student1.compareTo(student3);
		System.out.println("Comparing the result3  "+result3);
		{
			
		 CharSequence c="Height";
		System.out.append(c);
		System.out.println("Height of the student "+c);

		}
		
		}
	
		
		
	}

}

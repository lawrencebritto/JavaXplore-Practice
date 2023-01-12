package Pratice;
public class StudentGradeAssign {
	public static void assignGrade(StudentGrade obj)
	{
		if(obj.getMarks()>=85)
		{
			obj.setGrade('A');
		}else if(obj.getMarks()<85 && obj.getMarks()>=65)
		{
			obj.setGrade('B');
		}else
		{
			obj.setGrade('C');
		}
	}
	public static void main(String[] args)
	{
		StudentGrade obj=new StudentGrade(100,"Lawrence",85,'x');
		StudentGrade obj1=new StudentGrade(101,"Pachakilli",75,'x');
		StudentGrade obj2=new StudentGrade(102,"Vettukilli",60,'x');
		assignGrade(obj);
		assignGrade(obj1);
		assignGrade(obj2);
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getMarks()+" "+obj.getGrade());
		System.out.println(obj1.getId()+" "+obj1.getName()+" "+obj1.getMarks()+" "+obj1.getGrade());
		System.out.println(obj2.getId()+" "+obj2.getName()+" "+obj2.getMarks()+" "+obj2.getGrade());
		
	}
}

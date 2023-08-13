class Ihub
{
	public String courseName()
	{
		return "Java-FSD";
	}
	public double courseFee()
	{
		return 25000d;
	}
	public String trainerName()
	{
		return "Niyaz sir";
	}
}
class Usha 
{
	public void getCourseDetails()
	{
		Ihub i=new Ihub();
		System.out.println("Course Name :"+i.courseName());
		System.out.println("Course Fee :"+i.courseFee());
		System.out.println("Trainer Name :"+i.trainerName());
	}
}
class Student21
{
	public static void main(String[] args)
	{
		Usha u=new Usha();
		u.getCourseDetails();
	}
}
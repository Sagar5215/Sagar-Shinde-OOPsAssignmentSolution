
public class SuperClassDepartment {

	static void departmentName()
	{
	System.out.println("Welcome to Super Department");
	}
	static void getTodaysWork()
	{
	System.out.println("No Work as of now ");
	}
	static void getWorkDeadline()
	{
	System.out.println("Nil");
	}
	static void isTodayAHoliday()
	{
	System.out.println("Today is not a holiday \n");
	}
	
	public static void main(String[] args) {
		
		//System.out.println("This is SuperClassDepartment ");
		//departmentName();
		//getTodaysWork();
		//getWorkDeadline();
		
		//AdminDepartment dept = new AdminDepartment();
		AdminDepartment.departmentName();
		AdminDepartment.getTodaysWork();
		AdminDepartment.getWorkDeadline();
		isTodayAHoliday();
		
		//HRDepartment hr = new HRDepartment();
		HRDepartment.departmentName();
		HRDepartment.doActivity();
		HRDepartment.getTodaysWork();
		HRDepartment.getWorkDeadline();
		isTodayAHoliday();	
		
		
		//techDepartment td = new techDepartment();
		techDepartment.departmentName();
		techDepartment.getTodaysWork();
		techDepartment.getWorkDeadline();
		techDepartment.getTechStackInformation();
		isTodayAHoliday();	

	}
	
}


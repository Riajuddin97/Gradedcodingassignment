public class Main {
	public static void main(String[] args) {
		SuperDepartment ad = new AdminDepartment();
		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());

		HrDepartment hrd = new HrDepartment();
		System.out.println("Welcome to " + hrd.departmentName());
		System.out.println(hrd.getTodaysWork());
		System.out.println(hrd.getWorkDeadline());
		System.out.println(hrd.doActivity());
		System.out.println(hrd.isTodayAHoliday());

		TechDepartment td = new TechDepartment();
		System.out.println("Welcome to " + td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());

	}
}
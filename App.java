class App {
	public static void main(String args[]){
		// Zadanie 1
		int employees = 10420;
		byte newEmployees = 10;
		
		employees = newEmployees;
		System.out.println("-----Zadanie 1-----");
		System.out.println("Employees: "+employees);
		System.out.println();
		
		// Zadanie 2
		int zakopane;
		short citizens = 27266;
		
		zakopane = citizens;
		System.out.println("-----Zadanie 2-----");
		System.out.println("Zakopane citizens: "+zakopane);
		System.out.println();
		
		// Zadanie 3
		short first = 17340;
		byte second = (byte) first;
		
		System.out.println("-----Zadanie 3-----");
		System.out.println("Second: "+second);
		System.out.println();
	}
}
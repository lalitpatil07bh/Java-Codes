package tester;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


import utils.ValidationEmployee;


import com.Employee;
import com.FullTimeEmp;
import com.PartTimeEmp;



public class TesterEmployee {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<Long, Employee> empmap=new HashMap<>();
			boolean exit=false;
			
			try
			{
				
				while(!exit)
				{
					System.out.println("1.Add Full Time Employee\n2.Add Part Time Employee\n3.Delete an employee by Emp Id\n"
							+ "4: Search employee details by Aadhaar number\n5. Display all employee details\n"
							+ "6: Display all employee details sorted by date of joining\n0. Exit");
					System.out.println("Enter the Choice");
					
				switch (sc.nextInt()) {
				case 1://Add Full Time Employee
					
					System.out.println("Enter Details: Name, Date of Joining, Phone number, Aadhar No., Salary");
					Employee FTE = ValidationEmployee.validateFTE(sc.next(), sc.next(), sc.nextLong(), sc.nextLong(), sc.nextDouble(), empmap);
					empmap.put((long) FTE.getEmpid(), FTE);
					System.out.println("Full Time Employee Added...");
					
					break;
					
				case 2://Add Part Time Employee
					
					System.out.println("String name, String doj, long phno, long aadharNo,double hourPayement");
					PartTimeEmp PTE = ValidationEmployee.validatePTE(sc.next(),sc.next(), sc.nextLong(), sc.nextLong(), sc.nextDouble(), empmap);
					empmap.put((long) PTE.getEmpid(), PTE);
					System.out.println("Part Time Employee Added....");
					break;
					
				case 3://Delete an employee by Emp Id
					
//					System.out.println("Enter the Empid to delete.");
//					Employee checkEmpid = empmap.get(sc.nextInt());
//					if(checkEmpid==null)
//						throw new Custom_Exception_Employee("Empid is not valid....");
//					empmap.remove(checkEmpid);

					int empidRemove=sc.nextInt();
					Iterator<Map.Entry<Long, Employee>> iterator = empmap.entrySet().iterator();
			        while (iterator.hasNext()) 
			        {
			          Map.Entry<Long, Employee> entry = iterator.next();
			          Employee remove = entry.getValue();
			          if(remove.getEmpid()==empidRemove)
			        	  iterator.remove();
			          System.out.println("Employee Remove from list...");
			        }
				break;
				
				case 4://Search employee details by Aadhaar number
					
					System.out.println("Enter  Addhar Num..");
					System.out.println(empmap.get(sc.nextLong()));
					
					break;
					
					
				case 5://Display all employee details
					
					for(Employee e :empmap.values())
						System.out.println(e);
					System.out.println("List is empety....");
					
				case 6://Display all employee details sorted by date of joining
					
					empmap.values().stream()
					.sorted((a,b)->a.getDoj().compareTo(b.getDoj()))
					.forEach(e-> System.out.println(e));
					
					
					break;
				
				case 0://Exit
					exit=true;
				}
					
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

/* lalit
2024-03-04
7756993539
111111111111
65000
*/
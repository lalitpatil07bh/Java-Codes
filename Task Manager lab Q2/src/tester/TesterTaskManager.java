package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.Status;
import com.TaskManager;

import custom_exception.Customer_Exception_TaskManager;
import utils.ValidationTaskManager;

public class TesterTaskManager {

	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<Integer, TaskManager> mapTask=new HashMap<>();
			boolean exit=false;
			
			try {
				
				while (!exit) 
				{
					System.out.println("1.Add Task\n2. Delete Task\n3. Update task Status\n4.Display all pending task\n"
							+ "Display All Pending task for Today\n6. Sort by taskdate\n7. Display All\n0. Exit");
					
					System.out.println("Enter the choice");
					
					switch (sc.nextInt()) {
					case 1://add All information
						
						System.out.println("String taskName, String desc, LocalDate taskDate, Status status");
						TaskManager addAllTask = ValidationTaskManager.addAllTask(sc.next(), sc.next(), sc.next(), sc.next());
						mapTask.put(addAllTask.getTaskId(), addAllTask);
						System.out.println("Information Added...");
						break;
						
					case 2://Delete a Task
						
						System.out.println("Enter the id You want to Delete");
						int delete = sc.nextInt();
						if(mapTask.containsKey(delete))
						{
							mapTask.remove(delete);	
							System.out.println("Remove Plz select option 7 to see...");
						}
						else
						{
						throw new Customer_Exception_TaskManager("TaskID is not Valid for particular input");
						}
						break;
						
					case 3: //update the task status
						
						System.out.println("Enter the id You want to Update task");
						int check=sc.nextInt();
						
						if(mapTask.containsKey(check))
						{
							System.out.println("Enter the status");
							String newStatus=sc.next();
							
							Status parseStatus = ValidationTaskManager.parseStatus(newStatus);
							mapTask.get(check).setStatus(parseStatus);
							
							System.out.println("Status Updated successful....");	
						}
						else
						{
							throw new Customer_Exception_TaskManager("Id is Not Valid.....");
						}
						break;
					case 4://display All Pending Details
						
						for(TaskManager t: mapTask.values())
						{
							if(t.getStatus()==Status.PENDING)
								System.out.println(t);
						}
						break;
						
					case 5:// Display All Pending task for Today
						
						LocalDate today=LocalDate.now();
						LocalDate oneDay=today.minusDays(1);
						
						for(TaskManager t :mapTask.values())
						{
							if(t.getTaskDate().isAfter(oneDay))
							{
								if(t.getStatus()==Status.PENDING)
									System.out.println(t);
							}
						}
						break;
						
					case 6:// Display All Task date in Sorted Manner
						
						mapTask.values().stream().sorted((a,b)->a.getTaskDate().compareTo(b.getTaskDate())).forEach(a->System.out.println(a));
						break;
						
					case 7://Display All Details
						mapTask.values().stream().forEach(i->System.out.println(i));
						break;
						
						
					case 0:
						exit=true;
						break;
					}
				}
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

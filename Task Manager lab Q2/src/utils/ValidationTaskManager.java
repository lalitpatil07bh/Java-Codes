package utils;

import java.time.LocalDate;

import com.Status;
import com.TaskManager;

public class ValidationTaskManager 
{
	public static TaskManager addAllTask(String taskName, String desc, String taskDate, String status)
	{
		LocalDate parsedate = LocalDate.parse(taskDate);
		Status parseStatus = parseStatus(status);
		return new TaskManager(taskName, desc, parsedate, parseStatus);
	}
	
	public static Status parseStatus(String status)
	{
		return Status.valueOf(status.toUpperCase());
	}
}

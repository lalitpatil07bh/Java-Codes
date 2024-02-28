package com;

import java.time.LocalDate;

public class TaskManager 
{
	private int taskId;
	private String taskName;
	private String desc;
	private LocalDate taskDate;
	private static int idCounter;
	private Status status;
	private boolean active;
	private static boolean act=true;
	static
	{
		idCounter=0;
	}
	
	public TaskManager(String taskName, String desc, LocalDate taskDate, Status status) {
		super();
		
		this.active=act;
		this.taskId=++idCounter;
		this.taskName = taskName;
		this.desc = desc;
		this.taskDate = taskDate;
		this.status = status;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		TaskManager.idCounter = idCounter;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public static boolean isAct() {
		return act;
	}

	public static void setAct(boolean act) {
		TaskManager.act = act;
	}

	@Override
	public String toString() {
		return "TaskManager [taskId=" + taskId + ", taskName=" + taskName + ", desc=" + desc + ", taskDate=" + taskDate
				+ ", status=" + status + ", active=" + active + "]";
	}
	
	
	
	
	
	
}
